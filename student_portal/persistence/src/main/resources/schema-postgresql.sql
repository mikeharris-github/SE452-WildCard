
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS course;
DROP TABLE IF EXISTS records;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS term;
DROP TABLE IF EXISTS student_auth;
DROP TABLE IF EXISTS instructor;
DROP TABLE IF EXISTS student_course_history;


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
    term VARCHAR(30),
    grade char(1),
    units int,
    courseStatus VARCHAR(20)
);

CREATE TABLE department (  
  id serial  PRIMARY KEY,
  department_name VARCHAR(3),
  campus VARCHAR(20)
);

CREATE TABLE term (
    id serial  PRIMARY KEY,
    term_name VARCHAR(30),
    course_dept VARCHAR(3),
    course_num int,
    student_name VARCHAR (50)
);

CREATE TABLE student_auth (
     id serial  PRIMARY KEY,
    username VARCHAR(10),
	password	VARCHAR(20),
	student_id	int,
	first_name	VARCHAR(20),
	last_name	VARCHAR(20)
);

CREATE TABLE instructor (
     id serial  PRIMARY KEY,
    instructor_id int,
    instructor_name VARCHAR(50),
    course  VARCHAR(7),
    email VARCHAR(50),
    office VARCHAR(10),
    start_date date,
    end_date date
);

CREATE TABLE student_course_history (
     id serial  PRIMARY KEY,
    student_id int,
    status char(1),
    course VARCHAR(20),
    start_date date,
    end_date date    
);
