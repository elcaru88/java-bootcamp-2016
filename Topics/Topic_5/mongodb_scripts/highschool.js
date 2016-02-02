/*
crete a database
*/
use highschool

/*
 teachers data
*/
	var teacher1 = {id_teacher: 1, first_name: 'cristian', last_name: 'caru', birthday: new Date()}
	var teacher2 = {id_teacher: 2, first_name: 'gaston', last_name: 'abst', birthday: new Date()}
	var teacher3 = {id_teacher: 3, first_name: 'pepe', last_name: 'argento', birthday: new Date()}

/*
data notes
*/
var cse_st1={ id_course:1, fst_note:5,scd_note:6,trd_note:4,fnl_note:4}
var cse_st2={ id_course:1,fst_note:6,scd_note:7,trd_note:2,fnl_note:4}
var cse_st3={ id_course:1,fst_note:7,scd_note:7,trd_note:4,fnl_note:3}
var cse_st4={ id_course:1,fst_note:8,scd_note:6,trd_note:5,fnl_note:4}
var cse_st5={ id_course:1,fst_note:9,scd_note:8,trd_note:6,fnl_note:3}
var cse_st6={ id_course:1,fst_note:0,scd_note:4,trd_note:3,fnl_note:2}
var cse_st7={ id_course:1,fst_note:1,scd_note:5,trd_note:6,fnl_note:1}
var cse_st8={ id_course:1,fst_note:2,scd_note:1,trd_note:7,fnl_note:5}
var cse_st9={ id_course:1,fst_note:3,scd_note:10,trd_note:6,fnl_note:10}
var cse_st10={ id_course:1,fst_note:4,scd_note:1,trd_note:2,fnl_note:9}
var cse_st11={ id_course:2,fst_note:5,scd_note:2,trd_note:10,fnl_note:9}
var cse_st12={ id_course:2,fst_note:6,scd_note:3,trd_note:9,fnl_note:8}
var cse_st13={ id_course:2,fst_note:7,scd_note:4,trd_note:3,fnl_note:7}
var cse_st14={ id_course:2,fst_note:8,scd_note:5,trd_note:8,fnl_note:6}
var cse_st15={ id_course:2,fst_note:9,scd_note:6,trd_note:5,fnl_note:5}
var cse_st16={ id_course:2,fst_note:10,scd_note:7,trd_note:6,fnl_note:4}
var cse_st17={ id_course:2,fst_note:1,scd_note:8,trd_note:2,fnl_note:3}
var cse_st18={ id_course:2,fst_note:2,scd_note:9,trd_note:1,fnl_note:2}
var cse_st19={ id_course:2,fst_note:3,scd_note:10,trd_note:3,fnl_note:1}
var cse_st20={ id_course:2,fst_note:5,scd_note:2,trd_note:5,fnl_note:9}
var cse_st21={ id_course:3,fst_note:4,scd_note:1,trd_note:4,fnl_note:10}
var cse_st22={ id_course:3,fst_note:6,scd_note:3,trd_note:6,fnl_note:8}
var cse_st23={ id_course:3,fst_note:7,scd_note:3,trd_note:7,fnl_note:7}
var cse_st24={ id_course:3,fst_note:8,scd_note:4,trd_note:8,fnl_note:6}
var cse_st25={ id_course:3,fst_note:9,scd_note:5,trd_note:9,fnl_note:4}
var cse_st26={ id_course:3,fst_note:10,scd_note:6,trd_note:10,fnl_note:6}
var cse_st27={ id_course:3,fst_note:1,scd_note:7,trd_note:1,fnl_note:8}
var cse_st28={ id_course:3,fst_note:2,scd_note:8,trd_note:2,fnl_note:8}
var cse_st29={ id_course:3,fst_note:6,scd_note:9,trd_note:9,fnl_note:5}
var cse_st30={ id_course:3,fst_note:6,scd_note:10,trd_note:5,fnl_note:10}

/*
 students data
 */
var student1 = { id_student : 1, first_name : 'leonardo', last_name : 'ramirez', birthday : new Date(),	notes: cse_st1}
var student2 = { id_student : 2, first_name : 'marcos', last_name : 'cronos', birthday : new Date(),notes: cse_st2 }
var student3 = { id_student : 3, first_name : 'juan', last_name : 'cripto', birthday : new Date(),notes: cse_st3}
var student4 = { id_student : 4, first_name : 'carlos', last_name : 'cerrat', birthday : new Date(),notes: cse_st11}
var student5 = { id_student : 5, first_name : 'pedro', last_name : 'torres', birthday : new Date(),notes: cse_st4}
var student6 = { id_student : 6, first_name : 'pablo', last_name : 'mirra', birthday : new Date(),notes: cse_st5}
var student7 = { id_student : 7, first_name : 'manuel', last_name : 'arroz', birthday : new Date(),notes: cse_st6}
var student8 = { id_student : 8, first_name : 'fernando', last_name : 'mendez', birthday : new Date(),notes: cse_st7}
var student9 = { id_student : 9, first_name : 'federico', last_name : 'ratio', birthday : new Date(),notes: cse_st8}
var student10 = { id_student : 10, first_name : 'andres', last_name : 'cejas', birthday : new Date(),notes: cse_st9}
var student11 = { id_student : 11, first_name : 'patricio', last_name : 'espinoza', birthday : new Date(),notes: cse_st10}
var student12 = { id_student : 12, first_name : 'lucas', last_name : 'segobia', birthday : new Date(),notes: cse_st12}
var student13 = { id_student : 13, first_name : 'marcos', last_name : 'rima', birthday : new Date(),notes: cse_st13}
var student14= { id_student : 14, first_name : 'ezequiel', last_name : 'ameguino', birthday : new Date(),notes: cse_st14}
var student15 = { id_student : 15, first_name : 'judas', last_name : 'frondoza', birthday : new Date(),notes: cse_st15}
var student16 = { id_student : 16, first_name : 'sabrina', last_name : 'riquelme', birthday : new Date(),notes: cse_st16}
var student17 = { id_student : 17, first_name : 'noelia', last_name : 'lamas', birthday : new Date(),notes: cse_st17}
var student18 = { id_student : 18, first_name : 'evelin', last_name : 'iris', birthday : new Date(),notes: cse_st18}
var student19 = { id_student : 19, first_name : 'ariana', last_name : 'herrero', birthday : new Date(),notes: cse_st19}
var student20 = { id_student : 20, first_name : 'ayene', last_name : 'felix', birthday : new Date(),notes: cse_st20}
var student21 = { id_student : 21, first_name : 'nadia', last_name : 'toloza', birthday : new Date(),notes: cse_st21}
var student22 = { id_student : 22, first_name : 'sofia', last_name : 'tosa', birthday : new Date(),notes: cse_st22}
var student23 = { id_student : 23, first_name : 'paula', last_name : 'coronel', birthday : new Date(),notes: cse_st23}
var student24 = { id_student : 24, first_name : 'fernanda', last_name : 'ruzzo', birthday : new Date(),notes: cse_st24}
var student25 = { id_student : 25, first_name : 'alejandra', last_name : 'fernandez', birthday : new Date(),notes: cse_st25}
var student26 = { id_student : 26, first_name : 'milagros', last_name : 'mesa', birthday : new Date(),notes: cse_st26}
var student27 = { id_student : 27, first_name : 'victoria', last_name : 'campos', birthday : new Date(),notes: cse_st27}
var student28 = { id_student : 28, first_name : 'virginia', last_name : 'lope<', birthday : new Date(),notes: cse_st28}
var student29 = { id_student : 29, first_name : 'juan', last_name : 'mitre', birthday : new Date(),notes: cse_st29}
var student30 = { id_student : 30, first_name : 'manolo', last_name : 'root', birthday : new Date(),notes: cse_st30}


/*
data course_day
*/
var courseday1={day_week : 'MONDAY', init : '10:00:00', finish : '13:00:00'}
var courseday2={day_week : 'TUESDAY', init : '11:00:00', finish : '14:00:00'}
var courseday3={day_week : 'FRIDAY', init : '12:00:00', finish : '15:00:00'}
var courseday4={day_week : 'WEDNESDAY', init : '13:00:00', finish : '16:00:00'}
var courseday5={day_week : 'FRIFAY', init : '14:00:00', finish : '17:00:00'}
var courseday6={day_week : 'THURDAY', init : '15:00:00', finish : '18:00:00'}
var courseday7={day_week : 'TUESDAY', init : '16:00:00', finish : '19:00:00'}
var courseday8={day_week : 'WEDNESDAY', init : '17:00:00', finish : '20:00:00'}
var courseday9={day_week : 'MONDAY', init : '18:00:00', finish : '21:00:00'}







/*
collection course
*/
var course1 = {id_course: 1, name: 'java',day_week:courseday1, teacher: teacher1, 
		students: [ student1,
					student2,
					student3,
					student4,
					student5,
					student6,
					student7,
					student8,
					student9,
					student10]}
var course2 = {id_course: 2, name: 'C#',day_week:courseday2, teacher: teacher2,
		students:[	student11,
					student12,
					student13,
					student14,
					student15,
					student16,
					student17,
					student18,
					student19,
					student20]}
var course3 = {id_course: 3, name: 'PHP', day_week:courseday3, teacher: teacher3,
		students:[	student21,
					student22,
					student23,
					student24,
					student25,
					student26,
					student27,
					student28,
					student29,
					student30]}

/*
add courses in colecction course
*/

db.course.insert(course1)
db.course.insert(course2)
db.course.insert(course3)

/*
2. Fetch all students whose notes in a specific course were greater than 4 
*/
, id_course : 1
db.course.find(
	{"notes.fnl_note": {$gt: 4}},
	{_id: 0}
)
db.course.aggregate([
	{$match: {"students.notes.fnl_note": {$gt: 4}}}
])



