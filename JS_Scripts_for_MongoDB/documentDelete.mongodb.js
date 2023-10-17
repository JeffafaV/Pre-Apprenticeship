db.cars.deleteMany({});
db.cars.deleteMany({ used : true });
db.cars.deleteMany({ price: { $lt : 30000 }});
db.cars.deleteOne({ used : true });
db.cars.deleteOne({ price: { $lt : 30000 }});
db.cars.findOneAndDelete({ price: 8000 });
db.products.drop();
db.cars.insertMany([
    {
      make: 'Hyundai',
      model: 'Santa Fe',
      price: 8000,
      year: 2003,
      used: true,
      color: 'Black'
    },
    {
      make: 'BMW',
      model: 'ALPINA B6 Gran Coupe',
      price: 124300,
      year: 2017,
      used: false,
      color: 'Mediterranean Blue Metallic'
    },
    {
      make: 'Subaru',
      model: 'Crosstrek 2.0i Premium',
      price: 22595,
      year: 2014,
      used: true,
      color: 'Sunshine Orange'
    },
    {
      make: 'Ford',
      model: 'F-350 XL',
      price: 33705,
      year: 2017,
      used: false,
      color: 'Race Red'
    },
    {
      make: 'Toyota',
      model: 'Acura MDX',
      price: 28800,
      year: 2014,
      used: true,
      color: 'Graphite Luster Metallic'
    },
    {
      make: 'Volkswagen',
      model: 'Jetta 1.4T S',
      price: 19495,
      year: 2018,
      used: false,
      color: 'Silk Blue Metallic'
    }
  ]);
  db.cars.createIndex({ make: 1, model: -1 });
  db.cars.getIndexes();