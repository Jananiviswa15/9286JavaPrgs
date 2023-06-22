create table studentsDemo(
id int,
name varchar(10) not null,
email varchar(10) unique,
schoolName varchar(10) default "abc",
primary key(id));

create table address(
adrsid int,
city varchar(10) not null,
state varchar(10) not null,
stuIdRef int references studentsDemo(id),
primary key(adrsid));


insert into studentsDemo values (1, "janani", "jan@gma","abc hr");
insert into studentsDemo values (2, "anuha", "anu@gma","abc hr");
insert into studentsDemo values (3, "divya", "div@gma","abc hr");
insert into studentsDemo values (4, "jyostna", "jyos@gma","abc hr");
insert into studentsDemo values (5, "swathi", "swa@gma","abc hr");

insert into address values(101, "ammer", "ap", 1);
insert into address values(110, "ammer", "ap", 2);
insert into address values(11, "ammer", "ap", 3);
insert into address values(111, "ammer", "ap", 9);





select * from address;


select * from studentsDemo inner join address 
on studentsDemo.id = address.stuIdRef 
where length(name) > 5;

select * from studentsDemo inner join address 
on studentsDemo.id = address.stuIdRef
where name like "%a";

select * from studentsDemo inner join address 
on studentsDemo.id = address.stuIdRef
order by name;

select * from studentsDemo left join address 
on studentsDemo.id = address.stuIdRef ;

select * from address left join studentsDemo 
on studentsDemo.id = address.stuIdRef ;


select * from studentsDemo right join address 
on studentsDemo.id = address.stuIdRef ;


select * from address right join studentsDemo 
on studentsDemo.id = address.stuIdRef ;
