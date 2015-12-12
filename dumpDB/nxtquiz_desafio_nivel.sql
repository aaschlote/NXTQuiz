CREATE DATABASE  IF NOT EXISTS `nxtquiz` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `nxtquiz`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: nxtquiz
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `desafio_nivel`
--

DROP TABLE IF EXISTS `desafio_nivel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `desafio_nivel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `DS_QUESTAO` varchar(255) DEFAULT NULL,
  `NR_NIVEL` int(11) DEFAULT NULL,
  `QT_PERGUNTAS` int(11) DEFAULT NULL,
  `ID_DESAFIO` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ehh5b0o5anp4ugwiip7gje3io` (`ID_DESAFIO`),
  CONSTRAINT `FK_ehh5b0o5anp4ugwiip7gje3io` FOREIGN KEY (`ID_DESAFIO`) REFERENCES `desafio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `desafio_nivel`
--

LOCK TABLES `desafio_nivel` WRITE;
/*!40000 ALTER TABLE `desafio_nivel` DISABLE KEYS */;
INSERT INTO `desafio_nivel` VALUES (1,'Nível 1',1,5,1),(2,'Nível 2',2,3,1),(3,'Nível 3',3,1,1),(4,'Nível 1',1,4,2),(5,'Nível 2',2,2,2),(6,'Nível 3',3,1,2),(7,'Nível 1',1,4,3),(8,'Nível 2',2,2,3),(9,'Nível 3',3,1,3);
/*!40000 ALTER TABLE `desafio_nivel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-22 14:50:37
