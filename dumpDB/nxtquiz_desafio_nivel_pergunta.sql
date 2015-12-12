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
-- Table structure for table `desafio_nivel_pergunta`
--

DROP TABLE IF EXISTS `desafio_nivel_pergunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `desafio_nivel_pergunta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `DS_DIRECAO` varchar(255) DEFAULT NULL,
  `DS_PERGUNTA` varchar(255) DEFAULT NULL,
  `NR_PERGUNTA` int(11) DEFAULT NULL,
  `QT_MOVIMENTACAO` varchar(255) DEFAULT NULL,
  `QT_PONTUACAO` int(11) DEFAULT NULL,
  `ID_DESAFIO_NIVEL` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_supcrkry15vagn3keql3uc3vl` (`ID_DESAFIO_NIVEL`),
  CONSTRAINT `FK_supcrkry15vagn3keql3uc3vl` FOREIGN KEY (`ID_DESAFIO_NIVEL`) REFERENCES `desafio_nivel` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `desafio_nivel_pergunta`
--

LOCK TABLES `desafio_nivel_pergunta` WRITE;
/*!40000 ALTER TABLE `desafio_nivel_pergunta` DISABLE KEYS */;
INSERT INTO `desafio_nivel_pergunta` VALUES (1,'C','1°passo',1,'6',30,1),(2,'D','2°passo',2,'20',30,1),(3,'D','3° passo',3,'6',30,1),(4,'DD','4° passo',4,'13',30,1),(5,'E','5° passo',5,'9',30,1),(6,NULL,'1° passo',1,NULL,100,2),(7,NULL,'2° passo',2,NULL,100,2),(8,NULL,'3° passo',3,'0',100,2),(9,NULL,'Passo único',1,NULL,100,3),(10,NULL,'1°passo',1,'0',75,4),(11,NULL,'2°passo',2,'0',75,4),(12,NULL,'3° passo',3,'0',75,4),(13,NULL,'4° passo',4,'0',75,4),(14,NULL,'1° passo',1,'0',50,5),(15,NULL,'2° passo',2,'0',50,5),(16,NULL,'Passo único',1,'0',100,6),(17,NULL,'1°passo',1,'0',75,7),(18,NULL,'2° passo',2,'0',75,7),(19,NULL,'3° passo',3,'0',75,7),(20,NULL,'4° passo',4,'0',75,7),(21,NULL,'1° passo',1,'0',50,8),(22,NULL,'2° passo',2,'0',50,8),(23,NULL,'Passo único',1,'0',100,9);
/*!40000 ALTER TABLE `desafio_nivel_pergunta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-22 14:50:36
