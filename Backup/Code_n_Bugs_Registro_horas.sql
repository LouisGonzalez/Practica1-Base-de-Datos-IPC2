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
-- Table structure for table `Registro_horas`
--

DROP TABLE IF EXISTS `Registro_horas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Registro_horas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nit_persona` int(11) NOT NULL,
  `no_ruta` int(11) NOT NULL,
  `ttotal_horas` int(11) NOT NULL,
  `no_venta` int(11) NOT NULL,
  `no_paquete_venta` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `nit_persona` (`nit_persona`),
  CONSTRAINT `Registro_horas_ibfk_1` FOREIGN KEY (`nit_persona`) REFERENCES `Clientes` (`nit`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Registro_horas`
--

LOCK TABLES `Registro_horas` WRITE;
/*!40000 ALTER TABLE `Registro_horas` DISABLE KEYS */;
INSERT INTO `Registro_horas` VALUES (1,26641933,1,8,1,1),(2,26641933,1,6,1,2),(3,26641933,1,6,1,3),(4,26641933,1,9,1,4),(5,26641933,1,9,1,5),(6,85496353,2,6,2,1),(7,85496353,2,6,2,2),(8,85496353,2,7,2,3),(9,85496353,2,12,2,4),(10,85496353,2,12,2,5),(11,26654884,3,5,4,1),(12,26654884,3,5,4,2),(13,26654884,3,5,4,3),(14,26654884,3,8,4,4),(15,26654884,3,8,4,5),(16,78596696,4,6,3,1),(17,78596696,4,6,3,2),(18,78596696,4,6,3,3),(19,78596696,4,9,3,4),(20,78596696,4,9,3,5),(21,36652697,5,4,5,1),(22,36652697,5,5,5,2),(23,36652697,5,8,5,3),(24,36652697,5,10,5,4),(25,36652697,5,12,5,5),(26,26641933,1,0,6,1),(27,26641933,1,0,6,2),(28,26641933,1,0,6,3),(29,85496353,2,0,7,1),(30,85496353,2,0,7,2),(31,85496353,2,0,7,3),(32,36652697,2,0,10,1),(33,36652697,2,0,10,2),(34,36652697,3,0,10,3),(35,78596696,4,0,8,1),(36,78596696,4,0,8,2),(37,78596696,4,0,8,3),(38,26654884,5,0,9,1),(39,26654884,5,0,9,2),(40,26654884,5,0,9,3);
/*!40000 ALTER TABLE `Registro_horas` ENABLE KEYS */;
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
