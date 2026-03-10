# Write your MySQL query statement below
Select score, 
   DENSE_RANK() OVER
    (ORDER BY score DESC) AS `rank`
FROM Scores ORDER BY score Desc ;