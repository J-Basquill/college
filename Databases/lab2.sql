﻿SELECT car_make, car_model FROM cs130lab2 ORDER BY car_make;
SELECT car_color FROM cs130lab2 WHERE (car_color = 'Yellow');
SELECT 	* FROM cs130lab2 WHERE (parking_day != 'Saturday') AND (parking_day != 'Sunday');
SELECT * FROM cs130lab2 WHERE (car_model LIKE '%2500');
SELECT * FROM cs130lab2 WHERE (car_make = 'Toyota') AND (car_model = 'Corolla');
SELECT car_reg, car_make, car_model FROM cs130lab2 WHERE (car_reg LIKE '%MH%') OR (car_reg LIKE '%KE%');
SELECT car_reg, car_make, car_model FROM cs130lab2 WHERE (car_reg LIKE '16%');
SELECT car_reg, num_occupants, parking_hours FROM cs130lab2 WHERE (parking_hours >= 4) AND (num_occupants >= 3);
SELECT car_reg, parking_day, parking_level, car_color FROM cs130lab2 WHERE ((parking_level = 3) AND (parking_day = 'Tuesday')) OR (car_color = 'Green');
SELECT * FROM cs130lab2 WHERE (car_make LIKE 'T%') AND (car_model LIKE 'T%') AND (parking_day LIKE 'T%');
SELECT * FROM cs130lab2 WHERE (car_reg LIKE '%-D-%') AND (parking_level !=3);
SELECT * FROM cs130lab2 WHERE (car_reg LIKE '1%1') AND ((car_make = 'BMW') OR (car_make = 'Chevrolet'));