function display(stringVal){
console.log("gm"+stringVal)
return "returned val";
return "jkhj";
}



//display();
//display();

let catchVal = display("hello");
console.log(catchVal)



let sum = function add(num1, num2, num3 = 10){
	
	
	return num1+num2;
}


//let sumVal = add(7,8)
//console.log(sum)


let refSum = sum;

let sumVal = sum(7,6);
console.log(refSum(10,10, 100))




function sayHi(name){
	console.log(value);
	return `hello ${name}`;
}

let value = "hello";
let catchStr = sayHi("girls")
console.log(catchStr)


function 


