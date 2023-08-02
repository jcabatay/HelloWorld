# cat data.sql
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE IF NOT EXISTS `db_bahay`;

DROP TABLE IF EXISTS `customers`;

CREATE TABLE `customers` (
  `customer_id` BIGINT NOT NULL AUTO_INCREMENT, PRIMARY KEY (`customer_id`),
  `customer_name` varchar(60) COLLATE utf16_spanish_ci NOT NULL,
  `contact_name` varchar(60) COLLATE utf16_spanish_ci NOT NULL,
  `address` varchar(60) COLLATE utf16_spanish_ci NOT NULL,
  `city` varchar(60) COLLATE utf16_spanish_ci NOT NULL,
  `postal_code` varchar(60) COLLATE utf16_spanish_ci NOT NULL,
  `country` varchar(60) COLLATE utf16_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;


-- Starting customer_id=1000
ALTER TABLE customers AUTO_INCREMENT = 1000;

-- Coment if we don't want to insert data.
#insert initial value

INSERT INTO `customers` (`customer_name`, `contact_name`, `address`, `city`, `postal_code`, `country`) VALUES
('Joel', 'Joel Cabatay', 'Gran Via', 'Barcelona', '08036', 'Spain'),
('Analyn', 'Analyn Lanuza', 'Diagonal', 'Barcelona', '08035', 'Spain');


