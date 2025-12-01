# Write your MySQL query statement below

select 
Person.firstName,
Person.lastName,
Address.city,
Address.state From Person Left join Address ON  Person.personId = Address.personId ;