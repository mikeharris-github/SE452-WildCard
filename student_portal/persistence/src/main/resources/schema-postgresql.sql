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
    id serial  PRIMARY KEY,
    student_id VARCHAR(10),
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    major VARCHAR(20),
    faculty_advisor VARCHAR(50)
);

CREATE TABLE course (
    id serial  PRIMARY KEY,
    dept char(3),
    num int,
    description VARCHAR(50)
);

CREATE TABLE records (
    id serial  PRIMARY KEY,
    name VARCHAR(50),
    dept char(3),
    num int,
    term VARCHAR(10),
    grade char(1),
    units int,
    courseStatus char(1)
);

CREATE TABLE department (  
  id serial  PRIMARY KEY,
  department_name VARCHAR(25)
);

CREATE TABLE term (
    id serial  PRIMARY KEY,
    term_name VARCHAR(10),
    year int    
);

CREATE TABLE student_auth (
     id serial  PRIMARY KEY,
    student_id VARCHAR(10),
    password VARCHAR(50)     
);

CREATE TABLE instructor (
     id serial  PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20) 
);

CREATE TABLE students_classes (
     id serial  PRIMARY KEY,
    student_name VARCHAR(25),
    status char(1),
    course VARCHAR(20),
    start_date date,
    end_date date    
);
