use sakila;

-- 1. Find out the PG-13 rated comedy movies. DO NOT use the film_list table. --

SELECT film_id, title
FROM film
WHERE rating = 'PG-13'
	AND film_id IN
    ( SELECT film_id
	  FROM film_category
      WHERE category_id in
      (  SELECT category_id
         FROM category
         WHERE name = 'Comedy'));

-- Alternate Method -- 
SELECT film.film_id, title
FROM film
INNER JOIN film_category on film_category.film_id = film.film_id
INNER JOIN category on category.category_id = film_category.category_id
WHERE rating = 'PG-13'
	AND name = 'Comedy';


-- 2. Find out the top 3 rented horror movies.

SELECT title,count(title) count
FROM film_list fl
INNER JOIN inventory i on i.film_id = fl.FID
INNER JOIN rental r on r.inventory_id = i.inventory_id
WHERE fl.category = 'Horror'
GROUP BY title
ORDER BY count DESC
LIMIT 3;

SELECT title, count(ALL fl.title) count
FROM film_list fl, inventory i, rental r
WHERE fl.category = 'Horror'
	AND fl.FID = i.film_id
	AND i.inventory_id = r.inventory_id
GROUP BY title
ORDER BY count DESC
LIMIT 3;
    
    
-- 3. Find out the list of customers from India who have rented sports movies.

SELECT *
FROM customer_list
WHERE country = 'India'
AND ID IN 
	( SELECT r.customer_id
	  FROM film_list fl, inventory i, rental r
        WHERE fl.category = 'Sports'
			AND fl.FID = i.film_id
			AND r.inventory_id = i.inventory_id
        GROUP BY r.customer_id);
        
-- Alternative method --

SELECT *
FROM customer_list
WHERE country = 'India'
AND ID IN
	(  SELECT customer_id
       FROM rental
       WHERE inventory_id in
			(  SELECT inventory_id
			   FROM inventory
               WHERE film_id IN
					(  SELECT FID
					   FROM film_list
                       WHERE category = 'Sports')));

SELECT distinct(ID), name 
FROM customer_list cl
INNER JOIN rental r on r.customer_id = cl.ID
INNER JOIN inventory i on i.inventory_id = r.inventory_id
INNER JOIN film_list fl on fl.FID = i.film_id
WHERE country = 'India'
AND category = 'Sports';



-- 4. Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.

SELECT *
FROM customer_list cl
WHERE cl.country = 'Canada'
AND ID IN (SELECT r.customer_id
		   FROM actor a, film_actor fa, inventory i, rental r
           WHERE a.first_name = 'NICK'
           AND a.last_name = 'WAHLBERG'
           AND a.actor_id = fa.actor_id
           AND fa.film_id = i.film_id
           AND i.inventory_id = r.inventory_id);
  

-- 5. Find out the number of movies in which “SEAN WILLIAMS” acted.

SELECT COUNT(fa.film_id) as Count
FROM film_actor fa
INNER JOIN actor a on a.actor_id = fa.actor_id
WHERE a.first_name = 'SEAN'
AND a.last_name = 'WILLIAMS';

-- AlternativeMethod

SELECT COUNT(fa.film_id) as count
FROM actor a, film_actor fa
WHERE a.first_name = 'SEAN'
AND a.last_name = 'WILLIAMS'
AND fa.actor_id = a.actor_id;