use student_info;


select Offering.OfferNo, count(*) as NumStudents from Offering
inner join Enrollment on Enrollment.OfferNo = Offering.OfferNo
where OffYear = 2017 group by Offering.OfferNo;

select Enrollment.OfferNo, CourseNo, Avg(stdGPA) as AvgGPA from Enrollment
inner join Offering on Enrollment.OfferNo = Offering.OfferNo
inner join Student on Enrollment.stdNo = Student.stdNo
where  OffYear = 2016 and OffTerm = "FALL"
group by Enrollment.OfferNo
having avg(stdGPA) > 3.0;

select * from Offering;
select * from Faculty;
select * from Student;
select * from Offering;
select * from Offering;


select Offering.OfferNo, Offering.CourseNo, CrsUnits, OffDays, OffLocation, OffTime from Offering
inner join Faculty on Faculty.FacNo = Offering.FacNo
inner join Course on Course.CourseNo = Offering.CourseNo
where OffYear = 2016 and OffTerm = "FALL" and Faculty.FacFirstName = "LEONARD" and Faculty.FacLastName = "VINCE";


select Offering.OfferNo, Offering.CourseNo, OffDays, OffLocation, OffTime, concat(FacFirstName," ",FacLastName) as FacName from Offering
inner join Faculty on Faculty.FacNo = Offering.FacNo
inner join Enrollment on Enrollment.OfferNo = Offering.OfferNo
inner join Student on Student.stdNo = Enrollment.StdNo
where OffYear = 2017 and OffTerm = "SPRING" and Student.stdFirstName = "BOB" and Student.stdLastName = "NORBERT";


select Offering.OfferNo, Offering.CourseNo, OffDays, OffLocation, OffTime, CrsUnits, concat(FacFirstName," ",FacLastName) as FacName from Offering
inner join Faculty on Faculty.FacNo = Offering.FacNo
inner join Enrollment on Enrollment.OfferNo = Offering.OfferNo
inner join Course on Course.CourseNo = Offering.CourseNo
inner join Student on Student.stdNo = Enrollment.StdNo
where OffYear = 2017 and OffTerm = "SPRING" and Student.stdFirstName = "BOB" and Student.stdLastName = "NORBERT";


select Offering.OfferNo, Count(*) as count, AVG(stdGPA) as GPA from Offering
inner join Enrollment on Enrollment.OfferNo = Offering.OfferNo
inner join Student on Student.stdNo = Enrollment.StdNo
where OffYear = 2017
group by Offering.OfferNo
having GPA > 3.3;


select CourseNo, Offering.OfferNo, count(*) as count from Offering
inner join Enrollment on Enrollment.OfferNo = Offering.OfferNo
where OffYear = 2017 and OffTerm = "SPRING"
group by Offering.OfferNo;

select Offering.OfferNo, CourseNo, FacFirstName, FacLastName, avg(stdGPA) as Avg from Offering
inner join Faculty on Faculty.FacNo = Offering.FacNo
inner join Enrollment on Enrollment.OfferNo = Offering.OfferNo
inner join Student on Student.stdNo = Enrollment.StdNo
where OffYear = 2016 and OffTerm = "FALL"
group by Offering.OfferNo
having Avg > 3.0;

select FacFirstName as FirstName, FacLastName as LastName from Faculty
union select stdFirstName as FirstName, stdLastName as LastName from Student;

INSERT INTO Student (stdNo,stdFirstName, stdLastName, stdCity, stdState, stdZip, stdMajor, stdClass, stdGPA)
values ('999-99-9999','JOE','STUDENT','SEATAC','WA','98042-1121','FR','IS',0.0);

use student_info;
select * from Student;

update Student set stdMajor = "ACCT", stdClass = "SO"
where stdNo = "999-99-9999";

delete from Student where stdNo = "999-99-9999";