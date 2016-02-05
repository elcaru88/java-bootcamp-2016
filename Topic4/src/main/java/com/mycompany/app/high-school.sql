CREATE DATABASE  IF NOT EXISTS `high-school` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `high-school`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: high-school
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `idcourse` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `startTime` time(6) DEFAULT NULL,
  `endTime` time(6) DEFAULT NULL,
  `idteacher` int(11) NOT NULL,
  `hoursbyweek` time(6) DEFAULT NULL,
  `days` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcourse`),
  KEY `course_fk2_idx` (`idteacher`),
  CONSTRAINT `course_fk2` FOREIGN KEY (`idteacher`) REFERENCES `teacher` (`idteacher`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (100,'Aprendiendo Java','08:00:00.000000','12:00:00.000000',1,'00:00:20.000000','Mon,Tue,Wed'),(200,'Basic DB','13:00:00.000000','15:00:00.000000',3,'00:00:15.000000','Tue,Wed'),(300,'Learning Spring','09:00:00.000000','11:00:00.000000',3,'00:00:20.000000','Mon,Fri');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `firstname` varchar(40) DEFAULT NULL,
  `idstudent` int(11) NOT NULL,
  `dateofbirth` date DEFAULT NULL,
  `regnumber` int(11) NOT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idstudent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('Ede',0,'2000-01-14',3,'Noy'),('FName1',1,'1990-01-14',1000,'Adr'),('Sago',2,'1991-02-14',1001,'Fit'),('Mare',3,'1996-07-10',1003,'PName'),('Namew',4,'1992-09-11',1004,'Yaame'),('FName',5,'1993-10-12',1005,'Alca'),('Dae',6,'1989-01-26',1006,'Blast'),('FName',7,'1994-11-11',1007,'Ctame'),('Famu',8,'1991-12-02',1008,'Etame'),('Dmy',9,'1992-03-07',1009,'Estame'),('Explme',10,'1990-05-09',1010,'RName'),('Jose',11,'1998-09-20',1050,'Gonzales'),('Roberto',12,'1995-07-01',1060,'Apevido');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_course`
--

DROP TABLE IF EXISTS `student_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_course` (
  `idstudent` int(11) NOT NULL,
  `idcourse` int(11) NOT NULL,
  `partialnote1` float DEFAULT NULL,
  `partialnote2` float DEFAULT NULL,
  `partialnote3` float DEFAULT NULL,
  `finalnote` float DEFAULT NULL,
  PRIMARY KEY (`idstudent`,`idcourse`),
  KEY `idteacher_fk1_idx` (`idcourse`),
  CONSTRAINT `idstudent_fk1` FOREIGN KEY (`idstudent`) REFERENCES `student` (`idstudent`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idteacher_fk1` FOREIGN KEY (`idcourse`) REFERENCES `course` (`idcourse`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_course`
--

LOCK TABLES `student_course` WRITE;
/*!40000 ALTER TABLE `student_course` DISABLE KEYS */;
INSERT INTO `student_course` VALUES (1,100,NULL,NULL,NULL,NULL),(1,200,7.5,8,9,NULL),(2,100,NULL,NULL,NULL,NULL),(2,200,3,5.6,7.8,NULL),(2,300,7,5.6,NULL,NULL),(3,100,NULL,NULL,NULL,NULL),(3,200,2,8,9.3,NULL),(3,300,2,8,NULL,NULL),(4,100,NULL,NULL,NULL,NULL),(4,200,4,6,5,NULL),(5,100,NULL,NULL,NULL,NULL),(5,200,5,8,4,NULL),(5,300,8,8,NULL,NULL),(6,100,NULL,NULL,NULL,NULL),(6,200,3,9,7,NULL),(6,300,3,9,NULL,NULL),(7,100,NULL,NULL,NULL,NULL),(7,200,4,10,8,NULL),(7,300,1,10,NULL,NULL),(8,100,NULL,NULL,NULL,NULL),(8,200,4,2,9,NULL),(8,300,7,9,NULL,NULL),(9,100,NULL,NULL,NULL,NULL),(9,200,5,5,8,NULL),(9,300,8,7,NULL,NULL),(10,100,NULL,NULL,NULL,NULL),(10,200,5,3,8.4,NULL),(10,300,6,6,NULL,NULL),(11,300,4,6,NULL,NULL),(12,300,3,6,NULL,NULL);
/*!40000 ALTER TABLE `student_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `idteacher` int(11) NOT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `dateofbirth` date DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idteacher`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'Profe','1980-05-20','Sort'),(2,'Kid','1975-02-15','Bao'),(3,'Billy','1985-04-02','Jonn');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-02 23:35:53
