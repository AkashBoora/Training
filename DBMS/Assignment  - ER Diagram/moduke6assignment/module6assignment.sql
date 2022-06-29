use module6assignment;

CREATE TABLE `module6assignment`.`Patient` (
  `PatNo` VARCHAR(8) NOT NULL,
  `PatFirstName` VARCHAR(45) NOT NULL,
  `PatLastName` VARCHAR(45) NOT NULL,
  `PatDOB` DATE NOT NULL,
  PRIMARY KEY (`PatNo`));
  
  
  CREATE TABLE `module6assignment`.`LabVisit` (
  `LVNo` VARCHAR(8) NOT NULL,
  `LVDate` DATE NOT NULL,
  `LVProvNo` VARCHAR(8) NOT NULL,
  `LVOrdNo` VARCHAR(8) NOT NULL,
  `PatNo` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`LVNo`),
  INDEX `FKPatNo_idx` (`PatNo` ASC) VISIBLE,
  CONSTRAINT `FKPatNo`
    FOREIGN KEY (`PatNo`)
    REFERENCES `module6assignment`.`Patient` (`PatNo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `module6assignment`.`Lab` (
  `LabNo` VARCHAR(8) NOT NULL,
  `LabName` VARCHAR(45) NOT NULL,
  `LabStreet` VARCHAR(45) NOT NULL,
  `LabCity` VARCHAR(45) NOT NULL,
  `LabZip` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`LabNo`));
  
  ALTER TABLE `module6assignment`.`LabVisit` 
ADD COLUMN `LabNo` VARCHAR(8) NOT NULL AFTER `PatNo`,
ADD INDEX `FKLabNo_idx` (`LabNo` ASC) VISIBLE;
;
ALTER TABLE `module6assignment`.`LabVisit` 
ADD CONSTRAINT `FKLabNo`
  FOREIGN KEY (`LabNo`)
  REFERENCES `module6assignment`.`Lab` (`LabNo`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
  ALTER TABLE `module6assignment`.`LabVisit` 
ADD COLUMN `LabNo` VARCHAR(8) NOT NULL AFTER `PatNo`,
ADD INDEX `FKLabNo_idx` (`LabNo` ASC) VISIBLE;
;
ALTER TABLE `module6assignment`.`LabVisit` 
ADD CONSTRAINT `FKLabNo`
  FOREIGN KEY (`LabNo`)
  REFERENCES `module6assignment`.`Lab` (`LabNo`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;