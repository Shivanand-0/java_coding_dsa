# Write your MySQL query statement below
SELECT ID,MOVIE,DESCRIPTION,RATING
FROM CINEMA
WHERE description<>'boring' and (id%2)<>0
order by rating desc;