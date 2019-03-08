/*
SQLyog Community v12.4.3 (64 bit)
MySQL - 10.1.28-MariaDB : Database - pms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pms` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pms`;

/*Table structure for table `proj_members` */

DROP TABLE IF EXISTS `proj_members`;

CREATE TABLE `proj_members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `proj_id` int(11) DEFAULT NULL,
  `staff_id` varchar(10) DEFAULT NULL,
  `role` varchar(100) DEFAULT NULL,
  `created_id` varchar(20) DEFAULT NULL,
  `created_dt` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `proj_members` */

insert  into `proj_members`(`id`,`proj_id`,`staff_id`,`role`,`created_id`,`created_dt`) values 
(1,1,'Ros','Penyelia','Hafidzah','2019-03-06'),
(2,1,'Khairol','Lead Programmer','Ros','2019-03-07'),
(3,2,'Latifah','Penyelia','Hafidzah','2019-03-06'),
(4,2,'Zainimar','Lead Programmer','Latifah','2019-03-07');

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` text,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `status` varchar(2) DEFAULT NULL,
  `create_by` varchar(20) DEFAULT NULL,
  `created_dt` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `project` */

insert  into `project`(`id`,`title`,`description`,`start_date`,`end_date`,`status`,`create_by`,`created_dt`) values 
(1,'EHRI','Membangunkan inventori Persekitaran','2019-03-25','2019-06-25','BE','Hafidzah','2019-03-07'),
(2,'MyMaHTAS','Menyimpan hasil dokumentasi penyelidikan berkaitan kesihatan','2019-04-01','2019-06-03','DA','Zalman','2019-03-06'),
(3,'VeDA','Pengesahan Kematian tanpa pengesahan perubatan',NULL,NULL,NULL,NULL,NULL),
(4,'MySMPP','Jawatan Isi dan Kosong',NULL,NULL,NULL,NULL,NULL),
(5,'MedPCs','Lesen Klinik dan Hospital Swasta',NULL,NULL,NULL,NULL,NULL),
(6,'PHEIS','Penguatkuasaan Akta, Undang-undang dan Larangan rokok, vektor dan makanan',NULL,NULL,NULL,NULL,NULL),
(10,'VIPSS','Daftar kes Violence',NULL,NULL,NULL,NULL,NULL),
(11,'PPKZM','Program Makanan Sihat untuk kanak-kanak',NULL,NULL,NULL,NULL,NULL),
(12,'test','test..test..test..',NULL,NULL,NULL,NULL,NULL),
(13,'test','test..test..test..',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` varchar(10) DEFAULT NULL,
  `pwd` varchar(100) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`id`,`staff_id`,`pwd`,`name`,`role`,`gender`) values 
(1,'Ros','1234','Rosliza','PENEYLIA',NULL),
(2,'Latifah','1234','Latifah','PENYELIA',NULL),
(3,'Hafidzah','1234','Hafidzah','ADMIN',NULL),
(4,'Zainimar','1234','Zainimar','DEV',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
