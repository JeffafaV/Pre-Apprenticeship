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