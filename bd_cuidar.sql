CREATE DATABASE  IF NOT EXISTS `bd_cuidar` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bd_cuidar`;
-- MySQL dump 10.13  Distrib 8.0.24, for Linux (x86_64)
--
-- Host: localhost    Database: bd_cuidar
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

SET GLOBAL time_zone = '-3:00'; /* Para sincronizar el uso horario */

--
-- Table structure for table `Lugar`
--

DROP TABLE IF EXISTS `Lugar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Lugar` (
  `idLugar` int NOT NULL AUTO_INCREMENT,
  `lugar` varchar(35) NOT NULL,
  `codPostal` varchar(10) NOT NULL,
  PRIMARY KEY (`idLugar`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Lugar`
--

LOCK TABLES `Lugar` WRITE;
/*!40000 ALTER TABLE `Lugar` DISABLE KEYS */;
INSERT INTO `Lugar` VALUES (1,'Lomas de Zamora','1832'),(2,'Mar del Plata','7600'),(3,'CABA','1084'),(4,'Temperley','1834'),(5,'Lanús','1824'),(6,'La Plata','1900');
/*!40000 ALTER TABLE `Lugar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Permiso`
--

DROP TABLE IF EXISTS `Permiso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Permiso` (
  `idPermiso` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `idPersona` int NOT NULL,
  PRIMARY KEY (`idPermiso`),
  KEY `fk_Permiso_1_idx` (`idPersona`),
  CONSTRAINT `fk_Permiso_1` FOREIGN KEY (`idPersona`) REFERENCES `Persona` (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Permiso`
--

LOCK TABLES `Permiso` WRITE;
/*!40000 ALTER TABLE `Permiso` DISABLE KEYS */;
INSERT INTO `Permiso` VALUES (1,'2021-03-30',1),(2,'2021-04-12',1),(3,'2021-04-18',1),(4,'2021-04-25',1);
/*!40000 ALTER TABLE `Permiso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PermisoDiario`
--

DROP TABLE IF EXISTS `PermisoDiario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PermisoDiario` (
  `idPermisoDiario` int NOT NULL,
  `motivo` varchar(45) NOT NULL,
  PRIMARY KEY (`idPermisoDiario`),
  CONSTRAINT `fk_PermisoDiario_1` FOREIGN KEY (`idPermisoDiario`) REFERENCES `Permiso` (`idPermiso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PermisoDiario`
--

LOCK TABLES `PermisoDiario` WRITE;
/*!40000 ALTER TABLE `PermisoDiario` DISABLE KEYS */;
INSERT INTO `PermisoDiario` VALUES (1,'Consulta Médica'),(3,'Tramite personal');
/*!40000 ALTER TABLE `PermisoDiario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PermisoPeriodo`
--

DROP TABLE IF EXISTS `PermisoPeriodo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PermisoPeriodo` (
  `idPermisoPeriodo` int NOT NULL,
  `cantDias` int NOT NULL,
  `vacaciones` tinyint NOT NULL,
  `idRodado` int NOT NULL,
  PRIMARY KEY (`idPermisoPeriodo`),
  KEY `fk_PermisoPeriodo_1_idx` (`idRodado`),
  CONSTRAINT `fk_PermisoPeriodo_1` FOREIGN KEY (`idRodado`) REFERENCES `Rodado` (`idRodado`),
  CONSTRAINT `fk_PermisoPeriodo_2` FOREIGN KEY (`idPermisoPeriodo`) REFERENCES `Permiso` (`idPermiso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PermisoPeriodo`
--

LOCK TABLES `PermisoPeriodo` WRITE;
/*!40000 ALTER TABLE `PermisoPeriodo` DISABLE KEYS */;
INSERT INTO `PermisoPeriodo` VALUES (2,12,1,1),(4,20,0,1);
/*!40000 ALTER TABLE `PermisoPeriodo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PermisoXLugar`
--

DROP TABLE IF EXISTS `PermisoXLugar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PermisoXLugar` (
  `idPermiso` int NOT NULL,
  `idLugar` int NOT NULL,
  PRIMARY KEY (`idPermiso`,`idLugar`),
  KEY `fk_PermisoXLugar_2_idx` (`idLugar`),
  CONSTRAINT `fk_PermisoXLugar_1` FOREIGN KEY (`idPermiso`) REFERENCES `Permiso` (`idPermiso`),
  CONSTRAINT `fk_PermisoXLugar_2` FOREIGN KEY (`idLugar`) REFERENCES `Lugar` (`idLugar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PermisoXLugar`
--

LOCK TABLES `PermisoXLugar` WRITE;
/*!40000 ALTER TABLE `PermisoXLugar` DISABLE KEYS */;
INSERT INTO `PermisoXLugar` VALUES (4,1),(2,2),(4,2),(1,3),(1,5),(2,5),(3,5),(3,6);
/*!40000 ALTER TABLE `PermisoXLugar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Persona`
--

DROP TABLE IF EXISTS `Persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Persona` (
  `idPersona` int NOT NULL AUTO_INCREMENT,
  `dni` int NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Persona`
--

LOCK TABLES `Persona` WRITE;
/*!40000 ALTER TABLE `Persona` DISABLE KEYS */;
INSERT INTO `Persona` VALUES (1,11111111,'Lopez','Claudia'),(2,22222222,'Rodriguez','Juan');
/*!40000 ALTER TABLE `Persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Rodado`
--

DROP TABLE IF EXISTS `Rodado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Rodado` (
  `idRodado` int NOT NULL AUTO_INCREMENT,
  `dominio` varchar(10) NOT NULL,
  `vehiculo` varchar(30) NOT NULL,
  PRIMARY KEY (`idRodado`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Rodado`
--

LOCK TABLES `Rodado` WRITE;
/*!40000 ALTER TABLE `Rodado` DISABLE KEYS */;
INSERT INTO `Rodado` VALUES (1,'AAA111','Citroen C4');
/*!40000 ALTER TABLE `Rodado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-21 16:18:53
