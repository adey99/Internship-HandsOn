select order_date, SUM(order_amount) as 'TOTAL_SALE' from orders group by order_date order by order_date;