const somethingFun: string = "Riding my bike is fun";
console.log(somethingFun);

const sandwich: string = 'BLT'; // string
const orderNumber: number = 1738; // number
const delicious: boolean = true; // boolean

function orderFood(sandwich: string, orderNumber: number): void {
    console.log('Your order number is ' + orderNumber + ' and contains a ' + sandwich + ' sandwich');
}

orderFood('Ham & Cheese', 32);

const age1: number = 32;
const ageAsString: string = age1.toString();

const greeting: string = "Hello, my age is " + ageAsString + ".";

console.log(greeting)

const age2: string = "55";
const ageAsNumber: number = parseInt(age2);

const numberCalculation: number = ageAsNumber * 10;

console.log(numberCalculation);

interface Person {
    age: number;
    name: string;
}
const fred = {} as Person;
fred.age = 57;
fred.name = 'Fred Wilkenson';

const personName: any = 'Fred Wilkenson';

const fredName = <string>personName;

interface ingredientsBasket {
    numberOfItems: number;
    ingredients: string[];
    calories: number;
}

function makeASandwich(ingredients: ingredientsBasket): void {
    console.log(
        'Your sandwich includes ' +
        ingredients.numberOfItems +
        ' items of ' + ingredients.ingredients + ', which comes out to be a total of ' +
        ingredients.calories +
        ' calories.'
    );
}

const sandwichIngredients = {
    numberOfItems: 3,
    ingredients: ['bacon', 'lettuce', 'tomato'],
    calories: 320
};

makeASandwich(sandwichIngredients);

interface Lifespan {
    currentTime: Date;
    printDate(): void;
}

class AppointmentDateFormatter implements Lifespan {
    currentTime: Date;

    constructor(day: number, month: number, year: number) {
        this.currentTime = new Date(year, month, day);
    }

    printDate(): void {
        console.log(this.currentTime.toDateString());
    }
}

const dateOfAppointment = new AppointmentDateFormatter(12, 4, 2018);

dateOfAppointment.printDate();

interface Animal {
    name: string;
    whoAmI(): void;
}

interface Mammal {
    brushHair(): void;
}

interface WingedAnimal {
    fly(): void;
}

class Bat implements Animal, Mammal, WingedAnimal {
    name: string;

    constructor(name: string) {
        this.name = name;
    }

    whoAmI(): void {
        console.log("I'm " + this.name + "!");
    }

    brushHair(): void {
        console.log("I must brush my hair to look pretty!");
    }

    fly(): void {
        console.log("Look! I can fly!");
    }
}

let bat = new Bat("Bartok");
bat.whoAmI();
bat.brushHair();
bat.fly();

interface Individual {
    firstName: string;
    lastName?: string;
}

interface Contact {
    phoneNumber: number;
    email?: string;
}

class ContactCard implements Individual, Contact {
    firstName: string;
    phoneNumber: number;

    constructor (firstName: string, phoneNumber: number) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    sendMessage(): void {
        console.log("First Name: " + this.firstName + ", Phone Number: " + this.phoneNumber);
    }
}

let newIndividual = new ContactCard("Henry", 1234567890);
newIndividual.sendMessage();