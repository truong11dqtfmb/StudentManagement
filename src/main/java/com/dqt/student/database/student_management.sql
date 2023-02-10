-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th2 10, 2023 lúc 06:42 PM
-- Phiên bản máy phục vụ: 10.4.25-MariaDB
-- Phiên bản PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `student_management`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `students`
--

CREATE TABLE `students` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `students`
--

INSERT INTO `students` (`id`, `email`, `first_name`, `last_name`) VALUES
(15, 'dqt@gmail.com test 1', 'dqt', 'dqt\r\n'),
(14, 'alo@gmail.com test 1', 'alo', 'alo\r\n\r\n'),
(10, 'quoc@gmail.com test 1', 'quoc', 'quoc\r\n'),
(11, 'truong@gmail.com test 1', 'truong', 'truong\r\n'),
(12, 'tuan@gmail.com test 1', 'tuan', 'tuan\r\n'),
(13, 'thanh@gmail.com test 1', 'thanh', 'thanh\r\n'),
(16, 'truong1@gmail.com', 'truong1', 'truong1'),
(17, 'truong1@gmail.com', 'truong2', 'truong2'),
(18, 'truong1@gmail.com', 'truong1', 'truong1'),
(19, 'truong1@gmail.com', 'truong1', 'truong1'),
(20, 'truong1@gmail.com', 'truong1', 'truong1'),
(21, 'truong1@gmail.com', 'truong1', 'truong1'),
(22, 'truong1@gmail.com', 'truong1', 'truong1'),
(23, 'truong1@gmail.com', 'truong1', 'truong1'),
(24, 'truong1@gmail.com', 'truong1', 'truong1'),
(25, 'truong1@gmail.com', 'truong1', 'truong1'),
(26, 'truong1@gmail.com', 'truong1', 'truong1'),
(27, 'truong1@gmail.com', 'truong1', 'truong1'),
(28, 'truong1@gmail.com', 'truong1', 'truong1'),
(29, 'truong1@gmail.com', 'truong1', 'truong1'),
(30, 'truong1@gmail.com', 'truong1', 'truong1'),
(31, 'truong1@gmail.com', 'truong1', 'truong1'),
(32, 'truong1@gmail.com', 'truong1', 'truong1'),
(33, 'truong1@gmail.com', 'truong1', 'truong1'),
(34, 'truong1@gmail.com', 'truong1', 'truong1'),
(35, 'truong1@gmail.com', 'truong1', 'truong1'),
(36, 'truong1@gmail.com', 'truong1', 'truong1'),
(37, 'truong1@gmail.com', 'truong1', 'truong1'),
(38, 'truong1@gmail.com', 'truong1', 'truong1'),
(39, 'truong1@gmail.com', 'truong1', 'truong1'),
(40, 'truong1@gmail.com', 'truong1', 'truong1'),
(41, 'truong1@gmail.com', 'truong1', 'truong1'),
(42, 'truong1@gmail.com', 'truong1', 'truong1'),
(43, 'truong1@gmail.com', 'truong1', 'truong1'),
(44, 'truong1@gmail.com', 'truong1', 'truong1'),
(45, 'truong1@gmail.com', 'truong1', 'truong1'),
(46, 'truong1@gmail.com', 'truong1', 'truong1');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `students`
--
ALTER TABLE `students`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
