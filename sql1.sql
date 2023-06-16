create database hydrebadDb;

show databases;
show tables;
use hydrebadDb;

create table dummy(
rollNum int(3),
name varchar(20),
favSubj varchar(10)
);

create table students(
rollNum int(3),
name varchar(20),
favSubj varchar(10)
);


Alter table students
add phNumber int(10);

Alter table students
modify column name varchar(30);


Alter table students
drop column phNumber;
desc students;

alter table dummy
rename to newdummy;

desc newdummy;


alter table newdummy
rename column name to stdname ;


insert into students values(12,'janani',"maths");

insert into students(rollNum, name) values (34, "kavitha");
insert into students(name, rollNum) values ("adithya", 100);
insert into students values(123,'kalpesh',"science");
insert into students values(18,'divya',"social");


insert into newdummy(rollNum, stdname) values (34, "kavitha");
insert into newdummy(stdname, rollNum) values ("adithya", 100);
insert into newdummy values(123,'kalpesh',"science");
insert into newdummy values(18,'divya',"social");


select * from students;

set sql_safe_updates = 0;

select rollNum from students;

select favSubj,rollNum from students;

update students
set favSubj = "edc";

update students
set favSubj = "maths" where rollNum = 34;


delete from newdummy
where rollNum = 100;
-- where favSubj = "social";

delete from newdummy;

truncate table students;

drop table students;