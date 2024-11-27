create database Company;
use Company;


CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(100),
    date_of_birth DATE,
    date_of_join DATE,
    designation ENUM('Training', 'Development', 'Testing', 'HR'),
    location ENUM('Chennai', 'Hyderabad', 'Kochi'),
    mobile_number VARCHAR(15),
    salary DECIMAL(10, 2)
);

INSERT INTO Employees (employee_id, employee_name, date_of_birth, date_of_join, designation, location, mobile_number, salary) VALUES
(1, 'John', '1990-05-12', '2018-01-15', 'Development', 'Chennai', '9876543210', 55000.00),
(2, 'Sam', '1985-09-25', '2017-11-20', 'Testing', 'Hyderabad', '9123456789', 60000.00),
(3, 'Ram', '1992-02-10', '2020-03-22', 'HR', 'Kochi', '9988776655', 45000.00),
(4, 'Siva ', '1988-07-30', '2019-06-10', 'Training', 'Chennai', '9444332211', 40000.00),
(5, 'Kumar', '1995-11-05', '2021-08-14', 'Development', 'Hyderabad', '9612345678', 65000.00);

select * from Employees;
 
CREATE TABLE RowCount (
    table_name VARCHAR(100) PRIMARY KEY,
    row_count INT
);
 
INSERT INTO RowCount (table_name, row_count) VALUES ('Employees', 0);
select * from RowCount;
 
DELIMITER $$
CREATE TRIGGER after_employee_insert
AFTER INSERT ON Employees
FOR EACH ROW
BEGIN
    UPDATE RowCount
    SET row_count = row_count + 1
    WHERE table_name = 'Employees';
END $$
DELIMITER ;

select* from Employees;

INSERT INTO Employees (employee_id, employee_name, date_of_birth, date_of_join, designation, location, mobile_number, salary) 
VALUES (6, 'Sri', '1993-12-15', '2022-05-30', 'Testing', 'Kochi', '9876543211', 50000.00);
 
 
CREATE VIEW Kochi_HR_Employees AS
SELECT employee_id, employee_name, date_of_birth, date_of_join, designation, location, mobile_number, salary

FROM Employees
WHERE location = 'Kochi' AND designation = 'HR';
SELECT * FROM Kochi_HR_Employees;
 
-- Stored Procedure

DELIMITER $$
CREATE PROCEDURE GetKochiHREmployees()
BEGIN
    SELECT employee_id, employee_name, date_of_birth, date_of_join, designation, location, mobile_number, salary
    FROM Employees
    WHERE location = 'Kochi' AND designation = 'HR';
END $$
DELIMITER ;
 
CALL GetKochiHREmployees();

-- function 

DELIMITER $$
CREATE FUNCTION CheckKochiHREmployees()
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE emp_count INT;
    SELECT COUNT(*) INTO emp_count
    FROM Employees
    WHERE location = 'Kochi' AND designation = 'HR';
    RETURN emp_count;
END $$
DELIMITER ;

SELECT CheckKochiHREmployees();

DELIMITER $$
CREATE PROCEDURE GetEmployeesByYearJoin (IN year_join INT)
BEGIN
    SELECT employee_id, employee_name, date_of_join
    FROM Employees
    WHERE YEAR(date_of_join) = year_join;
END $$
DELIMITER ;

CALL GetEmployeesByYearJoin(2017);

select * from Employees;

 