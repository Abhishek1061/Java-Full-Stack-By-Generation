#  🏢 CompanyDB SQL Repository

This repository contains SQL scripts for creating and managing the `CompanyDB` database. The database consists of two tables: `Employees` and `Departments`.

##  📚 Tables

### 👥 Employees Table

The `Employees` table stores information about the employees, including their ID, first name, last name, position, department, and salary. Here's the structure of the `Employees` table:

| EmployeeID | FirstName | LastName | Position | Department | Salary |
|------------|-----------|----------|----------|------------|--------|
| 1          | Ajay      | Sharma   | Manager  | HR         | 60000  |
| 2          | Amar      | Rawat    | Developer| IT         | 55000  |
| 3          | Mahesh    | Yadav    | Accountant | Finance | 50000  |
| 4          | Evina     | Steve    | Sales Manager | Sales | 58000  |
| 5          | Dinesh    | Kumar    | Marketing Exec | Marketing | 52000  |

###  🏢 Departments Table

The `Departments` table stores information about the departments, including their ID, department name, and manager ID. Here's the structure of the `Departments` table:

| DepartmentID | DepartmentName | ManagerID |
|--------------|----------------|-----------|
| 1            | HR             | 1         |
| 2            | IT             | 2         |
| 3            | Finance        | 3         |
| 4            | Sales          | 4         |
| 5            | Marketing      | 5         |

## 📝 SQL Queries

This repository also includes SQL queries to:

# SQL Queries

1. Retrieve all employees' information
2. Update the salary of an employee where id is 2. Add 1000 in his existing salary
3. Delete an employee with a given EmployeeID
4. Retrieve all employees' information sorted by salary in descending order
5. Retrieve only first name and salary. Column name should be EmpName and Empsalary
6. Retrieve first & last name and salary. Column name should be EmpName and EmpSalary
7. Display only 2 rows of employee
8. Count the total number of employees
9. Find the maximum and minimum salary among the employees
10. Count the number of employees in each position
11. Count the number of 'Manager' positions
12. Display all records from the Departments table
13. Join Employees and Departments tables on DepartmentName and display FirstName, Salary, and ManagerID
14. Join Employees and Departments tables on DepartmentName (corrected table name) and display all records
15. Create the SubQuery for getting the MAX salary from employees table with details.

These queries can be used to manage and analyze the data in the `CompanyDB` database.

## 💻 Usage

To use these scripts, you'll need to have a SQL database management system installed, such as MySQL or PostgreSQL. You can then run the scripts using the command line or a database management tool.


