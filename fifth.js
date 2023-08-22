let add = (num1 , num2) => num1+num2;


let sum = add;

let result =   sum(5,4)
console.log(result)


let student = {

name : "janani",
grade : 8,
'workExp' : 0,

sayHi : function(){
	console.log("hi");
	console.log(student.name)
	
	
}

}




let student1 = {

name : "secondaryStd",
grade : 3,
'workExp' : 0,

sayHi : function(){
	console.log("hi");
	console.log(student.name)
	
	
}

}
 
student.sayHi();

function compareValues(student, student1){
	if(student1.grade > student.grade)
		console.log("younger")
	else
		console.log("elder")
		
	
	
}


compareValues(student, student1);



function studentObjects(name, grade, favSub){
	
	this.name = name;
	this.grade = grade;
	this.favSub = favSub;
	
	this.sayHello = function(){
	console.log("hi");
	console.log(student.name)
	
	
}
}


let studentObj = new studentObjects('akshaya', 9, 'science');
let studentObj1 = new studentObjects('std1', 9, 'science');

console.log(studentObj)