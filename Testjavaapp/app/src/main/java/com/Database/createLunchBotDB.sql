--createLunchBotDB.sql
--Author: Zachary Kelvas
--CSCI 3033
--Poudel
--10/20/19

--USER TABLE
CREATE TABLE USERID
(
	userName	VARCHAR(15),
	passWord	VARCHAR(15)		NOT NULL,
	Fname		VARCHAR(15)		NOT NULL,
	Lname		VARCHAR(15)		NOT NULL,
	PRIMARY KEY(userName)
);

--RECENT TABLE
CREATE TABLE RECENT
(
	userName		VARCHAR(15),
	restName		VARCHAR(30),
	address			VARCHAR(30),
	rating			DECIMAL(5,2)	CHECK(rating >= 1.0 and rating <=5.0),
	distance		DECIMAL(5,2)	CHECK(distance >=0),
	categories		VARCHAR(15),
	FOREIGN KEY(userName) REFERENCES USERID(userName),
);

--FAVORITE TABLE
CREATE TABLE FAVORITE
(
	userName		VARCHAR(15),
	restName		VARCHAR(30),
	address			VARCHAR(30),
	rating			DECIMAL(5,2)	CHECK(rating >= 1.0 and rating <=5.0),
	distance		DECIMAL(5,2)	CHECK(distance >=0),
	categories		VARCHAR(15),
	FOREIGN KEY(userName) REFERENCES USERID(userName),
);
