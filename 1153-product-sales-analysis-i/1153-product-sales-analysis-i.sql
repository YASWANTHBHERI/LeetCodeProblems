# Write your MySQL query statement below
select product.product_name, sales.year, sales.price from product inner join sales on product.product_id = sales.product_id;