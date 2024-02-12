-- Create a new database named CompanyDB
CREATE DATABASE CompanyDB;
USE CompanyDB;

-- Create Employees table
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Position VARCHAR(50),
    Department VARCHAR(50),
    Salary INT
);

-- Insert data into Employees table
INSERT INTO Employees (EmployeeID, FirstName, LastName, Position, Department, Salary)
VALUES 
(1, 'Ajay', 'Sharma', 'Manager', 'HR', 60000),
(2, 'Amar', 'Rawat', 'Developer', 'IT', 55000),
(3, 'Mahesh', 'Yadav', 'Accountant', 'Finance', 50000),
(4, 'Evina', 'Steve', 'Sales Manager', 'Sales', 58000),
(5, 'Dinesh', 'Kumar', 'Marketing Exec', 'Marketing', 52000);

-- Create Departments table
CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50),
    ManagerID INT,
    FOREIGN KEY (ManagerID) REFERENCES Employees(EmployeeID)
);

-- Insert data into Departments table
INSERT INTO Departments (DepartmentID, DepartmentName, ManagerID)
VALUES 
(1, 'HR', 1),
(2, 'IT', 2),
(3, 'Finance', 3),
(4, 'Sales', 4),
(5, 'Marketing', 5);

-- Retrieve all employees' information
SELECT * FROM Employees;

-- Update the salary of an employee where id is 2. Add 1000 in his existing salary
UPDATE Employees SET Salary = Salary + 1000 WHERE EmployeeID = 2;

-- Delete an employee with a given EmployeeID
DELETE FROM Employees WHERE EmployeeID = [EmployeeID];

-- Retrieve all employees' information sorted by salary in descending order
SELECT * FROM Employees ORDER BY Salary DESC;

-- Retrieve only first name and salary. Column name should be EmpName and Empsalary
SELECT FirstName AS EmpName, Salary AS EmpSalary FROM Employees;

-- Retrieve first & last name and salary. Column name should be EmpName and EmpSalary
SELECT CONCAT(FirstName, ' ', LastName) AS EmpName, Salary AS EmpSalary FROM Employees;

-- Display only 2 rows of employee
SELECT * FROM Employees LIMIT 2;

-- Count the total number of employees
SELECT COUNT(*) FROM Employees;

-- Find the maximum and minimum salary among the employees
SELECT MAX(Salary), MIN(Salary) FROM Employees;

-- Count the number of employees in each position
SELECT Position, Count(Department)
FROM Employees
GROUP BY Position;

-- Count the number of employees in each position (corrected syntax)
SELECT Position, Count(*) AS Count
FROM Employees
GROUP BY Position;

-- Count the number of 'Manager' positions
SELECT Position, Count(*) AS Count
FROM Employees
GROUP BY Position
HAVING Position = 'Manager';

-- Display all records from the Departments table
SELECT * FROM Departments;

-- Join Employees and Departments tables on DepartmentName and display FirstName, Salary, and ManagerID
SELECT FirstName, Salary, ManagerID FROM Employees JOIN Departments ON Employees.Department = DepartmentName;

-- Join Employees and Departments tables on DepartmentName and display FirstName (as Name), Salary, and ManagerID
SELECT FirstName AS Name, Salary, ManagerID FROM Employees JOIN Departments ON Employees.Department = DepartmentName;

-- Join Employees and Departments tables on DepartmentName (corrected table name) and display FirstName (as Name), Salary, and ManagerID
SELECT FirstName AS Name, Salary, ManagerID FROM Employees JOIN Departments ON Employees.Department = Departments.DepartmentName;

-- Join Employees and Departments tables on DepartmentName (corrected table name) and display all records
SELECT * FROM Employees JOIN Departments ON Employees.Department = Departments.DepartmentName;

-- Sub-Query
 SELECT * FROM Employees WHERE Salary < (SELECT MAX(Salary) FROM Employees);

