create database Company1;
use Company1;


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

Select * from Employees;

Select * from Employees
where location='chennai';

Select * from Employees
order by location;

select * from Employees
where location='chennai' and date_of_join=2018-01-15;

select * from Employees
where location='chennai' or date_of_join=2018-01-15;

select * from Employees
where not location='chennai';

Update Employees
set employee_name='sri'
where employee_id=1;

select employee_id as id
from Employees;

drop table department;

create table department (
	department_id INT PRIMARY KEY,
    department_name VARCHAR(100),
    designation ENUM('Training', 'Development', 'Testing', 'HR')
);
    
INSERT INTO department (department_id, department_name, designation) VALUES
	(101, 'Java Developer' , 'Development'),
	(102, 'Automation Testing' , 'Testing');

select department.department_id, department.department_name, department.designation
from department
inner join Employees on department.designation=Employees.designation;

SELECT designation FROM Employees
UNION
SELECT designation FROM department
ORDER BY designation;

select employee_id,employee_name from Employees;

select * from Employees
where salary>50000;

select * from Employees
where (date_of_join)='2021-08-14';

select * from Employees
where employee_name like 's%';

select avg(salary) as averagesalary
from Employees;

select sum(salary) as sumofsalary
from Employees;

select count(employee_id) as countofemployee
from Employees;

select employee_name,salary
from Employees
where salary=(select max(salary) from Employees);
