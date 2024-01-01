// Day 5 - Variables and Data Types

// Declare a variable called "name" and assign it a string value
let name = "John";

// Declare a variable called "age" and assign it a number value
let age = 25;

// Declare a variable called "isStudent" and assign it a boolean value
let isStudent = true;

// Declare a variable called "hobbies" and assign it an array of strings
let hobbies = ["reading", "running", "cooking"];

// Declare a function called "greet" that takes in a name parameter and logs a greeting message to the console
function greet(name) {
    console.log(`Hello, ${name}!`);
}

// Call the greet function with the name variable as an argument
greet(name);

// Declare a function called "calculateAge" that takes in an age parameter and returns the age in dog years
function calculateAge(age) {
    let dogYears = age * 7;
    return dogYears;
}

// Call the calculateAge function with the age variable as an argument and log the result to the console
let dogAge = calculateAge(age);
console.log(`Your age in dog years is ${dogAge}`);

// Use a for loop to log each hobby in the hobbies array to the console
for (let i = 0; i < hobbies.length; i++) {
    console.log(hobbies[i]);
}

// Use an if statement to check if the isStudent variable is true and log a message to the console accordingly
if (isStudent) {
    console.log("You are a student");
} else {
    console.log("You are not a student");
}
