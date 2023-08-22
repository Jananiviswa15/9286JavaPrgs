let attrName = "grade";

student = {

name : "janani",
grade : 8,
'workExp' : 0,
Address : {
	state : 'KA',
	dist : 'dist1'
}

}

delete student.name;

console.log(student)


for(let key in student)
{
	
	console.log(key,student[key] )
}
