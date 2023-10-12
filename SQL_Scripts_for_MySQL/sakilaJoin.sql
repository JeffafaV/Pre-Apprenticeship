SELECT first_name, last_name, customer_id, rental_id FROM sakila.customer
INNER JOIN sakila.rental USING(customer_id);
SELECT title FROM sakila.film INNER JOIN sakila.film_actor
USING(film_id) WHERE actor_id = 5;
SELECT title, name FROM sakila.film INNER JOIN sakila.language 
USING(language_id);
SELECT title, first_name, last_name FROM sakila.film INNER JOIN sakila.film_actor
USING(film_id) INNER JOIN sakila.actor USING(actor_id) WHERE first_name LIKE "a%" 
OR first_name LIKE "e%" OR first_name LIKE "i%" OR first_name LIKE "o%" 
OR first_name LIKE "u%";
SELECT title, inventory_id, amount FROM sakila.film INNER JOIN sakila.inventory USING (film_id)
INNER JOIN sakila.rental USING(inventory_id) INNER JOIN sakila.payment
USING(rental_id) WHERE amount > 4.99;