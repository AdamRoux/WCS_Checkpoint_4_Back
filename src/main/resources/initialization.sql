-- MySQL dump 10.13  Distrib 8.0.28, for macos11 (x86_64)
--
-- Host: localhost    Database: album_photos
-- ------------------------------------------------------
-- Server version	8.0.28

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

--
-- Dumping data for table `continent`
--

LOCK TABLES `continent` WRITE;
/*!40000 ALTER TABLE `continent` DISABLE KEYS */;
INSERT INTO `continent` VALUES (5,'Afrique'),(3,'Amérique'),(4,'Antarctique'),(1,'Asie'),(2,'Europe'),(6,'Océanie');
/*!40000 ALTER TABLE `continent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (12,'2022-03-21 17:29:07','2017-12-24 00:00:00','Super vacances à Zanzibar en famille','Zanzibar','Vacances à Zanzibar',5),(22,'2022-03-22 14:01:06','2018-10-31 00:00:00','Le super Halloween 2018 en famille, chez Uncle Matthew dans le Colorado.','Colorado','Halloween aux USA',3),(23,'2022-03-22 14:04:03','2020-02-05 00:00:00','Super voyage de tourisme en antarctique. Nous avons eu la chance d\'apercevoir tout un tas de pingouins.','Antarctique','Voyage en antarctique',4),(24,'2022-03-22 14:06:54','2021-06-16 00:00:00','Photos de mon séjour à Séoul, lors de mon voyage scolaire.','Séoul','Visite de Séoul',1),(25,'2022-03-22 14:10:01','2019-10-16 00:00:00','Super découverte de Christchurch en Nouvelle-Zélande.','Christchurch','Échange à Christchurch',6),(26,'2022-03-22 14:12:10','2022-03-20 00:00:00','Visite de Madrid à l\'occasion du Classico entre le FC Barcelone et le Real Madrid.','Madrid','Le Classico à Madrid',2);
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `picture`
--

LOCK TABLES `picture` WRITE;
/*!40000 ALTER TABLE `picture` DISABLE KEYS */;
INSERT INTO `picture` VALUES (44,'https://www.cercledesvoyages.com/wp-content/webp-express/webp-images/uploads/2020/12/pm_8002_101_101029-rg58acawkm-3886-1.jpeg.webp',12),(47,'http://www.jouetopia.fr/wp-content/uploads/disneyland-halloween.jpg',22),(48,'https://images.rtl.fr/~c/795v350/rtl/www/1327011-halloween-est-une-fete-tres-populaire-aux-etats-unis-illustration.jpg',22),(49,'https://images.rtl.fr/~c/795v350/rtl/www/1327011-halloween-est-une-fete-tres-populaire-aux-etats-unis-illustration.jpg',22),(50,'https://upload.wikimedia.org/wikipedia/commons/7/79/South_pole_skiers.jpg',23),(51,'https://www.tripsavvy.com/thmb/Zp4Yv_zUtpEoeVbSokNCMQ1m6PA=/911x683/smart/filters:no_upscale()/sea-spirit-quark-expeditions-5730b8a53df78c038e471b21.jpg',23),(52,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjSAEQ0atk8oj0OG5IDG0tTaH68kGfb1tM_g&usqp=CAU',24),(53,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvUD5GG9e4xjaoz81vIeILxss5uW1w1ZXjmA&usqp=CAU',24),(54,'https://images.ctfassets.net/bth3mlrehms2/3Iquh7an0sBOkJLzCDv5iX/43914e9b62c375db993adecf26b9ffa0/Nouvelle_Zelande__Christchurch__Rivie__re_en_centre-ville.jpg?w=750&h=422&fl=progressive&q=50&fm=jpg',25),(55,'https://www.greatjourneysofnz.co.nz/assets/uploads/Punting-on-the-Avon-RH3200-Header-Banner-1000x625.jpg',25),(56,'https://www.spain.info/export/sites/segtur/.content/imagenes/cabeceras-grandes/madrid/estadio-bernabeu-vista-aerea-c-turismo-madrid.jpg',26),(57,'https://img-4.linternaute.com/gKEodVqFA16cQjTQymcA08EK8XE=/660x366/smart/afa7591491654bc8898607c62a49e8d0/ccmcms-linternaute/10841776.jpg',26);
/*!40000 ALTER TABLE `picture` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-22 14:29:20
