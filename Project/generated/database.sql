DROP TABLE IF EXISTS 'PERSON';

CREATE TABLE 'PERSON'(
	'Person_Name' VARCHAR(250) NOT NULL,
	'Person_Age' INT NOT NULL,
	'Person_Height' FLOAT(5) NOT NULL,
	'Person_Bold' BOOL NOT NULL,
	PRIMARY KEY (Person_Name));

DROP TABLE IF EXISTS 'SPEAKER';

CREATE TABLE 'SPEAKER'(
	'Speaker_Model' VARCHAR(250) NOT NULL,
	'Speaker_Power' FLOAT(5) NOT NULL,
	'Speaker_NumOfSpeakers' INT NOT NULL,
	PRIMARY KEY (Speaker_Model),
	FOREIGN KEY (Car_Plate) REFERENCES CAR(Car_Plate),
	FOREIGN KEY (Person_Name) REFERENCES PERSON(Person_Name));

DROP TABLE IF EXISTS 'CAR';

CREATE TABLE 'CAR'(
	'Car_NumOfWheels' INT NOT NULL,
	'Car_Brand' VARCHAR(250) NOT NULL,
	'Car_Plate' VARCHAR(250) NOT NULL,
	PRIMARY KEY (Car_Plate),
	FOREIGN KEY (Person_Name) REFERENCES PERSON(Person_Name));
