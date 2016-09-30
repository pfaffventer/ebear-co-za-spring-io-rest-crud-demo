-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: ebear_rest_crud_demo
-- ------------------------------------------------------
-- Server version	5.7.9-log

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
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `supplier_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) NOT NULL,
  `supplier_code` varchar(50) NOT NULL,
  `supplier_description` varchar(255) NOT NULL,
  PRIMARY KEY (`supplier_id`),
  UNIQUE KEY `UKoya7dbic5oyeyqikxkryj70p6` (`supplier_code`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'2016-09-29 06:10:03','johanv','NFS001','Nome Fisheries AK'),(2,'2016-09-29 06:10:03','johanv','GBH001','Glacier Bay Home Depot'),(3,'2016-09-29 06:10:03','johanv','ASS001','Alaska Sausage & Seafood Company'),(4,'2016-09-29 06:10:03','johanv','GBN001','Glacier Bay National Park'),(5,'2016-09-29 06:10:03','johanv','WAK001','Wild Alaska'),(6,'2016-09-29 06:10:03','johanv','GAS001','Great Alaska Seafood'),(7,'2016-09-29 06:10:03','johanv','MSB001','Midnight Sun Brewing Company');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trade_item`
--

DROP TABLE IF EXISTS `trade_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trade_item` (
  `item_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) NOT NULL,
  `item_code` varchar(50) NOT NULL,
  `item_description` varchar(255) NOT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  UNIQUE KEY `UK9jmniq4c4tmc4kj5pc6p5f2nt` (`item_code`),
  KEY `FKs2vc4n9lgkaod8rcb9ue4g6q5` (`category_id`),
  CONSTRAINT `FKs2vc4n9lgkaod8rcb9ue4g6q5` FOREIGN KEY (`category_id`) REFERENCES `trade_item_category` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trade_item`
--

LOCK TABLES `trade_item` WRITE;
/*!40000 ALTER TABLE `trade_item` DISABLE KEYS */;
INSERT INTO `trade_item` VALUES (1,'2016-09-29 06:19:58','johanv','0000000001','Honey',1),(2,'2016-09-29 06:19:58','johanv','0000000002','Steelhead Salmon',1),(3,'2016-09-29 06:19:58','johanv','0000000003','Sockeye Salmon',1),(4,'2016-09-29 06:19:58','johanv','0000000004','Rainbow Trout',1),(5,'2016-09-29 06:19:58','johanv','0000000005','Sarsaparilla Berries',7),(6,'2016-09-29 06:19:58','johanv','0000000006','Juneberries',3),(7,'2016-09-29 06:19:58','johanv','0000000007','Huckleberries',2),(8,'2016-09-29 06:19:58','johanv','0000000008','Chokecherry',6),(9,'2016-09-29 06:19:58','johanv','0000000009','Buffaloberry',4),(10,'2016-09-29 06:19:58','johanv','0000000010','Moose Calves',2),(11,'2016-09-29 06:19:58','johanv','0000000011','Deer Fawns',1),(12,'2016-09-29 06:19:58','johanv','0000000012','Ground Squirrels',5),(13,'2016-09-29 06:19:58','johanv','0000000013','Bees (Adults & Larvae)',5),(14,'2016-09-29 06:19:58','johanv','0000000014','Carrion',4),(15,'2016-09-29 06:19:58','johanv','0000000015','Aquatic Plants',6);
/*!40000 ALTER TABLE `trade_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trade_item_category`
--

DROP TABLE IF EXISTS `trade_item_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trade_item_category` (
  `category_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) NOT NULL,
  `category_code` varchar(50) NOT NULL,
  `category_description` varchar(255) NOT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `UKfgl3mjy95h5g0kjg8kq0lmu9h` (`category_code`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trade_item_category`
--

LOCK TABLES `trade_item_category` WRITE;
/*!40000 ALTER TABLE `trade_item_category` DISABLE KEYS */;
INSERT INTO `trade_item_category` VALUES (1,'2016-09-29 06:19:58','johanv','CLASS A','CLASS A'),(2,'2016-09-29 06:19:58','johanv','CLASS B','CLASS B'),(3,'2016-09-29 06:19:58','johanv','CLASS C','CLASS C'),(4,'2016-09-29 06:19:58','johanv','CLASS D','CLASS D'),(5,'2016-09-29 06:19:58','johanv','CLASS E','CLASS E'),(6,'2016-09-29 06:19:58','johanv','CLASS F','CLASS F'),(7,'2016-09-29 06:19:58','johanv','CLASS G','CLASS G');
/*!40000 ALTER TABLE `trade_item_category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-29  8:21:47
