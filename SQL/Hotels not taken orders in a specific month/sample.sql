select hotel_id,hotel_name,hotel_type from hotel_details where hotel_id not in (select hotel_id from orders where year(order_date)=2019 and month(order_date)=5) order by hotel_id;