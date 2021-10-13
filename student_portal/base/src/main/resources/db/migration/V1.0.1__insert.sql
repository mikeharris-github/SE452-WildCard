INSERT INTO students (student_id, first_name, last_name, major, faculty_advisor) VALUES 
            ('11101', 'Nicole', 'Emich', 'Computer Science', 'Someone'),


INSERT INTO course(dept, num, description) VALUES
            ('SE', 452, 'TEST1'),
            ('SE', 352), 'TEST2');


INSERT INTO students_classes(students_id) select id from students where stu_id like '111%';
UPDATE students_classes set course_id = (select id from course where num=452);
