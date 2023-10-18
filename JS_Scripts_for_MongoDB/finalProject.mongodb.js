db.createCollection("employees");
db.employees.insertMany([
    {
        name : "Alison Davidson" ,
        birthday : new Date("1975-04-05") ,
        address : "874 W. Oak Place	" ,
        City : "Gary" ,
        State : "Indiana" ,
        position : {
            position_name : "Customer Support" ,
            remote : true ,
            full_time : true
        }
    },
    {
        name : "Henry Chapelton" ,
        birthday : new Date("1980-09-29") ,
        address : "9324 E. Vista Way" ,
        City : "Tempe" ,
        State : "Arizona" ,
        position : {
            position_name : "Customer Support" ,
            remote : false ,
            full_time : true
        }
    },
    {
        name : "Alex Miller" ,
        birthday : new Date("1983-11-22") ,
        address : "244 Price Road" ,
        City : "Mesa" ,
        State : "Arizona" ,
        position : {
            position_name : "Customer Support" ,
            remote : false ,
            full_time : false
        }
    },
    {
        name : "Carly Nielson" ,
        birthday : new Date("1987-08-04") ,
        address : "678 W. Westward Road" ,
        City : "Phoenix" ,
        State : "Arizona" ,
        position : {
            position_name : "Office Manager" ,
            remote : false ,
            full_time : true
        }
    },
    {
        name : "Tom Talbot" ,
        birthday : new Date("1989-12-30") ,
        address : "12 Oakland Way" ,
        City : "Chandler" ,
        State : "Arizona" ,
        position : {
            position_name : "Inventory Manager" ,
            remote : false ,
            full_time : true
        }
    },
    {
        name : "Mary Crawley" ,
        birthday : new Date("1980-07-06") ,
        address : "1010 Granite Way" ,
        City : "Charlotte" ,
        State : "North Carolina" ,
        position : {
            position_name : "Human Resources" ,
            remote : true ,
            full_time : true
        }
    },
    {
        name : "Daisy Baxter" ,
        birthday : new Date("1987-09-09") ,
        address : "990 E. 84th St." ,
        City : "Tempe" ,
        State : "Arizona" ,
        position : {
            position_name : "CEO" ,
            remote : false ,
            full_time : true
        }
    },
    {
        name : "William Coyle" ,
        birthday : new Date("1991-10-11") ,
        address : "944 W. 16th St." ,
        City : "Phoenix" ,
        State : "Arizona" ,
        position : {
            position_name : "Intern" ,
            remote : false ,
            full_time : false
        }
    },
    {
        name : "Edith Bates" ,
        birthday : new Date("1990-07-28") ,
        address : "7 E. 20th Pl." ,
        City : "Chandler" ,
        State : "Arizona" ,
        position : {
            position_name : "Customer Support" ,
            remote : false ,
            full_time : true
        }
    },
    {
        name : "Gwen Harding" ,
        birthday : new Date("1986-10-11") ,
        address : "234 W. 48th. St." ,
        City : "Phoenix" ,
        State : "Arizona" ,
        position : {
            position_name : "Office Assistent" ,
            remote : false ,
            full_time : true
        }
    }
]);
db.employees.updateOne({name : "Alison Davidson"}, 
{$set : {address : "777 E. 1st St. # 120" , City : "Tempe" , State : "Arizona" , 
"position.remote" : false}});
db.employees.updateOne({name : "Mary Crawley"}, 
{$set : {address : "8322 W. Vista Pl." , City : "Scottsdale" , State : "Arizona" ,
"position.remote" : false}});
db.employees.updateMany({}, {$unset : {State : ""}});
db.employees.createIndex({position : 1});
db.createCollection("songs");
db.songs.insertMany([
    {
        _id : 1 ,
        title : "Girls Just Want To Have Fun" ,
        details : {
            artist : "Cyndi Lauper" ,
            album : "She's So Unusual" ,
            release_year : 1983
        }
    },
    {
        _id : 2 ,
        title : "Hips Don't Lie" ,
        details : {
            artist : "Shakira feat. Wyclef Jean" ,
            album : "Oral Fixation Vol. 2" ,
            release_year : 2006
        }
    },
    {
        _id : 3 ,
        title : "Poker Face" ,
        details : {
            artist : "Lady Gaga" ,
            album : "The Fame" ,
            release_year : 2008
        }
    },
    {
        _id : 4 ,
        title : "Wannabe" ,
        details : {
            artist : "Spice Girls" ,
            album : "Spice" ,
            release_year : 1996
        }
    },
    {
        _id : 5 ,
        title : "California Gurls" ,
        details : {
            artist : "Katy Perry feat. Snoop Dogg" ,
            album : "Teenage Dream" ,
            release_year : 2010
        }
    },
    {
        _id : 6 ,
        title : "Bye, Bye, Bye" ,
        details : {
            artist : "NSYNC" ,
            album : "No Strings Attached" ,
            release_year : 2000
        }
    },
    {
        _id : 7 ,
        title : "I Will Always Love You" ,
        details : {
            artist : "Whitney Houston" ,
            album : "I Will Always Love You: The Best of Whitney Houston" ,
            release_year : 2012
        }
    },
    {
        _id : 8 ,
        title : "Baby One More Time" ,
        details : {
            artist : "Britney Spears" ,
            album : "Baby One More Time" ,
            release_year : 1999
        }
    },
    {
        _id : 9 ,
        title : "Vogue" ,
        details : {
            artist : "Madonna" ,
            album : "I'm Breathless" ,
            release_year : 1990
        }
    },
    {
        _id : 10 ,
        title : "Rolling in the Deep" ,
        details : {
            artist : "Adele" ,
            album : "21" ,
            release_year : 2011
        }
    },
    {
        _id : 11 ,
        title : "1234" ,
        details : {
            artist : "Feist" ,
            album : "The Reminder" ,
            release_year : 2007
        }
    },
    {
        _id : 12 ,
        title : "Elastic Heart" ,
        details : {
            artist : "Sia" ,
            album : "The Hunger Games: Catching Fire Soundtrack" ,
            release_year : 2015
        }
    },
    {
        _id : 13 ,
        title : "Oops! I Did It Again" ,
        details : {
            artist : "Britney Spears" ,
            album : "Oops! I Did It Again" ,
            release_year : 2000
        }
    },
    {
        _id : 14 ,
        title : "Bad Romance" ,
        details : {
            artist : "Lady Gaga" ,
            album : "The Fame Monster" ,
            release_year : 2009
        }
    },
    {
        _id : 15 ,
        title : "Lose Control" ,
        details : {
            artist : "Missy Elliot" ,
            album : "The Cookbook" ,
            release_year : 2005
        }
    },
    {
        _id : 16 ,
        title : "U Can't Touch This" ,
        details : {
            artist : "MC Hammer" ,
            album : "Please Hammer, Don't Hurt 'Em" ,
            release_year : 1990
        }
    },
    {
        _id : 17 ,
        title : "Thriller" ,
        details : {
            artist : "Michael Jackson" ,
            album : "Thriller" ,
            release_year : 1982
        }
    },
    {
        _id : 18 ,
        title : "Single Ladies" ,
        details : {
            artist : "Beyonce" ,
            album : "I am... Sasha Fierce" ,
            release_year : 2008
        }
    },
    {
        _id : 19 ,
        title : "Rhythm Nation" ,
        details : {
            artist : "Janet Jackson" ,
            album : "Janet Jackson's Rhythm Nation 1814	" ,
            release_year : 1989
        }
    }
]);
db.songs.updateMany({}, {$rename : {"title" : "song_title"}});
db.songs.updateMany({}, {$rename : {"details.artist" : "artist"}});