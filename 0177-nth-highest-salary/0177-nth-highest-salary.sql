CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE offset_val  INT;
SET offset_val = N-1;
  RETURN (
      # Write your MySQL query statement below.
   SELECT (SELECT Distinct salary 
   FROM Employee 
   ORDER BY salary DESC limit offset_val,1)
  );
END