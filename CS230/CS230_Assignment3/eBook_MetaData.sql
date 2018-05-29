-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 23, 2018 at 02:35 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `CS230_Assignment3`
--

-- --------------------------------------------------------

--
-- Table structure for table `eBook_MetaData`
--

CREATE TABLE `eBook_MetaData` (
  `id` int(6) UNSIGNED NOT NULL,
  `creator` varchar(30) NOT NULL,
  `title` varchar(30) NOT NULL,
  `type` varchar(20) NOT NULL,
  `identifier` varchar(50) NOT NULL,
  `date_pub` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `language` varchar(20) NOT NULL,
  `description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eBook_MetaData`
--

INSERT INTO `eBook_MetaData` (`id`, `creator`, `title`, `type`, `identifier`, `date_pub`, `language`, `description`) VALUES
(1, 'Raymond E. Feist', 'Magician', 'Fantasy', 'Not available', '2009-12-25 00:00:00', 'English', 'Pug''s wild adventure'),
(2, 'JK Rowling', 'Harry Potter', 'Fantasy', 'Not available', '2018-03-23 13:33:34', 'English', 'Harry learns to do stuff'),
(3, 'JRR Tolkien', 'The Hobbit', 'Fantasy', 'Not available', '2000-12-25 00:00:00', 'English', 'Bilbo learns to adventure'),
(4, 'Garth Nix', 'Sabriel', 'Fantasy', 'Not available', '2005-04-30 23:00:00', 'English', 'Sabriel learns to speak ill of the dead'),
(5, 'Stephen Eriksson', 'Gardnes of the Moon', 'Fantasy', 'Not available', '2018-03-23 13:34:29', 'English', 'Ganoes Paran has no idea what he''s in for');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `eBook_MetaData`
--
ALTER TABLE `eBook_MetaData`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `eBook_MetaData`
--
ALTER TABLE `eBook_MetaData`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
