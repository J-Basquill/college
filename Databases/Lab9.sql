DROP TABLE IF EXISTS Lab9_Station, Lab9_Pollutant;

CREATE TABLE Lab9_Station(
EIONetCode TEXT NOT NULL,
Station TEXT NOT NULL,
Status TEXT NOT NULL,
CONSTRAINT Lab9_Station_PK PRIMARY KEY (EIONetCode)
);

INSERT INTO Lab9_Station VALUES ('IE0145A', 'Mayo Claremorris', 'Rural-Remote');
INSERT INTO Lab9_Station VALUES ('IE0028A', 'Dublin Rathmines', 'Urban');
INSERT INTO Lab9_Station VALUES ('IE0125A', 'Galway City', 'Suburban');
INSERT INTO Lab9_Station VALUES ('IE0111A', 'Laois Emo Court', 'Rural-Regional');
INSERT INTO Lab9_Station VALUES ('IE0090A', 'Monaghan Kilkitt', 'Rural-Regional');
INSERT INTO Lab9_Station VALUES ('IE0147A', 'Kilkenny Seville Lodge', 'Suburban');


CREATE TABLE Lab9_Pollutant(
EEAPol INTEGER NOT NULL,
Pollutant TEXT NOT NULL,
Notation TEXT NOT NULL,
CONSTRAINT Lab9_Pollutant_PK PRIMARY KEY (EEAPol)
);

INSERT INTO Lab9_Pollutant VALUES (1, 'Sulphur Dioxide (air)', 'SO2');
INSERT INTO Lab9_Pollutant VALUES (10, 'Carbon Monoxide (air)', 'CO');
INSERT INTO Lab9_Pollutant VALUES (7, 'Ozone (air)', 'O3');
INSERT INTO Lab9_Pollutant VALUES (8, 'Nitrogen Dioxide (air)', 'NO2');
INSERT INTO Lab9_Pollutant VALUES (5, 'Particulate matter < 10 (aersol)', 'PM10');
INSERT INTO Lab9_Pollutant VALUES (6001, 'Particulate matter < 2.5 (aersol)', 'PM2.5');

CREATE TABLE Lab9_Monitors(
EIONetCode TEXT NOT NULL REFERENCES Lab9_Station(EIONetCode) ON DELETE CASCADE ON UPDATE CASCADE,
EEAPol INTEGER NOT NULL REFERENCES Lab9_Pollutant(EEAPol) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT Lab9_Monitors_PK PRIMARY KEY (EIONetCode, EEAPol)
);

INSERT INTO Lab9_Monitors VALUES ('IE0028A',1);
INSERT INTO Lab9_Monitors VALUES ('IE0028A',10);
INSERT INTO Lab9_Monitors VALUES ('IE0028A',7);
INSERT INTO Lab9_Monitors VALUES ('IE0028A',8);
INSERT INTO Lab9_Monitors VALUES ('IE0028A',5);
INSERT INTO Lab9_Monitors VALUES ('IE0028A',6001);
INSERT INTO Lab9_Monitors VALUES ('IE0145A',7);
INSERT INTO Lab9_Monitors VALUES ('IE0145A',8);
INSERT INTO Lab9_Monitors VALUES ('IE0145A',5);
INSERT INTO Lab9_Monitors VALUES ('IE0145A',6001);
INSERT INTO Lab9_Monitors VALUES ('IE0111A',7);
INSERT INTO Lab9_Monitors VALUES ('IE0111A',8);
INSERT INTO Lab9_Monitors VALUES ('IE0111A',5);
INSERT INTO Lab9_Monitors VALUES ('IE0111A',6001);
INSERT INTO Lab9_Monitors VALUES ('IE0090A',7);
INSERT INTO Lab9_Monitors VALUES ('IE0090A',8);
INSERT INTO Lab9_Monitors VALUES ('IE0090A',5);
INSERT INTO Lab9_Monitors VALUES ('IE0090A',6001);
INSERT INTO Lab9_Monitors VALUES ('IE0125A',1);
INSERT INTO Lab9_Monitors VALUES ('IE0125A',8);
INSERT INTO Lab9_Monitors VALUES ('IE0125A',5);
INSERT INTO Lab9_Monitors VALUES ('IE0125A',6001);
INSERT INTO Lab9_Monitors VALUES ('IE0147A',1);
INSERT INTO Lab9_Monitors VALUES ('IE0147A',8);
INSERT INTO Lab9_Monitors VALUES ('IE0147A',5);
INSERT INTO Lab9_Monitors VALUES ('IE0147A',6001);


SELECT * FROM Lab9_Station;
SELECT * FROM Lab9_Pollutant;
SELECT * FROM Lab9_Monitors;

SELECT * FROM Lab9_Station AS S, Lab9_Pollutant AS P, Lab9_Monitors AS M
WHERE (S.EIONetCode=M.EIONetCode) AND (P.EEAPol=M.EEAPol);

ALTER TABLE Lab9_Monitors ADD COLUMN Frequency TEXT;

BEGIN;
UPDATE Lab9_Monitors SET Frequency = 'Hourly' WHERE EEAPol != 5 AND EEAPol != 6001;
UPDATE Lab9_Monitors SET Frequency = 'Daily' WHERE EEAPol = 5 OR EEAPol = 6001;
ROLLBACK;
COMMIT;
END;

BEGIN;
DELETE FROM Lab9_Monitors WHERE Frequency = 'Daily';
ROLLBACK;

SELECT Lab9_Station.EIONetCode,Lab9_Station.Station,Lab9_Station.Status,Lab9_Monitors.Frequency,Lab9_Pollutant.EEAPol,Lab9_Pollutant.Pollutant
FROM Lab9_Station,Lab9_Monitors,Lab9_Pollutant
where (Lab9_Station.EIONetCode = Lab9_Monitors.EIONetCode) and (Lab9_Pollutant.EEAPol = Lab9_Monitors.EEAPol);