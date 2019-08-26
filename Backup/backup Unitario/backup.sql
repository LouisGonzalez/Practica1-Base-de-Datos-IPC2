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
-- Table structure for table `Bodega`
--

DROP TABLE IF EXISTS `Bodega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Bodega` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nit_persona` int(11) NOT NULL,
  `prioridad` varchar(10) DEFAULT NULL,
  `destino` varchar(40) DEFAULT NULL,
  `no_venta` int(11) NOT NULL,
  `no_paquete_venta` int(11) NOT NULL,
  `costo_paquete` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `nit_persona` (`nit_persona`),
  CONSTRAINT `Bodega_ibfk_1` FOREIGN KEY (`nit_persona`) REFERENCES `Clientes` (`nit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Bodega`
--

LOCK TABLES `Bodega` WRITE;
/*!40000 ALTER TABLE `Bodega` DISABLE KEYS */;
/*!40000 ALTER TABLE `Bodega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Bodegas_finales`
--

DROP TABLE IF EXISTS `Bodegas_finales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Bodegas_finales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nit_persona` int(11) NOT NULL,
  `no_ruta` int(11) NOT NULL,
  `no_venta` int(11) NOT NULL,
  `no_paquete_venta` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `nit_persona` (`nit_persona`),
  CONSTRAINT `Bodegas_finales_ibfk_1` FOREIGN KEY (`nit_persona`) REFERENCES `Clientes` (`nit`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Bodegas_finales`
--

LOCK TABLES `Bodegas_finales` WRITE;
/*!40000 ALTER TABLE `Bodegas_finales` DISABLE KEYS */;
INSERT INTO `Bodegas_finales` VALUES (1,26641933,1,1,1),(2,26641933,1,1,2),(3,26641933,1,1,3),(4,26641933,1,1,4),(5,26641933,1,1,5),(6,85496353,2,2,1),(7,85496353,2,2,2),(8,85496353,2,2,3),(9,85496353,2,2,4),(10,85496353,2,2,5),(11,78596696,4,3,1),(12,78596696,4,3,2),(13,78596696,4,3,3),(14,78596696,4,3,4),(15,78596696,4,3,5),(16,26654884,3,4,1),(17,26654884,3,4,2),(18,26654884,3,4,3),(19,26654884,3,4,4),(20,26654884,3,4,5),(21,36652697,5,5,1),(22,36652697,5,5,2),(23,36652697,5,5,3),(24,36652697,5,5,4),(25,36652697,5,5,5);
/*!40000 ALTER TABLE `Bodegas_finales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Clientes`
--

DROP TABLE IF EXISTS `Clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nit` int(11) DEFAULT NULL,
  `nombres` varchar(40) DEFAULT NULL,
  `apellidos` varchar(40) DEFAULT NULL,
  `domicilio` varchar(40) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `paquetes_entregados` int(11) NOT NULL,
  `costos_cliente` int(11) NOT NULL,
  `ingresos_cliente` int(11) NOT NULL,
  `ganancias_cliente` int(11) NOT NULL,
  `paquetes_en_sistema` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nit` (`nit`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Clientes`
--

LOCK TABLES `Clientes` WRITE;
/*!40000 ALTER TABLE `Clientes` DISABLE KEYS */;
INSERT INTO `Clientes` VALUES (5,26641933,'Luis Manuel','Perez Perez','Guatemala',55859620,0,760,1327,567,8),(6,85496353,'Maria Alejandra','Piedrasanta','Guatemala',21526396,0,860,1902,1042,8),(7,78596696,'Andrea Fernanda','Medrano','Quetzaltenango',42564271,0,720,2692,1972,8),(8,26654884,'Yoselin Andrea','Mendez','Guatemala',85256994,0,620,3167,2547,8),(9,36652697,'Mariangel','Alvarado','Honduras',52526988,0,780,3282,2502,8);
/*!40000 ALTER TABLE `Clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cuotas`
--

DROP TABLE IF EXISTS `Cuotas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cuotas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_cuota` varchar(30) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cuotas`
--

LOCK TABLES `Cuotas` WRITE;
/*!40000 ALTER TABLE `Cuotas` DISABLE KEYS */;
INSERT INTO `Cuotas` VALUES (1,'Tarifa de operacion global',20),(2,'Cuota de destino',34),(3,'Cuota extra de priorizacion',25),(4,'Precio por libra',10);
/*!40000 ALTER TABLE `Cuotas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Paquetes`
--

DROP TABLE IF EXISTS `Paquetes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Paquetes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nit_persona` int(11) NOT NULL,
  `no_punto_control` int(11) NOT NULL,
  `no_ruta` int(11) NOT NULL,
  `no_venta` int(11) NOT NULL,
  `no_paquete_venta` int(11) NOT NULL,
  `costo_paquete` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `nit_persona` (`nit_persona`),
  CONSTRAINT `Paquetes_ibfk_1` FOREIGN KEY (`nit_persona`) REFERENCES `Clientes` (`nit`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Paquetes`
--

LOCK TABLES `Paquetes` WRITE;
/*!40000 ALTER TABLE `Paquetes` DISABLE KEYS */;
INSERT INTO `Paquetes` VALUES (26,26641933,1,1,6,1,84),(27,26641933,1,1,6,2,74),(28,26641933,1,1,6,3,64),(29,85496353,1,2,7,1,209),(30,85496353,1,2,7,2,289),(31,85496353,1,2,7,3,259),(32,36652697,1,2,10,1,179),(33,36652697,1,2,10,2,279),(34,36652697,1,3,10,3,449),(35,78596696,1,4,8,1,569),(36,78596696,1,4,8,2,499),(37,78596696,1,4,8,3,179),(38,26654884,1,5,9,1,409),(39,26654884,1,5,9,2,839),(40,26654884,1,5,9,3,259);
/*!40000 ALTER TABLE `Paquetes` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `Puntos_control_ruta_2`
--

DROP TABLE IF EXISTS `Puntos_control_ruta_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Puntos_control_ruta_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paquetes_actuales` int(11) DEFAULT NULL,
  `paquetes_maximos` int(11) DEFAULT NULL,
  `operador_al_mando` varchar(40) DEFAULT NULL,
  `cuota_operacion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `operador_al_mando` (`operador_al_mando`),
  CONSTRAINT `Puntos_control_ruta_2_ibfk_1` FOREIGN KEY (`operador_al_mando`) REFERENCES `Usuarios` (`nickname`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Puntos_control_ruta_2`
--

LOCK TABLES `Puntos_control_ruta_2` WRITE;
/*!40000 ALTER TABLE `Puntos_control_ruta_2` DISABLE KEYS */;
INSERT INTO `Puntos_control_ruta_2` VALUES (1,5,5,'Guillen','20'),(2,0,5,'Guillen','20'),(3,0,5,'Guillen','20'),(4,0,5,'mendezAs','20');
/*!40000 ALTER TABLE `Puntos_control_ruta_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Puntos_control_ruta_3`
--

DROP TABLE IF EXISTS `Puntos_control_ruta_3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Puntos_control_ruta_3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paquetes_actuales` int(11) DEFAULT NULL,
  `paquetes_maximos` int(11) DEFAULT NULL,
  `operador_al_mando` varchar(40) DEFAULT NULL,
  `cuota_operacion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `operador_al_mando` (`operador_al_mando`),
  CONSTRAINT `Puntos_control_ruta_3_ibfk_1` FOREIGN KEY (`operador_al_mando`) REFERENCES `Usuarios` (`nickname`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Puntos_control_ruta_3`
--

LOCK TABLES `Puntos_control_ruta_3` WRITE;
/*!40000 ALTER TABLE `Puntos_control_ruta_3` DISABLE KEYS */;
INSERT INTO `Puntos_control_ruta_3` VALUES (1,1,5,'JulioAlberto','20'),(2,0,5,'JulioAlberto','20'),(3,0,5,'JulioAlberto','20'),(4,0,5,'Guillen','20');
/*!40000 ALTER TABLE `Puntos_control_ruta_3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Puntos_control_ruta_4`
--

DROP TABLE IF EXISTS `Puntos_control_ruta_4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Puntos_control_ruta_4` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paquetes_actuales` int(11) DEFAULT NULL,
  `paquetes_maximos` int(11) DEFAULT NULL,
  `operador_al_mando` varchar(40) DEFAULT NULL,
  `cuota_operacion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `operador_al_mando` (`operador_al_mando`),
  CONSTRAINT `Puntos_control_ruta_4_ibfk_1` FOREIGN KEY (`operador_al_mando`) REFERENCES `Usuarios` (`nickname`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Puntos_control_ruta_4`
--

LOCK TABLES `Puntos_control_ruta_4` WRITE;
/*!40000 ALTER TABLE `Puntos_control_ruta_4` DISABLE KEYS */;
INSERT INTO `Puntos_control_ruta_4` VALUES (1,3,5,'Guillen','20'),(2,0,5,'Guillen','20'),(3,0,5,'Guillen','20'),(4,0,5,'mendezAs','20');
/*!40000 ALTER TABLE `Puntos_control_ruta_4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Puntos_control_ruta_5`
--

DROP TABLE IF EXISTS `Puntos_control_ruta_5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Puntos_control_ruta_5` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paquetes_actuales` int(11) DEFAULT NULL,
  `paquetes_maximos` int(11) DEFAULT NULL,
  `operador_al_mando` varchar(40) DEFAULT NULL,
  `cuota_operacion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `operador_al_mando` (`operador_al_mando`),
  CONSTRAINT `Puntos_control_ruta_5_ibfk_1` FOREIGN KEY (`operador_al_mando`) REFERENCES `Usuarios` (`nickname`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Puntos_control_ruta_5`
--

LOCK TABLES `Puntos_control_ruta_5` WRITE;
/*!40000 ALTER TABLE `Puntos_control_ruta_5` DISABLE KEYS */;
INSERT INTO `Puntos_control_ruta_5` VALUES (1,3,5,'Guillen','20'),(2,0,5,'mendezAs','20'),(3,0,5,'Guillen','20'),(4,0,5,'JulioAlberto','20');
/*!40000 ALTER TABLE `Puntos_control_ruta_5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Registro_fechas`
--

DROP TABLE IF EXISTS `Registro_fechas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Registro_fechas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nit_persona` int(11) NOT NULL,
  `no_ruta` int(11) NOT NULL,
  `no_venta` int(11) NOT NULL,
  `no_paquete_venta` int(11) NOT NULL,
  `fecha_ingreso` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `nit_persona` (`nit_persona`),
  CONSTRAINT `Registro_fechas_ibfk_1` FOREIGN KEY (`nit_persona`) REFERENCES `Clientes` (`nit`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Registro_fechas`
--

LOCK TABLES `Registro_fechas` WRITE;
/*!40000 ALTER TABLE `Registro_fechas` DISABLE KEYS */;
INSERT INTO `Registro_fechas` VALUES (1,26641933,1,1,1,'25-08-2019'),(2,26641933,1,1,2,'25-08-2019'),(3,26641933,1,1,3,'25-08-2019'),(4,26641933,1,1,4,'25-08-2019'),(5,26641933,1,1,5,'25-08-2019'),(6,85496353,2,2,1,'25-08-2019'),(7,85496353,2,2,2,'25-08-2019'),(8,85496353,2,2,3,'25-08-2019'),(9,85496353,2,2,4,'25-08-2019'),(10,85496353,2,2,5,'25-08-2019'),(11,26654884,3,4,1,'25-08-2019'),(12,26654884,3,4,2,'25-08-2019'),(13,26654884,3,4,3,'25-08-2019'),(14,26654884,3,4,4,'25-08-2019'),(15,26654884,3,4,5,'25-08-2019'),(16,78596696,4,3,1,'25-08-2019'),(17,78596696,4,3,2,'25-08-2019'),(18,78596696,4,3,3,'25-08-2019'),(19,78596696,4,3,4,'25-08-2019'),(20,78596696,4,3,5,'25-08-2019'),(21,36652697,5,5,1,'25-08-2019'),(22,36652697,5,5,2,'25-08-2019'),(23,36652697,5,5,3,'25-08-2019'),(24,36652697,5,5,4,'25-08-2019'),(25,36652697,5,5,5,'25-08-2019'),(26,26641933,1,6,1,'25-08-2019'),(27,26641933,1,6,2,'25-08-2019'),(28,26641933,1,6,3,'25-08-2019'),(29,85496353,2,7,1,'25-08-2019'),(30,85496353,2,7,2,'25-08-2019'),(31,85496353,2,7,3,'25-08-2019'),(32,36652697,2,10,1,'25-08-2019'),(33,36652697,2,10,2,'25-08-2019'),(34,36652697,3,10,3,'25-08-2019'),(35,78596696,4,8,1,'25-08-2019'),(36,78596696,4,8,2,'25-08-2019'),(37,78596696,4,8,3,'25-08-2019'),(38,26654884,5,9,1,'25-08-2019'),(39,26654884,5,9,2,'25-08-2019'),(40,26654884,5,9,3,'25-08-2019');
/*!40000 ALTER TABLE `Registro_fechas` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `Rutas`
--

DROP TABLE IF EXISTS `Rutas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Rutas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no_puntos_control` int(11) DEFAULT NULL,
  `destino` varchar(50) DEFAULT NULL,
  `estado` varchar(30) DEFAULT NULL,
  `paquetes_en_sistema` int(11) NOT NULL,
  `paquetes_entregados` int(11) NOT NULL,
  `paquetes_totales` int(11) NOT NULL,
  `ingresos_ruta` int(11) NOT NULL,
  `costos_ruta` int(11) NOT NULL,
  `ganancias_totales` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Rutas`
--

LOCK TABLES `Rutas` WRITE;
/*!40000 ALTER TABLE `Rutas` DISABLE KEYS */;
INSERT INTO `Rutas` VALUES (1,4,'Nueva York (Estados Unidos)','ACTIVADA',8,0,8,1327,760,567),(2,4,'Paris (Francia)','ACTIVADA',10,0,10,2360,860,1500),(3,4,'Paris (Francia)','ACTIVADA',6,0,6,2109,620,1489),(4,4,'Los Angeles (Estados Unidos)','ACTIVADA',8,0,8,2692,720,1972),(5,4,'Bogota (Colombia)','ACTIVADA',8,0,8,3882,780,3102);
/*!40000 ALTER TABLE `Rutas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuarios`
--

DROP TABLE IF EXISTS `Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuarios` (
  `nombres` varchar(25) DEFAULT NULL,
  `apellidos` varchar(25) DEFAULT NULL,
  `domicilio` varchar(45) DEFAULT NULL,
  `telefono` varchar(8) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `tipo_usuario` varchar(25) DEFAULT NULL,
  `nickname` varchar(20) NOT NULL,
  PRIMARY KEY (`nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuarios`
--

LOCK TABLES `Usuarios` WRITE;
/*!40000 ALTER TABLE `Usuarios` DISABLE KEYS */;
INSERT INTO `Usuarios` VALUES ('Paco David','Alcacer ','Inglaterra','45125263','asdfg','Recepcionista','Alcacer'),('Andrea Maria','Barrios','Nicaragua','45265395','012345','Recepcionista','Andrea1'),('Eduardo Jose','Garcia Alvarez','Argentina','45859620','123','Administrador','Eduard1'),('Fernando Manuel','Perez Perez','Guatemala','45125269','1234','Administrador','FernanM1'),('Erikson Daniel','Guillen','quetzaltenango','78459623','12378','Operador','Guillen'),('Julio Alberto','Alvarado','Colombia','74852125','abc123','Operador','JulioAlberto'),('Luis Estuardo','Gonzalez','quetzaltenango','55859620','123456789','Administrador','Luis1'),('Astrid Gabriela','Mendez','honduras','75458512','qwerty','Operador','mendezAs'),('Pablo Jose','Hernan Diaz','Costa Rica','45857456','mnbvc','Recepcionista','PaJose');
/*!40000 ALTER TABLE `Usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ventas`
--

DROP TABLE IF EXISTS `Ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ventas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nit` int(11) DEFAULT NULL,
  `no_paquetes` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `nit` (`nit`),
  CONSTRAINT `Ventas_ibfk_1` FOREIGN KEY (`nit`) REFERENCES `Clientes` (`nit`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ventas`
--

LOCK TABLES `Ventas` WRITE;
/*!40000 ALTER TABLE `Ventas` DISABLE KEYS */;
INSERT INTO `Ventas` VALUES (1,26641933,5,1105),(2,85496353,5,1145),(3,78596696,5,1445),(4,26654884,5,1660),(5,36652697,5,2375),(6,26641933,3,222),(7,85496353,3,757),(8,78596696,3,1247),(9,26654884,3,1507),(10,36652697,3,907);
/*!40000 ALTER TABLE `Ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-26 10:19:53
