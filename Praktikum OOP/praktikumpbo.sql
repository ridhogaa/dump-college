-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 25, 2021 at 06:12 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `praktikumpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `ojekonlinefti`
--

CREATE TABLE `ojekonlinefti` (
  `ID` int(5) NOT NULL,
  `nama_depan` varchar(30) NOT NULL,
  `nama_belakang` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `jenis_pengemudi` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ojekonlinefti`
--

INSERT INTO `ojekonlinefti` (`ID`, `nama_depan`, `nama_belakang`, `jenis_kelamin`, `jenis_pengemudi`) VALUES
(3, 'Ridho', 'Gymnastiar', 'Pria', 'Pengemudi Mobil'),
(4, 'ridho', 'ridho', 'Pria', 'Pengemudi Motor'),
(5, 'Ridho Gymnastiar', 'Al Rasyid', 'Pria', 'Pengemudi Mobil'),
(6, 'ridho', 'qwe', 'Pria', 'Pengemudi Motor'),
(7, 'ridhogymns', 'rasyid', 'Pria', 'Pengemudi Motor'),
(8, 'putri', 'nabila', 'Wanita', 'Pengemudi Mobil'),
(9, 'Aisyah', 'Putri', 'Wanita', 'Pengemudi Motor'),
(10, 'aldap', 'fadlilah', 'Pria', 'Pengemudi Motor'),
(11, 'ridhogymn', 'astiar', 'Pria', 'Pengemudi Mobil'),
(12, 'gymnastiar', 'ridho', 'Pria', 'Pengemudi Motor'),
(13, 'Aisyah', 'Salsabila', 'Wanita', 'Pengemudi Motor'),
(16, 'ridho', 'puts', 'Pria', 'Pengemudi Mobil'),
(17, 'nabila', 'ananda', 'Wanita', 'Pengemudi Motor'),
(18, 'Rasyid', 'Gymnastiar', 'Pria', 'Pengemudi Mobil'),
(19, 'Fulan', 'Bin Fulan', 'Pria', 'Pengemudi Motor'),
(20, 'Fulanah', 'Bin Fulan', 'Wanita', 'Pengemudi Mobil'),
(21, 'saipul', 'riyanto', 'Pria', 'Pengemudi Mobil'),
(22, 'Fulanah', 'Rahmawati', 'Wanita', 'Pengemudi Motor');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ojekonlinefti`
--
ALTER TABLE `ojekonlinefti`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ojekonlinefti`
--
ALTER TABLE `ojekonlinefti`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
