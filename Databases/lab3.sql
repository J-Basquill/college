SELECT * FROM public.cs130_2017_lab3 WHERE custname SIMILAR TO '% M______';
SELECT booktitle, bookpages FROM public.cs130_2017_lab3 WHERE ((bookpages%2)=0) AND ((bookpages>=100)AND(bookpages<=200));
SELECT bookisbn FROM public.cs130_2017_lab3 WHERE bookisbn ~'^(0|7).*(0|7)$';
SELECT booktitle FROM public.cs130_2017_lab3 WHERE booktitle ~'.*\d.*';
SELECT booktitle FROM public.cs130_2017_lab3 WHERE booktitle ~*'^.*operative web-enabled.*$';
SELECT custiban FROM public.cs130_2017_lab3 WHERE (char_length(custiban)>=26) AND (custiban ~'^(IE|CH|ES).*$');

SELECT custiban FROM public.cs130_2017_lab3 WHERE custiban ~'^.*\s\d{3}$';

SELECT custiban FROM public.cs130_2017_lab3 WHERE custiban ~ '^.*\d{4}(\s\d{4}){5}.*$';
SELECT * FROM public.cs130_2017_lab3 WHERE (custregion ~'^(IE|UK).*$')AND ((bookprice+((bookprice/100)*12))> 60.00)AND (bookpages >=100);
SELECT booktitle, booktext FROM public.cs130_2017_lab3 WHERE (booktext ~'^.*(CS130\s){2,}.*$');
SELECT booktitle, bookpages FROM public.cs130_2017_lab3 WHERE (log(bookpages)>=2.2227)AND(log(bookpages)<=2.285555);