-- Fixtures for Students
insert into student (id, first_name, last_name) values (default, 'hamza', 'khokhar')
insert into student (id, first_name, last_name) values (default, 'john', 'doe')
insert into student (id, first_name, last_name) values (default, 'Dumb', 'joe')
insert into student (id, first_name, last_name) values (default, 'Johnny', 'America')

-- Fixtures for Professors

insert into professor (id, first_name, last_name) values (default, 'Albert', 'Einstein')
insert into professor (id, first_name, last_name) values (default, 'Isacc', 'Newton')
insert into professor (id, first_name, last_name) values (default, 'Richard', 'Fyenman')
insert into professor (id, first_name, last_name) values (default, 'Enrico', 'Fermi')
insert into professor (id, first_name, last_name) values (default, 'Erwin', 'Schrodinger')
insert into professor (id, first_name, last_name) values (default, 'Thomas', 'Edison')
insert into professor (id, first_name, last_name) values (default, 'Nikola', 'Tesla')


-- Fixtures for Courses

insert into course (course_id, building, course_dept, course_name, credit_value, description, learning_objectives, level, max_size, min_size, room, time) values (default, 'CN building', 'PHY', 'Physics', 4, null, null, 'Sophomore', 15, 30, '1000', '10:00')
insert into course (course_id, building, course_dept, course_name, credit_value, description, learning_objectives, level, max_size, min_size, room, time) values (default, 'CN building', 'PHY', 'Physics 2', 4, null, null, 'Sophomore', 15, 30, '1000', '10:00')
insert into course (course_id, building, course_dept, course_name, credit_value, description, learning_objectives, level, max_size, min_size, room, time) values (default, 'CN building', 'PHY', 'Calculus 1', 4, null, null, 'Sophomore', 15, 30, '1001', '10:00')
insert into course (course_id, building, course_dept, course_name, credit_value, description, learning_objectives, level, max_size, min_size, room, time) values (default, 'CN building', 'PHY', 'Calculus 2', 4, null, null, 'Sophomore', 15, 30, '2012', '10:00')
insert into course (course_id, building, course_dept, course_name, credit_value, description, learning_objectives, level, max_size, min_size, room, time) values (default, 'CN building', 'PHY', 'Circuits 1', 4, null, null, 'Sophomore', 10, 15, '1020', '12:00')
insert into course (course_id, building, course_dept, course_name, credit_value, description, learning_objectives, level, max_size, min_size, room, time) values (default, 'CN building', 'PHY', 'Circuits 2', 4, null, null, 'Sophomore', 10, 15, '1020', '12:00')
insert into course (course_id, building, course_dept, course_name, credit_value, description, learning_objectives, level, max_size, min_size, room, time) values (default, 'CN building', 'PHY', 'Advanced Analog Circuits', 4, null, null, 'Sophomore', 10, 15, '1020', '12:00')



-- Fixtures for Sections


-- Fixtures for Buildings

insert into building (id, building_name, number_of_rooms) values (default, 'Science', 80)
insert into building (id, building_name, number_of_rooms) values (default, 'King Center', 60)
insert into building (id, building_name, number_of_rooms) values (default, 'Student Success', 40)
insert into building (id, building_name, number_of_rooms) values (default, 'Aviation', 50)

-- Fixtures for Semesters
