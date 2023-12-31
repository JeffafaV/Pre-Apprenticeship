db.sample_movies.insertMany([
    {_id: 1, title: "Wonder Woman", director: "Patty Jenkins", yearReleased: 2017, leadActors: ["Gal Gadot", "Chris Pine", "Robin Wright"], lengthInMin: 141, genre: ["Action", "Adventure", "Fantasy"], MPAA: "PG-13" },
    {_id: 2, title: "Cloud Atlas", director: "Tom Tykwer", yearReleased: 2012, leadActors: ["Tom Hanks", "Halle Berry", "Hugh Grant", "Jim Broadbent", "Jim Sturgess", "Hugo Weaving"], lengthInMin: 172, genre: ["Action", "Drama", "Mystery"], MPAA: "R" },
    {_id: 3, title: "Pan's Labyrinth", director: "Guillermo del Torro", yearReleased: 2006, leadActors: ["Ivana Baquero", "Ariadna Gil", "Sergi Lopez"], lengthInMin: 118, genre: ["Drama", "Fantasy", "War", "Foreign"], MPAA: "R" },
    {_id: 4, title: "Gone With the Wind", director: "Victor Fleming", yearReleased: 1939, leadActors: ["Clark Gable", "Vivien Leigh", "Thomas Mitchell", "Olivia de Havilland", "Leslie Howard"], lengthInMin: 238, genre: ["Drama", "History", "Romance"], MPAA: "G" },
    {_id: 5, title: "Spaceballs", director: "Mel Brooks", yearReleased: 1987, leadActors: ["Mel Brooks", "John Candy", "Rick Moranis", "Bill Pullman", "Daphne Zuniga"], lengthInMin: 96, genre: ["Adventure", "Comedy", "Sci-fi"], MPAA: "PG" },
    {_id: 6, title: "Silence of the Lambs", director: "Jonathan Demme", yearReleased: 1991, leadActors: ["Jodie Foster", "Anthony Hopkins", "Anthony Heald"], lengthInMin: 118, genre: ["Crime", "Drama", "Thriller"], MPAA: "R" },
    {_id: 7, title: "American History X", director: "Tony Kaye", yearReleased: 1998, leadActors: ["Edward Norton", "Edward Furlong", "Beverly D'Angelo", "Ethan Suplee"], lengthInMin: 119, genre: ["Crime", "Drama"], MPAA: "R" },
    {_id: 8, title: "Psycho", director: "Alfred Hitchcock", yearReleased: 1960, leadActors: ["Anthony Perkins", "Vera Miles", "John Gavin", "Janet Leigh"], lengthInMin: 109, genre: ["Horror", "Mystery", "Thriller"], MPAA: "R" },
    {_id: 9, title: "The Pianist", director: "Roman Polanski", yearReleased: 2002, leadActors: ["Adrien Brody", "Emilia Fox", "Michal Zebrowski", "Ed Stoppard"], lengthInMin: 150, genre: ["Biography", "Drama", "Music"], MPAA: "R" },
    {_id: 10, title: "Gladiator", director: "Ridley Scott", yearReleased: 2000, leadActors: ["Russell Crowe", "Joaquin Phoenix", "Connie Nielsen", "Oliver Reed"], lengthInMin: 155, genre: ["Action", "Adventure", "Drama"], MPAA: "R" },
]);
db.sample_movies.find({lengthInMin : {$gt : 120}});
db.sample_movies.find({leadActors : {$ne : "Tom Hanks"}});
db.sample_movies.find({director : {$eq : "Mel Brooks"}});
db.sample_movies.find({genre : {$ne : "Drama"}});
db.sample_movies.find({$and : [{lengthInMin : {$gt : 90}}, {lengthInMin: {$lt : 120}}]});
db.sample_movies.find({$or : [{genre : {$eq : "Action"}}, {genre : {$eq : "Adventure"}}]}, {title : 1});
db.sample_movies.find({$and : [{genre : {$eq : "Comedy"}}, {leadActors : {$ne : "Jodie Foster"}}, 
{lengthInMin : {$lt : 120}}]});