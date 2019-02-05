CREATE DATABASE sanatorium;

use sanatorium;

DROP TABLE IF EXISTS `users`;

CREATE TABLE users (
    userID int NOT NULL PRIMARY KEY,
    name varchar(255),
    password varchar(255),
    staffID varchar(255),
    email varchar(255), 
    role varchar(255)
);

DROP TABLE IF EXISTS `student`;
CREATE TABLE student(
    regNO varchar(255) NOT NULL PRIMARY KEY,
    patientID  varchar(255),
    name  varchar(255),
    gender varchar(11)
);

DROP TABLE IF EXISTS `patientRecords`;
CREATE TABLE patientRecords(
    patientID  varchar(255) PRIMARY KEY,
    height int,
    age int,
    weight int,
    doctor  varchar(255),
    prognosis  varchar(255),
    diagnosis  varchar(255),
    tests  varchar(255),
    prescription  varchar(255),
    date DATETIME,
    temperature int
);
