INSERT INTO sakila.actor (actor_id, first_name, last_name, last_update)
VALUES (201, "Emma", "Stone", "2023-10-13 09:40:30");
SELECT * FROM sakila.actor WHERE first_name = "Emma" AND last_name = "Stone";
UPDATE sakila.actor SET first_name = "Emmy", last_name = "Rock" WHERE actor_id = 201;
SELECT * FROM sakila.actor WHERE actor_id = 201;
SELECT * FROM sakila.staff WHERE password IS NULL;
SELECT * FROM sakila.staff WHERE first_name IS NOT NULL AND store_id IS NOT NULL;
UPDATE sakila.address SET address2 = "Canada" WHERE district = "Alberta";
UPDATE sakila.address SET address2 = "Australia" WHERE district = "QLD";