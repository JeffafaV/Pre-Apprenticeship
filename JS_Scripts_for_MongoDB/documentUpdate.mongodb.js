db.appusers.updateOne({"_id" : 1}, { $set : { "middleName" : "Gertrude"}}, { upsert : true});
db.appusers.updateMany({"firstName" : "Tommy"}, { $set : { "middleName" : "Henry"}}, { upsert : true});
db.appusers.updateOne({"firstName" : "Coderboy"}, { $set : { "middleName" : "Cole"}}, { upsert : true});
db.appusers.updateOne({ _id: 1 }, { $currentDate: { signedUp: true } });
db.inventory.updateMany({ status: 'A' }, { $mul: { qty: 2 } });
db.inventory.update({ item: 'journal' }, { $set: { status: 'B' } });
db.inventory.update({ item: 'journal' }, { $unset: { status: '' } });
db.inventory.updateMany({}, { $rename: { qty: 'quantity' } });
db.appusers.replaceOne(
    { _id: 2 },
    { lastName: 'Beck', firstName: 'Rupert', age: 19, favoriteColor: 'green' }
  );
db.scores.insertMany( [ { "_id" : 1521, "team" : "Fearful Mallards", "score" : 25000 },
{ "_id" : 2231, "team" : "Tactful Mooses", "score" : 23500 },
{ "_id" : 4511, "team" : "Aquatic Ponies", "score" : 19250 },
{ "_id" : 5331, "team" : "Cuddly Zebras", "score" : 15235 },
{ "_id" : 3412, "team" : "Garrulous Bears", "score" : 22300 } ] );
db.scores.findOneAndReplace(
    { score: { $lt: 20000 } },
    { team: 'Observant Badgers', score: 20000 }
  );