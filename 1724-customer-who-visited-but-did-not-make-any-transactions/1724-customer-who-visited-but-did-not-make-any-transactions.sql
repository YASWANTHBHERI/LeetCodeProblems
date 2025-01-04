# Write your MySQL query statement below
-- select visits.customer_id, count(visits.visit_id) as count_no_trans from visits where visits.visit_id not in (select transactions.visit_id from transactions) group by visits.customer_id order by visits.visit_id desc;

select visits.customer_id, count(visits.visit_id) as count_no_trans from visits left join transactions on visits.visit_id = transactions.visit_id where transactions.visit_id is null group by visits.customer_id;