Select * from Employees;
+------------+-----------+----------+---------------------+------------+--------+
| EmployeeID | FirstName | LastName | Position            | Department | Salary |
+------------+-----------+----------+---------------------+------------+--------+
|          1 | Ajay      | Sharma   | Manager             | HR         |  60000 |
|          2 | Amar      | Rawat    | Developer           | IT         |  55000 |
|          3 | Mahesh    | Yadav    | Accountant          | Finance    |  50000 |
|          4 | Evina     | Steve    | Sale Manager        | Sales      |  58000 |
|          5 | Dinesh    | Kumar    | Marketing Executive | Marketing  |  52000 |
+------------+-----------+----------+---------------------+------------+--------+
5 rows in set (0.00 sec)

mysql> Select * from Departments;
+--------------+----------------+-----------+
| DepartmentID | DepartmentName | ManagerID |
+--------------+----------------+-----------+
|            1 | HR             |         1 |
|            2 | IT             |         2 |
|            3 | Finance        |         3 |
|            4 | Sales          |         4 |
|            5 | Marketing      |         5 |
+--------------+----------------+-----------+
5 rows in set (0.00 sec)

mysql> Update Employees set Salary += 1000 where EmployeeID = 2;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+= 1000 where EmployeeID = 2' at line 1
mysql> Update Employees set Salary + 1000 where EmployeeID = 2;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+ 1000 where EmployeeID = 2' at line 1
mysql> Update Employees set Salary ADD 1000 where EmployeeID = 2;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ADD 1000 where EmployeeID = 2' at line 1
mysql> Update Employees set Salary ADD 1000 where EmployeeID Update Employees set Salary = Salary + 1000 where EmployeeID = 2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>
       Select * from Employees
    -> ;
+------------+-----------+----------+---------------------+------------+--------+
| EmployeeID | FirstName | LastName | Position            | Department | Salary |
+------------+-----------+----------+---------------------+------------+--------+
|          1 | Ajay      | Sharma   | Manager             | HR         |  60000 |
|          2 | Amar      | Rawat    | Developer           | IT         |  56000 |
|          3 | Mahesh    | Yadav    | Accountant          | Finance    |  50000 |
|          4 | Evina     | Steve    | Sale Manager        | Sales      |  58000 |
|          5 | Dinesh    | Kumar    | Marketing Executive | Marketing  |  52000 |
+------------+-----------+----------+---------------------+------------+--------+
5 rows in set (0.00 sec)

mysql>
mysql> DELETE FROM Employees WHERE EmployeeID = 2;
Query OK, 1 row affected (0.01 sec)

mysql> Select * from Employees;
+------------+-----------+----------+---------------------+------------+--------+
| EmployeeID | FirstName | LastName | Position            | Department | Salary |
+------------+-----------+----------+---------------------+------------+--------+
|          1 | Ajay      | Sharma   | Manager             | HR         |  60000 |
|          3 | Mahesh    | Yadav    | Accountant          | Finance    |  50000 |
|          4 | Evina     | Steve    | Sale Manager        | Sales      |  58000 |
|          5 | Dinesh    | Kumar    | Marketing Executive | Marketing  |  52000 |
+------------+-----------+----------+---------------------+------------+--------+
4 rows in set (0.00 sec)

mysql> Insert into (EmployeeID, FirstName, LastName, Position, Department, Salary) Values (2, 'Amar', 'Rawat', 'Developer', 'IT', 56000);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(EmployeeID, FirstName, LastName, Position, Department, Salary) Values (2, 'Amar' at line 1
mysql> Insert into Employees(EmployeeID, FirstName, LastName, Position, Department, Salary) Values (2, 'Amar', 'Rawat', 'Developer', 'IT', 56000);
Query OK, 1 row affected (0.01 sec)

mysql> Select * from Employees;
+------------+-----------+----------+---------------------+------------+--------+
| EmployeeID | FirstName | LastName | Position            | Department | Salary |
+------------+-----------+----------+---------------------+------------+--------+
|          1 | Ajay      | Sharma   | Manager             | HR         |  60000 |
|          2 | Amar      | Rawat    | Developer           | IT         |  56000 |
|          3 | Mahesh    | Yadav    | Accountant          | Finance    |  50000 |
|          4 | Evina     | Steve    | Sale Manager        | Sales      |  58000 |
|          5 | Dinesh    | Kumar    | Marketing Executive | Marketing  |  52000 |
+------------+-----------+----------+---------------------+------------+--------+
5 rows in set (0.00 sec)

mysql> DELETE FROM Employees WHERE EmployeeID = 5;
Query OK, 1 row affected (0.01 sec)

mysql> Select * from Employees;
+------------+-----------+----------+--------------+------------+--------+| EmployeeID | FirstName | LastName | Position     | Department | Salary |+------------+-----------+----------+--------------+------------+--------+|          1 | Ajay      | Sharma   | Manager      | HR         |  60000 ||          2 | Amar      | Rawat    | Developer    | IT         |  56000 ||          3 | Mahesh    | Yadav    | Accountant   | Finance    |  50000 ||          4 | Evina     | Steve    | Sale Manager | Sales      |  58000 |+------------+-----------+----------+--------------+------------+--------+4 rows in set (0.00 sec)

mysql>
mysql> SELECT * FROM Employees WHERE Salary ORDER BY dcse;
ERROR 1054 (42S22): Unknown column 'dcse' in 'order clause'
mysql> SELECT * FROM Employees WHERE Salary ORDER BY dace;
ERROR 1054 (42S22): Unknown column 'dace' in 'order clause'
mysql> SELECT * FROM Employees WHERE Salary ORDER BY desc;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'desc' at line 1
mysql> SELECT * FROM Employees ORDER BY Salary desc;
+------------+-----------+----------+--------------+------------+--------+| EmployeeID | FirstName | LastName | Position     | Department | Salary |+------------+-----------+----------+--------------+------------+--------+|          1 | Ajay      | Sharma   | Manager      | HR         |  60000 ||          4 | Evina     | Steve    | Sale Manager | Sales      |  58000 ||          2 | Amar      | Rawat    | Developer    | IT         |  56000 ||          3 | Mahesh    | Yadav    | Accountant   | Finance    |  50000 |+------------+-----------+----------+--------------+------------+--------+4 rows in set (0.00 sec)

mysql> SELECT * FROM EMPLOYEE LIMIT 2;
ERROR 1146 (42S02): Table 'companydb.employee' doesn't exist
mysql> SELECT * FROM Employees LIMIT 2;
+------------+-----------+----------+-----------+------------+--------+
| EmployeeID | FirstName | LastName | Position  | Department | Salary |
+------------+-----------+----------+-----------+------------+--------+
|          1 | Ajay      | Sharma   | Manager   | HR         |  60000 |
|          2 | Amar      | Rawat    | Developer | IT         |  56000 |
+------------+-----------+----------+-----------+------------+--------+
2 rows in set (0.00 sec)

mysql> SELECT FirstName,Salary AS EmpName, EmpSalary FROM Employees;
ERROR 1054 (42S22): Unknown column 'EmpSalary' in 'field list'
mysql> SELECT FirstName,Salary AS EmpName, EmpSalary FROM EmploySELECT FirstName AS EmpName,Salary AS EmpSalary FROM Employees;
+---------+-----------+
| EmpName | EmpSalary |
+---------+-----------+
| Ajay    |     60000 |
| Amar    |     56000 |
| Mahesh  |     50000 |
| Evina   |     58000 |
+---------+-----------+
4 rows in set (0.00 sec)

mysql>
       SELECT CONCAT(FirstName, LastName) AS EmpName,Salary AS EmpSalary FROM Employees;
+-------------+-----------+
| EmpName     | EmpSalary |
+-------------+-----------+
| AjaySharma  |     60000 |
| AmarRawat   |     56000 |
| MaheshYadav |     50000 |
| EvinaSteve  |     58000 |
+-------------+-----------+
4 rows in set (0.00 sec)

mysql> SELECT CONCAT(FirstName , LastName) AS EmpName,Salary AS EmpSalary FROM Employees;
+-------------+-----------+
| EmpName     | EmpSalary |
+-------------+-----------+
| AjaySharma  |     60000 |
| AmarRawat   |     56000 |
| MaheshYadav |     50000 |
| EvinaSteve  |     58000 |
+-------------+-----------+
4 rows in set (0.00 sec)

mysql> SELECT CONCAT(FirstName,'', LastName) AS EmpName,Salary AS EmpSalary FROM Employees;
+-------------+-----------+
| EmpName     | EmpSalary |
+-------------+-----------+
| AjaySharma  |     60000 |
| AmarRawat   |     56000 |
| MaheshYadav |     50000 |
| EvinaSteve  |     58000 |
+-------------+-----------+
4 rows in set (0.00 sec)

mysql> SELECT CONCAT(FirstName,' ', LastName) AS EmpName,Salary AS EmpSalary FROM Employees;
+--------------+-----------+
| EmpName      | EmpSalary |
+--------------+-----------+
| Ajay Sharma  |     60000 |
| Amar Rawat   |     56000 |
| Mahesh Yadav |     50000 |
| Evina Steve  |     58000 |
+--------------+-----------+
4 rows in set (0.00 sec)
