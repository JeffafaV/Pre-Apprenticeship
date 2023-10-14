CREATE TABLE sakila.viewer (
viewer_id INTEGER PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(80)
);
INSERT INTO sakila.viewer (first_name, last_name, email)
VALUES ("Kenneth", "Davis", "kenneth.davis@gmail.com");
INSERT INTO sakila.viewer (first_name, last_name, email)
VALUES ("David", "Shirley", "david.shirley@gmail.com");
INSERT INTO sakila.viewer (first_name, last_name, email)
VALUES ("Gaby", "Garcia", "gaby.garcia@gmail.com");
INSERT INTO sakila.viewer (first_name, last_name, email)
VALUES ("Donna", "Bumbleton", "donna.bumbleton@gmail.com");
SELECT * FROM sakila.viewer;
CREATE TABLE sakila.StreamingServiceQueue (
queue_id INTEGER PRIMARY KEY AUTO_INCREMENT,
genre VARCHAR(50) NOT NULL,
filmTitle VARCHAR(50) NOT NULL,
streamAvailable BOOLEAN CHECK(streamAvailable IN (true, false))
);
INSERT INTO sakila.StreamingServiceQueue (genre, filmTitle, streamAvailable)
VALUES ("Movies based on books","The Breadwinner", true);
INSERT INTO sakila.StreamingServiceQueue (genre, filmTitle, streamAvailable)
VALUES ("Emotional","Roma", false);
INSERT INTO sakila.StreamingServiceQueue (genre, filmTitle, streamAvailable)
VALUES ("Campy","To Wong Foo, Thanks for Everything Julie Newmar", true);
INSERT INTO sakila.StreamingServiceQueue (genre, filmTitle, streamAvailable)
VALUES ("Critically Acclaimed","A Single Man", true);
SELECT * FROM sakila.StreamingServiceQueue;
CREATE TABLE sakila.WatchedList (
watch_id INTEGER PRIMARY KEY AUTO_INCREMENT,
queue_id INTEGER NOT NULL,
viewer_id INTEGER NOT NULL,
FOREIGN KEY(viewer_id) REFERENCES sakila.viewer(viewer_id),
FOREIGN KEY(queue_id) REFERENCES sakila.StreamingServiceQueue(queue_id)
);
INSERT INTO sakila.WatchedList (viewer_id, queue_id)
VALUES (1, 2);
INSERT INTO sakila.WatchedList (viewer_id, queue_id)
VALUES (2, 1);
INSERT INTO sakila.WatchedList (viewer_id, queue_id)
VALUES (3, 2);
INSERT INTO sakila.WatchedList (viewer_id, queue_id)
VALUES (4, 1);
SELECT first_name, last_name, email, watch_id, filmTitle, genre
FROM sakila.viewer INNER JOIN sakila.WatchedList USING(viewer_id)
INNER JOIN sakila.StreamingServiceQueue USING(queue_id)
ORDER BY last_name;