alter table sample4 add primary key(rollNum);

desc sample4;

create table students(
name varchar(10) not null,
enrollmentNo int,
primary key(enrollmentNo));


create table adddressOfStudents(
city varchar(10) not null,
state varchar(10) not null,
studentId int references students(enrollmentNo) );

desc adddressOfStudents;

insert into students values("hi",70);
insert into adddressOfStudents values("ameerpet", "andhra", 10);


create table educationDetails(
degree varchar(10) not  null default "eng");

alter table educationDetails
add stu_edu_id int;

alter table educationDetails
add foreign key (stu_edu_id) references students(enrollmentNo);


create table studentDatabase(
uniqueId int,
age int check (age >= 18),
primary key(uniqueid));


insert into studentDatabase values(23, 56);
insert into studentDatabase values(23, 5);

alter table students
modify enrollmentNo int check(enrollmentNo > 0);


create index enrollmentIndex 
on students(enrollmentNo);
