use intercollege_athletics;

select CustNo, CustName, Phone, City from Customer;

select CustNo, CustName, Phone, City from Customer where State="CO";

select * from EventRequest where EstCost>4000 order by DateHeld;

select EventNo, DateHeld, EstAudience from EventRequest 
where (Status = "Approved" and EstAudience > 9000) 
or (Status = "Pending" and EstAudience > 7000);

select EventNo, DateHeld, EventRequest.CustNo, CustName from EventRequest
inner join Customer on Customer.CustNo = EventRequest.CustNo
where City = "Boulder" and DateHeld between "2018-12-01" and "2018-12-31";

select PlanNo, AVG(NumberFld)  from EventPlanLine
where LocNo = "L100"
group by PlanNo;

select PlanNo, count(*) as Count, AVG(NumberFld)  from EventPlanLine
where LocNo = "L100"
group by PlanNo
having Count >1;