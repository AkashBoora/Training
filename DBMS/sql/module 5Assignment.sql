select EventRequest.EventNo, DateHeld, count(*) from EventPlan
inner join EventRequest on EventRequest.EventNo = EventPlan.EventNo
where WorkDate between "2018-12-01" and "2018-12-31"
group by EventRequest.EventNo
having count(*)>1;

select PlanNo, EventRequest.EventNo, WorkDate, Activity from EventPlan
inner join EventRequest on EventRequest.EventNo = EventPlan.EventNo
inner join Facility on EventRequest.FacNo = Facility.FacNo
where FacName = "Basketball arena";

select EventPlan.EventNo,DateHeld,EstCost from EventRequest
inner join EventPlan on EventPlan.EventNo = EventRequest.EventNo
inner join Employee on Employee.EmpNo = EventPlan.EmpNo
inner join Facility on Facility.FacNo = EventRequest.FacNo
where EmpName = "Mary Manager"
and FacName = "Basketball arena"
and DateHeld between "2018-10-01" and "2018-12-31";

select EventPlanLine.PlanNo, LineNo, ResName, NumberFld, LocName, TimeStart, TimeEnd from EventPlanLine
inner join EventPlan on EventPlan.PlanNo = EventPlanLine.PlanNo
inner join EventRequest on EventPlan.EventNo = EventRequest.EventNo
inner join Location on EventPlanLine.LocNo = Location.LocNo
inner join ResourceTbl on ResourceTbl.ResNo = EventPlanLine.ResNo
inner join Facility on Facility.FacNo = EventRequest.FacNo
where FacName = "Basketball arena"
and DateHeld between "2018-10-01" and "2018-12-31";

select * from Employee;
select * from Facility;
select * from Location;

insert into Facility (FacNo,FacName) values ("F104","Swimming Pool");

insert into Location (LocNo,FacNo,LocName) values ("L107","F104","Door");

insert into Location (LocNo,FacNo,LocName) values ("L108","F104","LockerRoom");

SET SQL_SAFE_UPDATES = 0;
update Location SET LocName="Door" where LocName="Gate";
SET SQL_SAFE_UPDATES = 1;

delete from Location where LocNo="L108";

