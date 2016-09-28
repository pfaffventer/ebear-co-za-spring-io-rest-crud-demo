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
  `code` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  `log_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `log_user` varchar(255) NOT NULL,
  PRIMARY KEY (`supplier_id`),
  UNIQUE KEY `UKjd4d0t4kb2xxf3bxdroqgpmca` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'NFS001','Nome Fisheries AK','2016-09-28 18:18:09','johanv'),(2,'GBH001','Glacier Bay Home Depot','2016-09-28 18:18:09','johanv'),(3,'ASS001','Alaska Sausage & Seafood Company','2016-09-28 18:18:09','johanv'),(4,'GBN001','Glacier Bay National Park','2016-09-28 18:18:09','johanv'),(5,'WAK001','Wild Alaska','2016-09-28 18:18:09','johanv'),(6,'GAS001','Great Alaska Seafood','2016-09-28 18:18:09','johanv'),(7,'MSB001','Midnight Sun Brewing Company','2016-09-28 18:18:09','johanv');
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
  `code` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  `log_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `log_user` varchar(255) NOT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  UNIQUE KEY `UK66mitirradmij52snvk62ny9q` (`code`),
  KEY `FKs2vc4n9lgkaod8rcb9ue4g6q5` (`category_id`),
  CONSTRAINT `FKs2vc4n9lgkaod8rcb9ue4g6q5` FOREIGN KEY (`category_id`) REFERENCES `trade_item_category` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trade_item`
--

LOCK TABLES `trade_item` WRITE;
/*!40000 ALTER TABLE `trade_item` DISABLE KEYS */;
INSERT INTO `trade_item` VALUES (1,'0000000001','Honey','2016-09-28 18:43:21','johanv',1),(2,'0000000002','Steelhead Salmon','2016-09-28 18:43:21','johanv',1),(3,'0000000003','Sockeye Salmon','2016-09-28 18:43:21','johanv',1),(4,'0000000004','Rainbow Trout','2016-09-28 18:43:21','johanv',1),(5,'0000000005','Sarsaparilla Berries','2016-09-28 18:43:21','johanv',1),(6,'0000000006','Juneberries','2016-09-28 18:43:21','johanv',1),(7,'0000000007','Huckleberries','2016-09-28 18:43:21','johanv',1),(8,'0000000008','Chokecherry','2016-09-28 18:43:21','johanv',1),(9,'0000000009','Buffaloberry','2016-09-28 18:43:21','johanv',1),(10,'0000000010','Moose Calves','2016-09-28 18:43:21','johanv',1),(11,'0000000011','Deer Fawns','2016-09-28 18:43:21','johanv',1),(12,'0000000012','Ground Squirrels','2016-09-28 18:43:21','johanv',1),(13,'0000000013','Bees (Adults & Larvae)','2016-09-28 18:43:21','johanv',1),(14,'0000000014','Carrion','2016-09-28 18:43:21','johanv',1),(15,'0000000015','Aquatic Plants','2016-09-28 18:43:21','johanv',1);
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
  `code` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  `log_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `log_user` varchar(255) NOT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `UK4k5tkpi4otp5clyii6h0py8p` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trade_item_category`
--

LOCK TABLES `trade_item_category` WRITE;
/*!40000 ALTER TABLE `trade_item_category` DISABLE KEYS */;
INSERT INTO `trade_item_category` VALUES (1,'CLASS A','CLASS A','2016-09-28 18:31:45','johanv'),(2,'CLASS B','CLASS B','2016-09-28 18:31:45','johanv'),(3,'CLASS C','CLASS C','2016-09-28 18:31:45','johanv'),(4,'CLASS D','CLASS D','2016-09-28 18:31:45','johanv'),(5,'CLASS E','CLASS E','2016-09-28 18:31:45','johanv'),(6,'CLASS F','CLASS F','2016-09-28 18:31:45','johanv'),(7,'CLASS G','CLASS G','2016-09-28 18:31:45','johanv');
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

-- Dump completed on 2016-09-28 20:50:02
