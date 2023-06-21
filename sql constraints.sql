create table sample1(
rollNum int not null,
name  varchar(10) not null);

insert into sample1 values(56,"fgg");
insert into sample1(name) values("ffggg");

create table sample2(
rollNum int,
name  varchar(10) not null,
primary key (rollNum));
insert into sample2 values(56,"fgg");
insert into sample1(name) values("ffggg");

Alter table newdummy
Modify rollNum int not null;


create table sample3(
rollNum int,
name  varchar(10) not null,
citizenship varchar(10) default "indian",
primary key (rollNum));
insert into sample3(rollNum, name) values(56,"fgg");

select * from sample3;