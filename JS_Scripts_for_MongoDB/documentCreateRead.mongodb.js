db.createCollection("appusers");
db.appusers.insertOne({_id:1,lastName:"Pumpernickel", firstName:"Georgina", middleName:"Sasquatch", age:27, gender:"f"});
db.appusers.insertOne({_id:2,lastName:"Wilson", firstName:"Coderboy", age:18, favoriteColor:"blue"});
db.appusers.find({});
db.appusers.insertMany([{lastName: "Anstruther", firstName: "Jimmy", age: 21}, {lastName: "Stevens", firstName: "Amelia", age: 28},
{lastName: "Hopkins", firstName: "Fred", age: 35, favoriteColor: "Green"}]);
db.appusers.find({});
db.movies.insertMany([{title: "The Shawshank Redemption", director: "Frank Darabont", yearReleased: 1994}, 
{title: "The Dark Knight", director: "Christopher Nolan", yearReleased: 2008}, 
{title: "It's a Wonderful Life", director: "Frank Capra", yearReleased: 1946}]);
db.appusers.insertOne({firstName:"Bart", lastName:"Simpson", age:10});
db.appusers.insertOne({firstName:"Winston", lastName:"Gorilla", age:31});
db.appusers.insertOne({firstName:"Brandon", lastName:"Rodgers", age:35});
db.appusers.find({});
db.cars.insertMany([
  {make: "Volkswagen", model: "Golf", color: "Red", year: "2011", fourDoor: true, fourWheelDrive: false},
  {make: "Toyota", model: "Tundra", color: "Super White", year: "2018", fourDoor: true, fourWheelDrive: true},
  {make: "Jeep", model: "Wagoneer", color: "Copper Brown Metallic", year: "1982", fourDoor: true, fourWheelDrive: true},
  {make: "Jaguar", model: "XJ6 Sovereign", color: "Brown", year: "1986", fourDoor: true, fourWheelDrive: false},
  {make: "Kia", model: "Rio LX", color: "Clear White", year: "2018", fourDoor: true, fourWheelDrive: false}
]);
db.cars.find({});
db.appusers.find({ _id : { $eq : 1} });
db.appusers.find({ _id : { $ne : 1} });
db.appusers.find({ _id : { $gt : 1} });
db.appusers.find({ _id : { $gte : 2} });
db.appusers.find({ _id : { $lt : 2} });
db.appusers.find({ _id : { $lte : 2} });
db.inventory.insertMany([
    { item: "journal", qty: 25, size: { h: 14, w: 21, uom: "cm" }, status: "A", price: 16.49, sale: true },
    { item: "spiral notebook", qty: 50, size: { h: 8.5, w: 11, uom: "in" }, status: "A", price: 4.79, sale: false },
    { item: "paper", qty: 100, size: { h: 8.5, w: 11, uom: "in" }, status: "D", price: 6.99, sale: true },
    { item: "day planner", qty: 75, size: { h: 22.85, w: 30, uom: "cm" }, status: "D", price: 25.29, sale: true },
    { item: "calendar", size: { h: 21.75, w: 17, uom: "in" }, status: "B", price: 5.99, sale: false },
    { item: "scissor", qty: 15, size: { h: 8, w: 4.25, uom: "in" }, status: "B", price: 11.59, sale: true },
    { item: "tape dispenser", qty: 5, size: { h: 3, w: 7, uom: "in" }, status: "A", price: 3.09, sale: true }
]);
db.inventory.find( { qty: { $in: [ 5, 15 ] } } );
db.inventory.find( { qty: { $nin: [ 5, 15 ] } } );
db.inventory.find( { $and: [ { price: { $ne: 6.99 } }, { price: { $exists: true } } ] } );
db.inventory.find( { $or: [ { qty: { $lt: 20 } }, { price: 16.49 } ] } );
db.inventory.find( {
    $and : [
        { $or : [ { price : { $eq : 4.79 } }, { price : { $eq : 3.09 } } ] },
        { $or : [ { sale : true }, { qty : { $lt : 20 } } ] }
    ]
} );
db.inventory.find( { price: { $not: { $gt: 4.80 } } } );
db.inventory.find( { $nor: [ { price: { $gte : 5.99 } }, { sale: { $eq : true } } ] } );
db.inventory.find( { qty: { $exists: true, $nin: [ 5, 15 ] } } );
db.appusers.find( { _id : 25}, { firstName: 1 });
db.appusers.find({}, {firstName : 1, lastName : 1});
db.appusers.find({}, { _id : 0});