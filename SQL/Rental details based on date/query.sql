select rental_id,car_id,customer_id,km_driven from rentals where year(return_date)=2019 and month(return_date)=8 order by rental_id;