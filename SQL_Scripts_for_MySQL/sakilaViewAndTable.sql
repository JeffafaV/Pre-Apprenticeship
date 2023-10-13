CREATE VIEW sakila.initialCustomers AS SELECT first_name, last_name, email
FROM sakila.customer WHERE customer_id < 100;
SELECT * FROM sakila.initialCustomers;
CREATE TABLE sakila.ProductList (
ProductId INTEGER PRIMARY KEY AUTO_INCREMENT,
ProductName VARCHAR(80) NOT NULL,
Price NUMERIC(10,2) NOT NULL,
DateAdded DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
EmployeeSupportId INTEGER NOT NULL
);
INSERT INTO sakila.ProductList (ProductName, Price, EmployeeSupportId)
VALUES ("Lettuce", 2.99, 12);
SELECT * FROM sakila.ProductList;