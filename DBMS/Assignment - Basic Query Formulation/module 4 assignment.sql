use intercollege_athletics;
/*
1.	List the city, state, and zip codes in the customer table.  Your result should not have duplicates. 
(Hint: The DISTINCT keyword eliminates duplicates.)

2.	List the name, department, phone number, and email address of employees with a phone number beginning with “3-”.

3.	List all columns of the resource table with a rate between $10 and $20. Sort the result by rate.

4.	List the event requests with a status of “Approved” or “Denied” and an authorized date in July 2018. 
Include the event number, authorization date, and status in the output. (Hint: see the examples in Module 4 for date constants in Oracle and MySQL.)

5.	List the location number and name of locations that are part of the “Basketball arena”.  
Your WHERE clause should not have a condition involving the facility number compared to a constant (“F101”). 
Instead, you should use a condition on the FacName column for the value of “Basketball arena”.

6.	For each event plan, list the plan number, count of the event plan lines, and sum of the number of resources assigned.  
For example, plan number “P100” has 4 lines and 7 resources assigned.  You only need to consider event plans that have at least one line.
*/
select distinct(City), State, Zip from Customer;

select Empname, Department, Phone, Email from Employee
where Phone Like "3-%";

select * from ResourceTbl where Rate between 10 and 20
order by Rate;

select EventNo, DateAuth, Status from EventRequest
where Status In("Approved", "Denied") and DateAuth between "2018-07-01" and "2018-07-31";

select LocNo,LocName from Location inner join Facility on Facility.FacNo = Location.FacNo where FacName="Basketball arena";

select PlanNo, count(*), sum(NumberFld) from EventPlanLine group by PlanNo;

select * from EventPlanLine;
