--  1 Find out the number of documentaries with deleted scenes.

SELECT count(*)
FROM film f
INNER JOIN film_category fc on fc.film_id = f.film_id
INNER JOIN category c on c.category_id = fc.category_id
WHERE f.special_features like'%Deleted Scenes%'
AND c.name = 'Documentary';


#  2 Find out the number of sci-fi movies rented by the store managed by Jon Stephens.


SELECT distinct(i.film_id),sl.first_name,fl.category
FROM inventory i
JOIN rental r on i.inventory_id = r.inventory_id
JOIN film_list fl on fl.FID = i.film_id
JOIN staff sl on sl.staff_id = r.staff_id
WHERE sl.first_name='Jon'
AND sl.last_name='Stephens'
AND fl.category='Sci-Fi';

    
#  3. Find out the total sales from Animation movies.  

SELECT total_sales
FROM sales_by_film_category
WHERE category = 'ANIMATION';

#  4. Find out the top 3 rented category of movies by “PATRICIA JOHNSON”.

SELECT fl.category, count(*) Count
FROM film_list fl
JOIN inventory i on i.film_id = fl.FID
JOIN rental r on r.inventory_id = i.inventory_id
JOIN customer_list cl on cl.ID = r.customer_id
WHERE cl.name = 'PATRICIA JOHNSON'
GROUP BY fl.category
ORDER BY Count DESC
LIMIT 3;

# 5. Find out the number of R rated movies rented by “SUSAN WILSON”.   

SELECT count(*) As Count
FROM rental r
JOIN inventory i on i.inventory_id = r.inventory_id
JOIN customer_list cl on cl.ID = r.customer_id
JOIN film f on f.film_id = i.film_id
WHERE cl.name = 'SUSAN WILSON'
AND f.rating = 'R';

