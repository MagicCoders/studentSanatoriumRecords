CREATE DATABASE sanatorium;

use sanatorium;

CREATE TABLE students(    
    patientID   VARCHAR(250) PRIMARY KEY NOT NULL,
    regNo VARCHAR(250),
    fname    VARCHAR(250),
    sname    VARCHAR(250),
    gender  VARCHAR(100),
    YOB DATE
);

CREATE TABLE vitals(
    vitalsID    VARCHAR(250) NOT NULL DEFAULT "Test",
    patientID VARCHAR(250),
    staffID VARCHAR(250),
    height INT(10),
    weight INT(10),
    bmi DOUBLE(10,2),
    age INT(10),
    temperature INT(10),
    physicianDateTime VARCHAR(250)
);

CREATE TABLE doctorfeed(
    doctorfeedID    VARCHAR(250) NOT NULL DEFAULT "Test",
    patientID VARCHAR(250),
    staffID VARCHAR(250),
    symptoms    VARCHAR(250),
    prognosis    VARCHAR(250),
    diagnosis   VARCHAR(250),
    prescription    VARCHAR(250),    
    doctorDateTime  VARCHAR(250)  
);

CREATE TABLE records(
    recordID    VARCHAR(250) PRIMARY KEY NOT NULL,
    patientID   VARCHAR(250) NOT NULL,
    vitalsID    VARCHAR(250) NOT NULL,
    doctorfeedID    VARCHAR(250) NOT NULL,
    patientTestID   VARCHAR(250) NOT NULL,
    dateofvisit VARCHAR(250) NOT NULL
);

CREATE TABLE tests(
    testID  VARCHAR(250) PRIMARY KEY NOT NULL,
    name    VARCHAR(250),
    testDescription VARCHAR(250),
    testDatetime    VARCHAR(250)
);

CREATE TABLE patientTests(
    patientTestID   VARCHAR(250) PRIMARY KEY NOT NULL,
    testID VARCHAR(250),
    recordID    VARCHAR(250),
    patientID   VARCHAR(250),
    staffID VARCHAR(250),
    results VARCHAR(250),
    dateTest    VARCHAR(250)
);

CREATE TABLE staff(
    staffID VARCHAR(250) PRIMARY KEY NOT NULL,
    nationalID  INT(100),
    fname   VARCHAR(250),
    sname   VARCHAR(250),
    othername   VARCHAR(250),
    pass    VARCHAR(250),
    role    VARCHAR(250),
    gender  VARCHAR(100)
);
    
        