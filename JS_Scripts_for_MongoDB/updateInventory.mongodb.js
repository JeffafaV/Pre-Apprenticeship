db.inventory.updateOne({item: "Journal"}, {$set: {"size.h": 16}});
db.inventory.updateMany({status: "D"}, {$set: {quantity : 50}}, {upsert: true});
db.inventory.updateOne({item: "paper"}, {$set: {rating: "4 stars", status: "A"}}, {upsert: true});
db.inventory.updateMany({}, {$rename: {"size.h": "size.height", "size.w": "size.width"}});
db.inventory.updateOne({item: "spiral notebook"}, {$inc: {"size.height": 2, "size.width": 2}});
db.inventory.updateOne({item: "paper"}, {$mul: {"size.height": 3}});
db.inventory.updateOne({item: "day planner"}, {$mul: {"size.height": 3}});
db.inventory.insertMany([
    {
      item: 'sticky note pads',
      size: { height: 8.9, width: 9, uom: 'cm' },
      status: 'B',
      quantity: 5
    },
    {
      item: 'pens',
      size: { height: 12, width: 1.3, uom: 'cm' },
      status: 'A',
      quantity: 4
    },
    {
      item: 'pencils',
      size: { height: 13, width: 1.4, uom: 'cm' },
      status: 'D',
      quantity: 10
    },
    {
      item: 'clipboard',
      size: { height: 13, width: 7, uom: 'in' },
      status: 'B',
      quantity: 2
    },
    {
      item: 'printer ink',
      size: { height: 2, width: 3, uom: 'in' },
      status: 'C',
      quantity: 2
    }
  ]);
db.inventory.updateMany({}, {$set: {rating: {numberOfStars: 4, hasBeenRated: false}}}, {upsert: true});
db.inventory.updateMany({}, {$mul: {quantity: 2}});
db.inventory.updateMany({"size.uom": "cm"}, {$set: {status : "B"}}, {upsert: true});