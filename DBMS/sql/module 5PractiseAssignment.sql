use intercollege_athletics;

SELECT EventNo, DateHeld, Customer.CustNo, CustName,
               Facility.FacNo, FacName
  FROM EventRequest INNER JOIN Customer 
        ON EventRequest.CustNo = Customer.CustNo 
              INNER JOIN Facility ON EventRequest.FacNo = Facility.FacNo
  WHERE City = 'Boulder' 
        AND DateHeld BETWEEN '2018-01-01' AND '2018-12-31';
        
SELECT Customer.CustNo, CustName, EventNo, 
               DateHeld, Facility.FacNo, FacName, EstCost/EstAudience AS AudCost
  FROM EventRequest INNER JOIN Customer 
       ON EventRequest.CustNo = Customer.CustNo 
        INNER JOIN Facility ON EventRequest.FacNo = Facility.FacNo
  WHERE DateHeld BETWEEN '2018-01-01' AND '2018-12-31' 
        AND EstCost/EstAudience < 0.2;
        
SELECT Customer.CustNo, CustName, SUM(EstCost) AS TotEstCost
  FROM EventRequest INNER JOIN Customer 
       ON EventRequest.CustNo = Customer.CustNo
  WHERE Status = 'Approved'
  GROUP BY Customer.CustNo, CustName;
  
INSERT INTO Customer 
  (CustNo, CustName, Address, Internal, Contact, Phone, City, State, Zip)
VALUES ('C9999999', 'Michael Mannino', '123 Any Street', 'Y', 'Self', '720000',
               'Denver', 'CO', '80204');
               
select * from Customer;
select * from ResourceTbl;


SET SQL_SAFE_UPDATES = 0;

UPDATE Resourcetbl 
  SET Rate = Rate * 1.1
  WHERE ResNo = 'R103';
SET SQL_SAFE_UPDATES = 1;


delete from Customer
where CustNo="C9999999";