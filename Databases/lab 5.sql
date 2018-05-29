DROP TABLE IF EXISTS maynooth_speed;

CREATE TABLE maynooth_speed
(instance serial NOT NULL,
car_reg text NOT NULL,
travel_dir text NOT NULL,
num_occ int NOT NULL,
ent_time timestamp NOT NULL,
ex_time timestamp NOT NULL,
CONSTRAINT maynooth_speed_pkey PRIMARY KEY (instance)
);

INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('171-KE-2980', 'Eastbound', 3, '2017/01/01 15:15:30', '2017/01/01 15:17:50');
INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('161-CD-987', 'Westbound', 1, '2017/02/13 04:30:20', '2017/02/13 04:31:40');
INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('J19-CS130', 'Eastbound', 4, '2017/05/31 18:00:00', '2017/05/31 18:02:40');
INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('12-WD-1767', 'Westbound', 2, '2017/06/07 07:40:10', '2017/06/07 07:41:50');

INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('12-WD-1767', 'Eastbound', 2, '2017/06/07 14:59:00', '2017/06/07 15:00:50');

--TRUNCATE maynooth_speed;

--DELETE FROM maynooth_speed;

ALTER TABLE maynooth_speed ADD COLUMN Speeding varchar(30);
UPDATE maynooth_speed SET Speeding = NULL;

INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('161-KE-1234', 'Eastbound', 2, '2017/10/26 13:45:00', '2017/10/26 13:48:00');
INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('171-D-9988', 'Eastbound', 2, '2017/10/26 13:46:00', '2017/10/26 13:49:00');
INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('161-KE-1234', 'Westbound', 2, '2017/10/26 15:45:00', '2017/10/26 15:47:30');
INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('171-D-9988', 'Westbound', 2, '2017/10/26 15:46:00', '2017/10/26 15:48:30');

INSERT INTO maynooth_speed (car_reg, travel_dir, num_occ, ent_time, ex_time)
VALUES ('10-MO-1167', 'Westbound', 1, '2017/10/22 02:46:55', '2017/10/22 02:47:30');

SELECT * FROM maynooth_speed WHERE ((ex_time - ent_time) < '00:02:00');

UPDATE maynooth_speed SET speeding = 'Speeding' WHERE ((ex_time - ent_time) < '00:02:00');


SELECT* FROM maynooth_speed;