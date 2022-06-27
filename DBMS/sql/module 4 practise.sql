use student_info;

select * from Offering;

select * from Faculty WHERE FacNo="543-21-0987";

select FacFirstName, FacLastName, FacSalary from Faculty WHERE FacSalary >65000 AND FacRank="PROF";

select FacCity, FacState from Faculty;

select distinct FacCity, FacState from Faculty;

select FacFirstName, FacLastName, FacCity, FacSalary*1.1 AS IncresedSalary, FacHireDate
 from Faculty 
 where date_format(FacHireDate,'%Y')>2005;
 
 select * from Offering where CourseNo like 'IS%';
 
 select FacFirstName, FacLastName, FacHireDate
 from Faculty
 where FacHireDate between '2008-01-01' AND '2009-12-31';
 
 select * from Offering;
 
 select OfferNo, CourseNo from Offering
 where FacNo is null and OffTerm="SUMMER" and OffYear=2017;
 
 select OfferNo, CourseNo, FacNo from Offering
 where (OffTerm = "FALL" AND OffYear = 2016) or (OffTerm = "WINTER" AND OffYear = 2017);
 


select OfferNo, CourseNo, FacFirstName, FacLastName from Offering, Faculty
where OffTerm = 'FALL' and OffYear = 2016
and FacRank = 'ASST' and CourseNo like 'IS%'
AND Faculty.Facno = Offering.FacNo;

select OfferNo, CourseNo, FacFirstName, FacLastName from Offering
inner join Faculty on Faculty.Facno = Offering.FacNo
where OffTerm = 'FALL' and OffYear = 2016
and FacRank = 'ASST' and CourseNo like 'IS%';

select OfferNo, Offering.CourseNo, OffDays, CrsUnits, OffLocation, OffTime
from Faculty, Offering, Course
where Faculty.FacNo = Offering.FacNo
and Course.CourseNo = Offering.CourseNo
and OffYear = 2016 and OffTerm ='FALL'
and FacFirstName='LEONARD' and FacLastName = 'VINCE';


select OfferNo, Offering.CourseNo, OffDays, CrsUnits, OffLocation, OffTime from Offering
inner join Course on Course.CourseNo = Offering.CourseNo
inner join Faculty on Faculty.FacNo = Offering.FacNo
where OffYear = 2016 and OffTerm ='FALL'
and FacFirstName='LEONARD' and FacLastName = 'VINCE';

select FacNo, FacRank, FacSalary
from Faculty
order by FacRank;

select FacRank, AVG(FacSalary) as AvgSalary
from Faculty
group by FacRank
order by FacRank;

select * from Student;

select stdMajor, AVG(stdGPA)
from Student
where stdClass in ('JR','SR')
group by stdMajor
Having AVG(stdGPA)>3.1;