-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: Code_n_Bugs
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

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
-- Table structure for table `Puntos_control_ruta_1`
--

DROP TABLE IF EXISTS `Puntos_control_ruta_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Puntos_control_ruta_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paquetes_actuales` int(11) DEFAULT NULL,
  `paquetes_maximos` int(11) DEFAULT NULL,
  `operador_al_mando` varchar(40) DEFAULT NULL,
  `cuota_operacion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `operador_al_mando` (`operador_al_mando`),
  CONSTRAINT `Puntos_control_ruta_1_ibfk_1` FOREIGN KEY (`operador_al_mando`) REFERENCES `Usuarios` (`nickname`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Puntos_control_ruta_1`
--

LOCK TABLES `Puntos_control_ruta_1` WRITE;
/*!40000 ALTER TABLE `Puntos_control_ruta_1` DISABLE KEYS */;
INSERT INTO `Puntos_control_ruta_1` VALUES (1,3,5,'Guillen','20'),(2,0,5,'Guillen','20'),(3,0,5,'Guillen','20'),(4,0,5,'JulioAlberto','20');
/*!40000 ALTER TABLE `Puntos_control_ruta_1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-25 23:22:55
