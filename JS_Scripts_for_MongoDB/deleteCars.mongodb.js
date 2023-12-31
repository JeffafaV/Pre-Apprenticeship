db.cars.deleteMany({});
db.cars.insertMany([
    {
      make: "Hyundai",
      model: "Santa Fe",
      price: 8000,
      year: 2003,
      used: true,
      color: "Black"
    },
    {
      make: "BMW",
      model: "ALPINA B6 Gran Coupe",
      price: 124300,
      year: 2017,
      used: false,
      color: "Mediterranean Blue Metallic"
    },
    {
      make: "Subaru",
      model: "Crosstrek 2.0i Premium",
      price: 22595,
      year: 2014,
      used: true,
      color: "Sunshine Orange"
    },
    {
      make: "Ford",
      model: "F-350 XL",
      price: 33705,
      year: 2017,
      used: false,
      color: "Race Red"
    },
    {
      make: "Toyota",
      model: "Acura MDX",
      price: 28800,
      year: 2014,
      used: true,
      color: "Graphite Luster Metallic"
    },
    {
      make: "BMW",
      model: "5 Series 535i Sedan",
      price: 18995,
      year: 2013,
      used: true,
      color: "Space Gray Metallic"
    },
    {
      make: "Ford",
      model: "Escape",
      price: 7480,
      year: 2011,
      used: true,
      color: "Sterling Grey Metallic"
    },
    {
      make: "Subaru",
      model: "Impreza",
      price: 18495,
      year: 2018,
      used: false,
      color: "Crimson Red Pearl"
    },
    {
      make: "Toyota",
      model: "Yaris",
      price: 15635,
      year: 2018,
      used: false,
      color: "Super White"
    },
    {
      make: "Honda",
      model: "Civic LX",
      price: 14999,
      year: 2016,
      used: true,
      color: "Crystal Black Pearl"
    },
    {
      make: "Volkswagen",
      model: "Jetta 1.4T S",
      price: 19495,
      year: 2018,
      used: false,
      color: "Silk Blue Metallic"
    }
  ]);
db.cars.createIndex( { price: 1 } );
db.cars.createIndex( { used : 1 } );
db.cars.deleteMany({ year: { $lt : 2012 }});
db.cars.deleteOne({ make: { $eq : "BMW" }});
db.cars.dropIndex("used_1");
db.cars.createIndex( {make : 1} );
db.cars.dropIndex("price_1");
db.cars.deleteOne({make: {$eq : "Volkswagen"}});