create database module6practise;
use module6practise;

create table Student
( StdNo VARCHAR(8) NOT NULL,
  StdFirstName VARCHAR(50) NOT NULL,
  StdLastName VARCHAR(50) NOT NULL,
  StdAdmitSemester INTEGER NOT NULL,
  StdAdmitYear INTEGER NOT NULL,
  StdEnrollStatus VARCHAR(10) NOT NULL,
CONSTRAINT PKStudent PRIMARY KEY (StdNo));

create table Paper
( PaperNo VARCHAR(8) NOT NULL,
  StdNo VARCHAR(8),
  PaperSubmitDate DATE NOT NULL,
  PaperTitle VARCHAR(500) NOT NULL,
  PaperAccepted CHAR(1) NOT NULL,
  PaperType VARCHAR(10) NOT NULL,
  CONSTRAINT PKPaper PRIMARY KEY (PaperNo),
  CONSTRAINT FKStdNo FOREIGN KEY (StdNo)
  references Student(StdNo));


create table Evaluator
 (EvalNo VARCHAR(8) NOT NULL,
  EvalFirstName VARCHAR(50) NOT NULL,
  EvalLastName VARCHAR(50) NOT NULL,
  EvalEmail VARCHAR(50) NOT NULL,
  EvalOffice VARCHAR(50) NOT NULL,
  CONSTRAINT PKEvaluator PRIMARY KEY (EvalNo));

create table Evaluation
( PaperNo VARCHAR(8) NOT NULL,
  EvalNo VARCHAR(8) NOT NULL,
  EvalDate DATE NOT NULL,
  EvalLitReview VARCHAR(30) NOT NULL,
  EvalTechWriting VARCHAR(30) NOT NULL,
  EvalProbId VARCHAR(8) NOT NULL,
  EvalModelDev VARCHAR(30) NOT NULL,
  EvalOveral VARCHAR(30) NOT NULL,
  CONSTRAINT PKEvaluation PRIMARY KEY (PaperNo,EvalNo),
  CONSTRAINT FKEvalNo FOREIGN KEY (EvalNo)
  references Evaluator(EvalNo),
  CONSTRAINT FKPaperNo FOREIGN KEY (PaperNo)
  references Paper(PaperNo)  );