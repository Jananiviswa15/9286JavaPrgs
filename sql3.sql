select sqrt(36) as rootNumber;

select abs(-78);
select abs(78);
/* cos tan  sin cosine log exp*/

select pow(3,3);

select ceil(12.3);
select ceil(12.8);

select floor(12.3);
select floor(11.9);

select PI();

select degrees(PI());

select degrees(PI()/ 4);


select mod(10,3);

select * from newdummy where  mod(rollNum,2) = 0;


select round(23.455445,1);

select round(23.455445,3);

select round(23.45);



select length("vamshi");

select repeat("hi", 3);

select concat("hi ", "kjkjf");

select concat(rollNum, " ", stdname) as concatEg from newdummy;

select ascii("a");

select left("hiall", 3);

select right("hiall", 2);

select rollNum,left(favSubj, 2) from newdummy order by rollNum desc;

select lcase("HIIII");

select ucase("hklkl");

select reverse("rest");

select substr("originial", 2);

select substr("originial", 2, 3);

select concat(space(3), "hgh");

select trim("         kjjhj            jhkh");