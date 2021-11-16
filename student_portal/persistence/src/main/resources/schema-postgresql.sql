
DROP TABLE IF EXISTS student CASCADE;
DROP TABLE IF EXISTS course CASCADE;
DROP TABLE IF EXISTS records CASCADE;
DROP TABLE IF EXISTS department CASCADE;
DROP TABLE IF EXISTS term CASCADE;
DROP TABLE IF EXISTS authority CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS users_authority CASCADE;
DROP TABLE IF EXISTS instructor CASCADE;
DROP TABLE IF EXISTS student_course_history CASCADE;


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
    course_status VARCHAR(20)
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

create table authority (
    id serial primary key,
    name varchar(15)
);

create table users (
    id serial primary key,
    username varchar(15),
    password varchar(80),
    date_created timestamp default current_timestamp
);

create table users_authority (
    authority_id int,
    user_id int
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
