select hotel_details.hotel_id,hotel_name,NO_OF_ORDERS from hotel_details,(select hotel_id,count(hotel_id) as NO_OF_ORDERS from orders group by hotel_id) as ord_tab where NO_OF_ORDERS>5 and ord_tab.hotel_id=hotel_details.hotel_id order by hotel_details.hotel_id;