-- Security
INSERT INTO authority(name, id) VALUES ('ROLE_ADMIN', 1);
INSERT INTO authority(name, id) VALUES ('ROLE_USER', 2);
INSERT INTO users_authority(authority_id, user_id) VALUES (1, 1);
INSERT INTO users_authority(authority_id, user_id) VALUES (2, 2);
INSERT INTO users(id,username, password ) VALUES (1,'wildcard', '$2a$04$5rU5L.Cn7wpvYMzmv6KyUOZ4n4ffa2HULGoMZy9sxBCgnPbUHpwzu');

INSERT INTO student (student_id, first_name, last_name, major, faculty_advisor) VALUES ('1234551', 'Nicole', 'Emich', 'Computer Science', 'Someone');
INSERT INTO student (student_id, first_name, last_name, major, faculty_advisor) VALUES ('2203925', 'John', 'Smith', 'Computer Science', 'Willy Wonka');
INSERT INTO student (student_id, first_name, last_name, major, faculty_advisor) VALUES ('3312052', 'Chris', 'Johnson', 'Software Engineering', 'Oprah Winfrey');
INSERT INTO student (student_id, first_name, last_name, major, faculty_advisor) VALUES ('9489211', 'Sarah', 'Ferns', 'Computer Science', 'Candace Parker');

INSERT INTO records (name, dept, num,  term, grade,  units, course_status) VALUES ('John Smith', 'CSC', 401, '2021-2022 Autumn' , '', 4, 'Enrolled');
INSERT INTO records (name, dept, num,  term, grade,  units, course_status) VALUES ('Jane Doe', 'CSC', 402,'2020-2021 Winter', 'B',  4, 'Taken');

INSERT INTO department(department_name, campus) VALUES ('CSC', 'Loop');
INSERT INTO department(department_name, campus) VALUES ('SE', 'Lincoln Park');

INSERT INTO term(term_name, course_dept, course_num, student_name) VALUES ('2020-2021 Winter', 'CSC', '421', 'Sarah Ferns');
INSERT INTO term(term_name, course_dept, course_num, student_name) VALUES ('2020-2021 Winter', 'SE', '450', 'Sarah Ferns');
INSERT INTO term(term_name, course_dept, course_num, student_name) VALUES ('2020-2021 Autumn', 'SE', '433', 'Sarah Ferns');
INSERT INTO term(term_name, course_dept, course_num, student_name) VALUES ('2020-2021 Spring', 'CSC', '401', 'Chris Johnson');
INSERT INTO term(term_name, course_dept, course_num, student_name) VALUES ('2020-2021 Summer', 'SE', '433', 'Chris Johnson');


INSERT INTO instructor(instructor_id, instructor_name, course, email, office, start_date, end_date) VALUES (765435, 'Robert Brown', 'SE 400', 'rbrown@mail.edu', '10a', '08/01/2020', '12/15/2020');
INSERT INTO instructor(instructor_id, instructor_name, course, email, office, start_date, end_date) VALUES (764980, 'Mary Jones', 'SE 401', 'mjones@mail.edu', '6d', '08/01/2020', '12/15/2020');
INSERT INTO instructor(instructor_id, instructor_name, course, email, office, start_date, end_date) VALUES (789567, 'George Mills', 'CSC 402', 'gmills@mail.edu', '2b', '08/01/2020', '12/15/2020');

INSERT INTO student_course_history(student_id, course, status, start_date, end_date) VALUES (1234551, 'SE 400', 'E', '09/01/2021', '12/01/2021');
INSERT INTO student_course_history(student_id, course, status, start_date, end_date) VALUES (1234551, 'SE 410', 'D', '09/01/2021', '12/01/2021');


