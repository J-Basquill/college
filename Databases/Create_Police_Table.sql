SELECT * FROM cs130crime;

SELECT * FROM cs130crime WHERE crime LIKE 'Shoplifting' AND location ~*'.*petrol\sstation.*'; 

SELECT lsoaname, COUNT(*) 
FROM cs130crime
GROUP BY lsoaname
ORDER BY count DESC;

SELECT crime, COUNT(*) 
FROM cs130crime
GROUP BY crime
ORDER BY count DESC;

SELECT lsoaname, COUNT(crime)
FROM cs130crime
WHERE lsoaname ~*'^.*birmingham.*$' 
GROUP BY lsoaname 
HAVING count(crime) <=5;

SELECT date_part('day', recordtime), count(crime)
FROM cs130crime
GROUP BY date_part('day',recordtime)
ORDER BY count desc;

SELECT extract(dow from recordtime), count(crime)
FROM cs130crime
WHERE crime ~*'^.*vehicle.*$'
GROUP BY extract(dow from recordtime)
ORDER BY count desc;

SELECT crime, COUNT(crime) 
FROM cs130crime
WHERE recordtime BETWEEN '2017-10-20' AND '2017-10-27'
GROUP BY crime
HAVING COUNT(crime) > 100
ORDER BY count DESC;

SELECT * FROM cs130crime
WHERE CRIME IN(
	SELECT distinct crime FROM cs130crime
	WHERE lsoaname = 'Nuneaton and Bedworth 018E')
AND lsoa !='E01032588';