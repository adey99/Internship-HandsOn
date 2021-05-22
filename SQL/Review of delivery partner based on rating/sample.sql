select partner_id,partner_name,
case
    when rating>=4 then 'GOOD'
    when rating>=2 then 'AVERAGE'
    else 'WORST'
end as REVIEW
from delivery_partners order by partner_id;