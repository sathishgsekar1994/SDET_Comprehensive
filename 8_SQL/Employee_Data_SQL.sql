create database Employee;
use Employee;  

create table EMP_Data( 
    EMP_No int(5),
    EMP_Name varchar(20),
    EMP_Exp int(5),
    EMP_Department varchar(20),
    EMP_Salary int(10)
);

insert into EMP_Data values(101,'Vinay Sharma',10,'IT',30000);
insert into EMP_Data values(102,'Mel Gibson',7,'Sales',15000);
insert into EMP_Data values(103,'Naveen Reddy',5,'Finance',10000);
insert into EMP_Data values(104,'Richa Sruthi',12,'IT',50000);
insert into EMP_Data values(105,'Richard Joey',20,'Sales',20000);
insert into EMP_Data values(106,'Lakshm Narayana ',14,'Finance',20000);
insert into EMP_Data values(107,'Preethi Sharma',3,'Sales',15000);
insert into EMP_Data values(108,'Maria Garcia',9,'IT',40000);
insert into EMP_Data values(109,'David Smith',10,'IT',50000);
insert into EMP_Data values(110,'Wade Wilson',14,'Sales',70000);
select * from EMP_Data;

select * from EMP_Data where EMP_Department='IT';
select * from EMP_Data where EMP_Department='Sales';