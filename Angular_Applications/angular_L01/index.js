"use strict";
const somethingFun = "Riding my bike is fun";
console.log(somethingFun);
const sandwich = 'BLT'; // string
const orderNumber = 1738; // number
const delicious = true; // boolean
function orderFood(sandwich, orderNumber) {
    console.log('Your order number is ' + orderNumber + ' and contains a ' + sandwich + ' sandwich');
}
orderFood('Ham & Cheese', 32);
const age1 = 32;
const ageAsString = age1.toString();
const greeting = "Hello, my age is " + ageAsString + ".";
console.log(greeting);
const age2 = "55";
const ageAsNumber = parseInt(age2);
const numberCalculation = ageAsNumber * 10;
console.log(numberCalculation);
const fred = {};
fred.age = 57;
fred.name = 'Fred Wilkenson';
const personName = 'Fred Wilkenson';
const fredName = personName;
function makeASandwich(ingredients) {
    console.log('Your sandwich includes ' +
        ingredients.numberOfItems +
        ' items of ' + ingredients.ingredients + ', which comes out to be a total of ' +
        ingredients.calories +
        ' calories.');
}
const sandwichIngredients = {
    numberOfItems: 3,
    ingredients: ['bacon', 'lettuce', 'tomato'],
    calories: 320
};
makeASandwich(sandwichIngredients);
class AppointmentDateFormatter {
    constructor(day, month, year) {
        this.currentTime = new Date(year, month, day);
    }
    printDate() {
        console.log(this.currentTime.toDateString());
    }
}
const dateOfAppointment = new AppointmentDateFormatter(12, 4, 2018);
dateOfAppointment.printDate();
class Bat {
    constructor(name) {
        this.name = name;
    }
    whoAmI() {
        console.log("I'm " + this.name + "!");
    }
    brushHair() {
        console.log("I must brush my hair to look pretty!");
    }
    fly() {
        console.log("Look! I can fly!");
    }
}
let bat = new Bat("Bartok");
bat.whoAmI();
bat.brushHair();
bat.fly();
class ContactCard {
    constructor(firstName, phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }
    sendMessage() {
        console.log("First Name: " + this.firstName + ", Phone Number: " + this.phoneNumber);
    }
}
let newIndividual = new ContactCard("Henry", 1234567890);
newIndividual.sendMessage();
