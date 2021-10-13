/* required for uuid_generate_v4() function to generate UUID */
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

DROP TABLE IF EXISTS students_classes;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS course;
DROP TABLE IF EXISTS records;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS term;
DROP TABLE IF EXISTS student_auth;
DROP TABLE IF EXISTS instructor;


DROP SEQUENCE IF EXISTS hibernate_sequence;

CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE student (
    id UUID default uuid_generate_v4 (),
    student_id VARCHAR(10),
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    major VARCHAR(20),
    faculty_advisor VARCHAR(50),
    PRIMARY KEY (ID)
);

CREATE TABLE course (
    id UUID default uuid_generate_v4 (),
    dept char(3),
    num int,
    description VARCHAR(50)
    PRIMARY KEY (ID) 
);

CREATE TABLE records (
    id UUID default uuid_generate_v4 (),
    course_id UUID,
    student_id UUID,
    term VARCHAR(10),
    grade char(1),
    units int,
    courseStatus char(1)
    PRIMARY KEY (ID) 
);

CREATE TABLE department (  
  id UUID default uuid_generate_v4 (),
  department_name VARCHAR(25),
  PRIMARY KEY (ID) 
);

CREATE TABLE term (
     id UUID default uuid_generate_v4 (),
    term_name VARCHAR(10),
    year int(4)  ,
    PRIMARY KEY (ID)     
);

CREATE TABLE student_auth (
    id UUID default uuid_generate_v4 (),
    student_id VARCHAR (10),
    password VARCHAR(50)   ,
    PRIMARY KEY (ID)   
);

CREATE TABLE instructor (
    id UUID default uuid_generate_v4 (),
    first_name VARCHAR(20),
    last_name VARCHAR(20) ,
    PRIMARY KEY (ID) 
);

CREATE TABLE students_classes (
    id UUID default uuid_generate_v4 (),
    student_name VARCHAR(25),
    status char(1),
    start_date date,
    end_date date,
    course_id UUID,
    students_id UUID,
    PRIMARY KEY (ID)  
);