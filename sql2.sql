SELECT * FROM hydrebaddb.newdummy;


INSERT INTO NEWDUMMY(STDNAME, favSubj) VALUES ("JANANI", "SCIENCE");

INSERT INTO NEWDUMMY VALUES (1, "JANANI", "chemi");
INSERT INTO NEWDUMMY VALUES (1, "VISWA", "SOCIAL");
INSERT INTO NEWDUMMY VALUES (2, "KALPESH", "SCIENCE");
INSERT INTO NEWDUMMY VALUES (2, "SURIYA", "MATHS");
INSERT INTO NEWDUMMY VALUES (3, "DIVYA", "LANGUAGE");
INSERT INTO NEWDUMMY VALUES (4, "ANUSHA", "LANGUAGE");
INSERT INTO NEWDUMMY VALUES (5, "JOSTHNA", "SCIEMCE");


SELECT SUM(ROLLnUM) FROM NEWDUMMY;
SELECT AVG(ROLLNUM) FROM NEWDUMMY;
SELECT MAX(stdname) FROM newdummy;
SELECT MIN(stdname) as asc_name FROM newdummy;
SELECT COUNT(*) FROM NEWDUMMY;


select stdname, favSubj from newdummy where rollNum = 2;
select stdname as student_name_list from NEWDUMMY;


SELECT COUNT(rollNum) from newdummy;

select * from newdummy where rollNum = 2 and favSubj = "maths";

select * from newdummy where rollNum = 2 or favSubj = "science";

select * from newdummy where rollNum is null;

select * from newdummy where rollNum is not null;

select * from newdummy where rollNum > 10;
select * from newdummy where rollNum >= 10;
select * from newdummy where rollNum < 10;
select * from newdummy where rollNum <= 10;
select * from newdummy where rollNum != 100;
select * from newdummy where rollNum <> 100;
select * from newdummy where rollNum = 100;

select * from newdummy where rollNum between 1 and 3;
select * from newdummy where rollNum not between 1 and 3;

select * from newdummy where rollNum in(1,3,5);
select * from newdummy where rollNum not in(1,3,5);

select distinct(favSubj) from newdummy;
select count(distinct(rollNum)) from newdummy;

select * from newdummy where favSubj like "%s" or rollNum >= 2;
select * from newdummy where favSubj like "L%";

select * from newdummy where favSubj like "%c%";

select * from newdummy where favSubj like "_o%";
select * from newdummy where favSubj like "_c_i%";
select * from newdummy where favSubj like "s_____e%";

select * from newdummy limit 2;

select * from newdummy where rollNum <= 5 order by rollNum;

select * from newdummy where rollNum <= 5 order by rollNum desc;

select * from newdummy where rollNum <= 5 order by stdname desc;

select * from newdummy where rollNum <= 5 order by rollNum , stdname ;
select * from newdummy where rollNum <= 5 order by rollNum , stdname desc;