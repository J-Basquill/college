

DROP TABLE IF EXISTS Lab8_Stores,LAB8_PRODUCTS,Lab8_Sells CASCADE;

create table Lab8_Stores (
	StoreID VARCHAR,
	StoreName TEXT NOT NULL,
	StoreAddress TEXT NOT NULL,
	StoreManager TEXT NOT NULL,
	StoreState TEXT NOT NULL,
	StoreRating TEXT NOT NULL,
	CONSTRAINT Lab8_Stores_PKEY PRIMARY KEY (StoreID)
);
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('FF6708', 'Geba', '201 Shopko Drive', 'Rena Freddi', 'New York', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('OE08RZ', 'Twimm', '07824 Roxbury Drive', 'Jaine Cabera', 'Washington', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('DW73Y5', 'Twimbo', '5 Haas Park', 'Jourdan Peidro', 'Colorado', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('FK15V3', 'Edgewire', '6672 Ronald Regan Court', 'Quentin Morrid', 'California', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('JX85RN', 'Browsebug', '8281 Southridge Drive', 'Cayla Sly', 'Georgia', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('NX06C3', 'Youopia', '9736 Welch Junction', 'Tito Feavyour', 'Minnesota', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('IT11LD', 'Blogpad', '59 West Point', 'Xerxes Saller', 'Illinois', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('BJ732P', 'Talane', '68 Donald Avenue', 'Davida Szanto', 'Pennsylvania', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('LA921I', 'Browseblab', '61 Ridge Oak Hill', 'Talya Norgate', 'District of Columbia', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('LL151V', 'Yombu', '20550 Clemons Park', 'Cecilius Snedden', 'District of Columbia', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('MK80LV', 'Meevee', '39 Buhler Plaza', 'Niles Shemilt', 'District of Columbia', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('ZQ755D', 'Brainverse', '13 New Castle Drive', 'Carlyn Simonnin', 'Wisconsin', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('MZ32LX', 'Yambee', '7 Pond Circle', 'Abby Eccleston', 'Florida', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('QP99Q3', 'Dabshots', '2467 Mallard Park', 'Lou Plan', 'California', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('AI047R', 'Skimia', '90732 Dixon Pass', 'Winnifred Denzilow', 'Hawaii', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('LM608C', 'Lazzy', '27168 Anzinger Trail', 'Caresse Gitsham', 'Kansas', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('WB32B9', 'Oodoo', '347 Village Green Trail', 'Sidoney Benck', 'Illinois', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('JL222T', 'Photojam', '25324 Pankratz Crossing', 'Randolf Alexis', 'Wisconsin', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('UL42C6', 'Tambee', '7 Orin Street', 'Tripp McClay', 'Maryland', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('JG47I3', 'Meevee', '64115 Hanover Place', 'Wallis Lelievre', 'Hawaii', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('MY84MO', 'Dabtype', '861 Luster Point', 'Micaela Sirett', 'Ohio', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('BB880T', 'Youbridge', '878 2nd Parkway', 'Bryant Gniewosz', 'Nebraska', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('QO4417', 'Lazzy', '39 Rockefeller Circle', 'Bartolemo Sergent', 'Tennessee', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('KD982A', 'Realpoint', '08 Blue Bill Park Avenue', 'Harriet Tremontana', 'South Dakota', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('ZJ36L6', 'Lazz', '5 Grayhawk Alley', 'Veronike Stratford', 'California', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('XT92EZ', 'Tagchat', '325 Bobwhite Center', 'Kermit Davidsen', 'Missouri', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('VV20E9', 'Oloo', '50357 Larry Road', 'Brigida Novik', 'South Carolina', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('FB52N1', 'Jaxnation', '73 Tomscot Plaza', 'Rog Jeyness', 'District of Columbia', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('CQ3431', 'Voomm', '47 Pennsylvania Way', 'April Blazek', 'Colorado', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('ZE093Z', 'Twinte', '611 Atwood Plaza', 'Krisha Joye', 'Florida', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('BZ36RD', 'Eimbee', '720 Eliot Park', 'Hinze Rutledge', 'Florida', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('MC05RS', 'Lazz', '0344 Fremont Plaza', 'Carolyn Maton', 'Tennessee', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('IP07AN', 'Talane', '73 Reindahl Terrace', 'Clarice McElhinney', 'Oklahoma', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('EO57E4', 'Wordware', '5642 Summit Drive', 'Pollyanna Boobyer', 'California', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('SS844S', 'Vidoo', '5 Florence Pass', 'La verne Winspar', 'California', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('VI53B7', 'Meejo', '061 Mifflin Avenue', 'Ola Signoret', 'New York', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('QI39ZC', 'Wordware', '854 Gateway Alley', 'Paolo Blamey', 'Missouri', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('EA37QE', 'Yamia', '6 Grayhawk Junction', 'Craig Gilardengo', 'Nevada', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('JT63M0', 'Babbleset', '73 Iowa Hill', 'Susannah Worboys', 'Michigan', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('AS64SB', 'Ntags', '97946 Badeau Center', 'Sibbie Glasscoo', 'Florida', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('ZX68H7', 'Kamba', '9372 Corscot Drive', 'Tabina Somersett', 'District of Columbia', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('MQ5571', 'Kaymbo', '1 Toban Street', 'Olivero Hansman', 'District of Columbia', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('FQ81T5', 'Npath', '39 Maple Court', 'Rosina Kembery', 'California', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('IP62FK', 'Gabcube', '419 Algoma Crossing', 'Lolita McVie', 'Alabama', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('DT91F5', 'Meeveo', '3 Village Hill', 'Egor Scotfurth', 'New York', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('EE59GR', 'Zoomdog', '17 John Wall Terrace', 'Lani Maslen', 'California', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('YK67IA', 'Twitterbridge', '561 Chive Point', 'Sara Wolstenholme', 'New York', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('BD12JA', 'Flipopia', '61 Independence Alley', 'Nikolia Winsom', 'West Virginia', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('JU76LJ', 'Ntag', '3728 Barnett Circle', 'Dagny Timcke', 'New York', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('VD56BB', 'Tagpad', '2460 2nd Trail', 'Kati Onion', 'Georgia', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('UG67C0', 'Fivebridge', '3 Mockingbird Junction', 'Ernesto Ramsby', 'Arkansas', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('DX98I9', 'Janyx', '06594 Johnson Place', 'Martina Segrave', 'West Virginia', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('KD98SK', 'Brainlounge', '810 Glendale Circle', 'Ginnie Gerrish', 'Texas', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('TO59SZ', 'Eadel', '9 Fuller Point', 'Udale Soaper', 'Kentucky', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('AE99DS', 'Kwimbee', '07353 Summer Ridge Drive', 'Torry Coram', 'Florida', 'Very Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('BM49DV', 'Buzzbean', '1504 Lakewood Gardens Junction', 'Burgess Quiney', 'Missouri', 'Average');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('OQ88KA', 'Quatz', '63336 6th Hill', 'Giralda Cough', 'Ohio', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('YV242D', 'Kamba', '38 Longview Road', 'Annice Rubie', 'Minnesota', 'Excellent');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('TB19DV', 'Mynte', '44144 Goodland Crossing', 'Barrie Mcmanaman', 'Oklahoma', 'Good');
insert into Lab8_Stores (StoreID, StoreName, StoreAddress, StoreManager, StoreState, StoreRating) values ('EU764F', 'Vimbo', '0209 La Follette Road', 'Maxi Manketell', 'Pennsylvania', 'Good');


CREATE TABLE Lab8_Products (
	ProductID VARCHAR NOT NULL,
	ProductName TEXT NOT NULL,
	Price REAL NOT NULL,
	RATING REAL NOT NULL,
	Reviews INTEGER NOT NULL,
	Ranking INTEGER NOT NULL,
	CONSTRAINT Products_PKEY PRIMARY KEY (ProductID)

);

INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('A7H', 'SanDisk 32GB Ultra Class Memory Card', 13.9499998, 4.5, 8968, 1);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('GHJ4', 'Sony XB950B1 Extra Bass Wireless Headphones with App Control', 148, 3.9000001, 34502, 2);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('HG4D', 'iRobot Roomba 652 Robotic Vacuum Cleaner', 376, 4.69999981, 19741, 3);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('JK34', 'Anker Bluetooth SoundBuds Headphones', 23.9899998, 4.30000019, 6895, 4);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('KL4', 'Kindle Paperwhite', 189.990005, 4.5, 17233, 5);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('9JK', 'Fire TV Stick with Alexa Voice Remote', 39.9900017, 4.0999999, 23913, 6);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('92WD', 'Importer520 16-Foot Premium Active USB 2.0 Extender Cable with Built-In Signal Booster Chips', 7.94999981, 3.79999995, 42236, 7);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('NM3', 'Oral-B Pro 7000 SmartSeries Electric Toothbrush with Bluetooth Connectivity', 109.959999, 3.20000005, 23614, 8);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('NMA2', 'TaoTronics Dimmable LED Desk Lamp with USB Charging Port and 5 Color Temperatures and Brightness Levels', 29.9899998, 3.0999999, 13114, 9);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('17RUN', 'Fitbit Flex Wireless Activity   Sleep Wristband', 95, 4.80000019, 12948, 10);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('SURF1', 'ARRIS SURFboard', 88.8799973, 4.4000001, 2654, 11);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('Scale189', 'EatSmart Precision Digital Bathroom Scale', 107.75, 2.29999995, 5332, 12);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('JLPS', 'OtterBox Defender Series Case and Holster for iPhone', 19.9500008, 3.79999995, 31284, 13);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('IFHSI', 'HSI Professional Ceramic Tourmaline Ionic Flat Iron', 33.9500008, 3.4000001, 22927, 14);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('Ixcc12', 'iXCC Certified Lightning Cable for iPhones', 5.98999977, 2.9000001, 32040, 15);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('HNM89', 'All-New Fire 7 Kids Edition Tablet 7inch Display', 99.9899979, 4.4000001, 41316, 16);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('DHJ4', 'Anker 4-Port USB 3.0 Ultra Slim Data Hub for Macbook', 4.98999977, 4.4000001, 3814, 17);
INSERT INTO lab8_products (productid, productname, price, rating, reviews, ranking) VALUES ('JKFN', 'TCL 55S405 55-Inch 4K Ultra HD Roku Smart LED TV', 401, 4.80000019, 27187, 18);



	
	CREATE TABLE Lab8_Sells (
		StoreID VARCHAR NOT NULL References Lab8_Stores (StoreID) ON UPDATE CASCADE ON DELETE CASCADE,
		ProductID VARCHAR NOT NULL References Lab8_Products (ProductID) ON UPDATE CASCADE ON DELETE CASCADE,
		CONSTRAINT Lab8_Sells_PK PRIMARY KEY (StoreID,ProductID)	
	);
	
	

INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','FQ81T5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','OE08RZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','XT92EZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','LM608C');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','XT92EZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','MK80LV');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('KL4','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('IFHSI','BZ36RD');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NMA2','DX98I9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','UG67C0');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','AS64SB');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','TO59SZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('KL4','ZQ755D');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','BJ732P');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','QP99Q3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HG4D','KD982A');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','IP07AN');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','QP99Q3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','XT92EZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','ZX68H7');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','OE08RZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','ZE093Z');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','FF6708');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','FK15V3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('KL4','ZJ36L6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','JT63M0');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','LL151V');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','EU764F');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','YV242D');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','BJ732P');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','QO4417');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('IFHSI','QI39ZC');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','KD98SK');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','TO59SZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','FK15V3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','FQ81T5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','IP07AN');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','DX98I9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','JU76LJ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','KD98SK');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','EO57E4');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','OE08RZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('KL4','AE99DS');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','TO59SZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','UL42C6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','ZX68H7');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','JG47I3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','ZX68H7');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','OQ88KA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','EE59GR');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','UL42C6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','JU76LJ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('IFHSI','MZ32LX');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','EU764F');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','LM608C');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HG4D','QO4417');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','LL151V');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','MZ32LX');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','LL151V');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','JT63M0');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','QO4417');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','IP07AN');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','EA37QE');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NMA2','IT11LD');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','VI53B7');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','QI39ZC');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','YK67IA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','MC05RS');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','FF6708');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','ZQ755D');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','MK80LV');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HG4D','XT92EZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NMA2','EE59GR');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','BD12JA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','KD982A');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','MQ5571');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','YK67IA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','LM608C');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','IT11LD');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','ZJ36L6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','VD56BB');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','DX98I9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','OQ88KA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','MQ5571');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','MQ5571');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','LM608C');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HG4D','DW73Y5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','EO57E4');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','KD982A');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','MC05RS');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','ZQ755D');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','MC05RS');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','DT91F5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','AS64SB');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','YV242D');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','UL42C6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','JU76LJ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','VV20E9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HG4D','QI39ZC');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','YK67IA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','TO59SZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NMA2','JG47I3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','JG47I3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','DX98I9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','BM49DV');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','BD12JA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','IP62FK');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','EE59GR');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','JX85RN');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','KD98SK');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','EA37QE');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','IT11LD');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','WB32B9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','LL151V');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','ZX68H7');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','JX85RN');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HG4D','YK67IA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','OE08RZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','QI39ZC');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','FK15V3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','KD98SK');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','FQ81T5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','MK80LV');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','ZJ36L6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','MZ32LX');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','LM608C');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','UG67C0');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','QO4417');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','VV20E9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','AE99DS');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','MK80LV');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','VD56BB');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','OQ88KA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','DT91F5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','JT63M0');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('KL4','MK80LV');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','VD56BB');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','JG47I3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HG4D','YV242D');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','VV20E9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NMA2','VI53B7');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','MZ32LX');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','CQ3431');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','NX06C3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','BD12JA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','KD982A');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','MC05RS');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','DT91F5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','JU76LJ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','DX98I9');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','MZ32LX');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','KD982A');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NMA2','IP07AN');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','EE59GR');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','KD982A');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NMA2','TB19DV');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','IP62FK');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','FK15V3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','DW73Y5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','FF6708');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','UG67C0');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','ZE093Z');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','ZE093Z');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','MY84MO');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','JG47I3');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','DW73Y5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','LA921I');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HG4D','AI047R');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','BM49DV');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','EU764F');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','JU76LJ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JKFN','MQ5571');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','ZJ36L6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','EU764F');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','OE08RZ');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('DHJ4','VI53B7');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('92WD','MY84MO');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','MC05RS');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('NM3','ZQ755D');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('A7H','IP07AN');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('9JK','EE59GR');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','AE99DS');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','DW73Y5');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','ZQ755D');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JLPS','ZX68H7');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('HNM89','ZJ36L6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('GHJ4','FB52N1');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('SURF1','YK67IA');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','JL222T');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('JK34','BB880T');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Scale189','IP62FK');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('Ixcc12','VD56BB');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('IFHSI','ZJ36L6');
INSERT INTO Lab8_Sells (ProductID,StoreID) VALUES ('17RUN','QI39ZC');

