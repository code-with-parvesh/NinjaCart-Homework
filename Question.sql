-- https://leetcode.com/problems/big-countries
595. Big Countries
SELECT name, population, area
FROM World
WHERE area >= 3000000 OR population >= 25000000;
-- https://leetcode.com/problems/swap-salary/
627. Swap Salary
UPDATE Salary
SET sex = IF(sex = 'm', 'f', 'm');
-- https://leetcode.com/problems/not-boring-movies/
620. Not Boring Movies
SELECT *
FROM Cinema
WHERE
  MOD(id, 2) = 1
  AND description != 'boring'
ORDER BY rating DESC;
-- https://leetcode.com/problems/duplicate-emails/
182. Duplicate Emails
SELECT email
FROM Person
GROUP BY 1
HAVING COUNT(*) > 1;
-- https://leetcode.com/problems/combine-two-tables/
175. Combine Two Tables
SELECT
  Person.firstName,
  Person.lastName,
  Address.city,
  Address.state
FROM Person
LEFT JOIN Address
  USING (personId);
-- https://leetcode.com/problems/employees-earning-more-than-their-managers/
181. Employees Earning More Than Their Managers
SELECT Worker.name AS Employee
FROM Employee AS Worker
INNER JOIN Employee AS Manager
  ON (Worker.managerId = Manager.id)
WHERE Worker.salary > Manager.salary;
-- https://leetcode.com/problems/customers-who-never-order/
183. Customers Who Never Order
SELECT Customers.name AS Customers
FROM Customers
LEFT JOIN Orders
  ON (Customers.id = Orders.customerId)
WHERE Orders.id IS NULL;
-- https://leetcode.com/problems/delete-duplicate-emails
196. Delete Duplicate Emails
DELETE P2
FROM Person AS P1
INNER JOIN Person AS P2
  ON (P1.email = P2.email)
WHERE P1.id < P2.id;
-- https://leetcode.com/problems/rising-temperature
197. Rising Temperature
SELECT Today.id
FROM Weather AS Today
INNER JOIN Weather AS Yesterday
  ON (DATE_SUB(Today.recordDate, INTERVAL 1 DAY) = Yesterday.recordDate)
WHERE Today.temperature > Yesterday.temperature;
-- https://leetcode.com/problems/classes-more-than-5-students
SELECT class
FROM Courses
GROUP BY 1
HAVING COUNT(*) >= 5;
-- https://leetcode.com/problems/second-highest-salary/
176. Second Highest Salary
