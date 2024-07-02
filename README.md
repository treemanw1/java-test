# Cxrus Java Assignment

## 1. SQL statements

1. List all customer names who do not have any single order.
	
	`SELECT ContactName FROM Customers LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID WHERE OrderID IS NULL;`
	
2. List all the unique customer names who had ordered products that contain the word “Lager”.
	
	`SELECT DISTINCT ContactName FROM Customers as c 
	INNER JOIN Orders as o on c.CustomerID = o.CustomerID
	INNER JOIN [Order Details] as od on o.OrderID = od.OrderID
	INNER JOIN Products as p on p.ProductID = od.ProductID
	WHERE p.ProductName LIKE '%Lager%';`
	
3. For each customer, display the number of orders with the order date in the year of 1998.
	
	`SELECT c.CustomerID, COUNT(o.OrderID) AS NumOrders
	FROM Customers AS c
	INNER JOIN Orders AS o on c.CustomerID = o.CustomerID
	WHERE YEAR(o.OrderDate) = 1998
	GROUP BY c.CustomerID;`

## 2a. Query Customers

Java version: 22.0.1

To run application:

java -jar target/java-test-0.0.1-SNAPSHOT.jar

## DB
MySQL db configuration in /src/main/resources/application.properties

DB setup commands:

1. "cd db"
2. "chmod +x setup_db.sh"
2. "./setup_db.sh"

