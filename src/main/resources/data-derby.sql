-- Fixtures for Students
insert into student (id, first_name, last_name) values (default, 'John', 'Doe')
insert into student (id, first_name, last_name) values (default, 'Jim', 'Johnson')
insert into student (id, first_name, last_name) values (default, 'Lewis', 'Smith')

-- Fixtures for Professors
insert into professor (id, first_name, last_name) values (default, 'Albert', 'Einstein')
insert into professor (id, first_name, last_name) values (default, 'Isacc', 'Newton')
insert into professor (id, first_name, last_name) values (default, 'Thomas', 'Edison')

-- Fixtures for Buildings
insert into building (id, building_name, number_of_rooms) values (default, 'Science', 80)
insert into building (id, building_name, number_of_rooms) values (default, 'King Center', 60)
insert into building (id, building_name, number_of_rooms) values (default, 'Student Success', 40)

-- Fixtures for Courses
insert into course (course_id, course_name, course_number, course_dept, credit_value, level, description, learning_objectives)values (default, 'Calculus', 'MTH-1410', 'MT', 4, 'Freshman', 'description', 'learning_objectives')
insert into course (course_id, course_name, course_number, course_dept, credit_value, level, description, learning_objectives)values (default, 'Software Engineering', 'CS-3250', 'CS', 4, 'Junior', 'description', 'learning_objectives')
insert into course (course_id, course_name, course_number, course_dept, credit_value, level, description, learning_objectives)values (default, 'Computer Science 1', 'CS-1010', 'CS', 4, 'Freshman', 'description', 'learning_objectives')

-- Fixtures for Sections
-- insert into sections (ID, course_name, section_number, professor, building_name, room) values (default, 'Calculus', '001', 'Einstein', 'Science', '1010')
-- insert into sections (ID, course_name, section_number, professor, building_name, room) values (default, 'Software Engineering', '001', 'Newton', 'Aviation', '240')
-- insert into sections (ID, course_name, section_number, professor, building_name, room) values (default, 'Computer Science', '001', 'Edison', 'King Center', '3200')

-- Fixtures for Semesters
insert into semester (id, semester_name, start_date, end_date) values (default, 'Fall', '12-12-2017', '12-12-2017')
insert into semester (id, semester_name, start_date, end_date) values (default, 'Spring', '12-12-2017', '12-12-2017')
insert into semester (id, semester_name, start_date, end_date) values (default, 'Spring', '12-12-2017', '12-12-2017')

