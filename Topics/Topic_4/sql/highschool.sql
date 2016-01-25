--SQL-MySql
--Create a database named  high-school  and modelate:

--Student: first name, last name, registration number, date of birth)
--Teacher: first name, last name, date of birth)
--Course: name, assigned teacher, hours by week, schedule time (they can be dictated several times during the week)
--Notes:

--An student can assist several courses during the same year.
--A teacher can be assigned to several courses.
--For each course, each student has 3 partial notes and a final note.
--Create all relationship that you think they are required.

create database Highschool;

--tablas:

CREATE TABLE student(
  id_student INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(25) NOT NULL,
  last_name VARCHAR(20),
  birthday DATE,
  PRIMARY KEY(id_student)
);

CREATE TABLE teacher(
  id_teacher INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(25) NOT NULL,
  last_name VARCHAR(20),
  birthday DATE,
  PRIMARY KEY(id_teacher)
);

CREATE TABLE course(
  id_course INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(25) NOT NULL,
  id_teacher int,
  hrs_week int,
  PRIMARY KEY(id_course)
);

CREATE TABLE course_student(
  id_course INT NOT NULL,
  id_student INT NOT NULL,
  fst_note INT,
  scd_note int,
  trd_note int,
  fnl_note int,  
  PRIMARY KEY(id_course, id_student)
);


--relaciones

ALTER TABLE course_day
  ADD PRIMARY KEY (id_course,day_week);

ALTER TABLE course_student
  ADD PRIMARY KEY (id_course,id_student);

ALTER TABLE course
  ADD PRIMARY KEY (id_course);
  
-- datos:
INSERT INTO teacher (id_teacher, first_name, last_name, birthday) 
VALUES (NULL, cristian, caru, 2016-01-04), (NULL, gaston, abasto, 2016-01-04),(NULL, pepe, argento, 2016-01-04)

INSERT INTO `student` (`id_student`, `first_name`, `last_name`, `birthday`) VALUES
(1, 'leonardo', 'ramirez', '2016-01-13'),
(2, 'marcos', 'arcon', '2016-01-25'),
(3, 'antonio', 'sinapellido', '2016-01-13'),
(4, 'sofia', 'oliva', '2016-01-14'),
(5, 'carla', 'conte', '2016-01-05'),
(6, 'cristian', 'cronos', '2016-01-19'),
(7, 'manolo', 'lamas', '2016-01-05'),
(8, 'ariana', 'crespo', '2016-01-07'),
(9, 'ayelen', 'riquelme', '2016-01-22'),
(10, 'mario', 'bros', '2016-01-13'),
(11, 'luigi', 'bros', '2016-01-13'),
(12, 'nadia', 'herrero', '2016-01-15'),
(13, 'natalia', 'mesa', '2016-01-21'),
(14, 'alejandro', 'messi', '2016-01-15'),
(15, 'hernan', 'cuzco', '2016-01-11'),
(16, 'evelyn', 'piramar', '2016-01-09'),
(17, 'noelia', 'segovia', '2016-01-06'),
(18, 'ramiro', 'fontana', '2016-01-13'),
(19, 'juan', 'primero', '2016-01-14'),
(20, 'pablo', 'segundo', '2016-01-11'),
(21, 'vergoglio', 'papa', '2016-01-28'),
(22, 'susana', 'gime', '2016-01-15'),
(23, 'cristina', 'garcia', '2016-01-13'),
(24, 'elisabeth', 'ramos', '2016-01-15'),
(25, 'daniela', 'mitre', '2016-01-08');
(26, 'pablo', 'segundo', '2016-01-11'),
(27, 'vergoglio', 'papa', '2016-01-28'),
(28, 'susana', 'gime', '2016-01-15'),
(29, 'cristina', 'garcia', '2016-01-13'),
(30, 'elisabeth', 'ramos', '2016-01-15');


INSERT INTO `course` (`id_course`, `name`, `id_teacher`, `hrs_week`) VALUES
(1, 'JAVA', '1', '9'), 
(2, 'PHP', '2', '9'), 
(3, 'c#', '3', '9');


INSERT INTO `course_day` (`id_course`, `day_week`, `init`, `finish`) VALUES 
('1', '1', '10:00:00', '13:00:00'),
('1', '3', '12:00:00', '15:00:00'),
('1', '5', '14:00:00', '16:00:00'),
('2', '2', '13:00:00', '16:00:00'), 
('2', '3', '18:00:00', '21:00:00'), 
('2', '4', '9:00:00', '12:00:00'), 
('3', '3', '12:00:00', '15:00:00');

  
 INSERT INTO `course_student` (`id_course`, `id_student`, `fst_note`, `scd_note`, `trd_note`, `fnl_note`) VALUES
(1, 1, 5, 6, 7, 8),
(1, 2, 1, 2, 3, 4),
(1, 3, 5, 6, 7, 8),
(1, 4, 9, 10, 9, 8),
(1, 5, 7, 6, 5, 4),
(1, 6, 3, 2, 1, 10),
(1, 7, 1, 2, 3, 4),
(1, 8, 5, 6, 7, 8),
(1, 9, 9, 10, 9, 8),
(1, 10, 7, 6, 5, 4),
(2, 11, 5, 6, 7, 8),
(2, 12, 1, 2, 3, 4),
(2, 13, 5, 6, 7, 8),
(2, 14, 9, 10, 9, 8),
(2, 15, 7, 6, 5, 4),
(2, 16, 3, 2, 1, 10),
(2, 17, 1, 2, 3, 4),
(2, 18, 5, 6, 7, 8),
(2, 19, 9, 10, 9, 8),
(2, 20, 7, 6, 5, 4),
(3, 21, 5, 6, 7, 8),
(3, 22, 1, 2, 3, 4),
(3, 23, 5, 6, 7, 8),
(3, 24, 9, 10, 9, 8),
(3, 25, 7, 6, 5, 4),
(3, 26, 3, 2, 1, 10),
(3, 27, 1, 2, 3, 4),
(3, 28, 5, 6, 7, 8),
(3, 29, 9, 10, 9, 8),
(3, 30, 7, 6, 5, 4); 


--ejercicios:



--3. List students and teachers for a given course.
SELECT c.name, t.first_name, t.last_name, s.first_name, s.last_name
from teacher t, course c, student s, course_student cs 
WHERE t.id_teacher = c.id_teacher 
and c.id_course = cs.id_course 
and s.id_student = cs.id_student
and c.id_course = 1
ORDER BY s.last_name;

--5. For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name.
SELECT t.first_name, t.last_name, cd.day_week, cd.init, cd.finish, c.name
FROM teacher t,course c, course_day cd
WHERE t.id_teacher = 1 
AND c.id_teacher = t.id_teacher 
AND cd.id_course = c.id_course;

-- I could not taste the next query, but should works
SELECT
  t.first_name,
  t.last_name,
  CASE cd.day_week WHEN 1 THEN 'Monday' END AS days,
  WHEN 2 THEN 'TUESDAY' END AS days,
  WHEN 3 THEN 'WEDNESDAY' END AS days,
  WHEN 4 THEN 'THURSDAY' END AS days,
  WHEN 5 THEN 'FRIDAY' END AS days,
  ELSE NULL END AS 'day',
  cd.init,
  cd.finish,
  c.name
FROM
  teacher t,
  course c,
  course_day cd
WHERE
  t.id_teacher = 1 AND c.id_teacher = t.id_teacher AND cd.id_course = c.id_course;

