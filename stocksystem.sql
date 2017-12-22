/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : stocksystem

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-11-12 14:21:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_comm
-- ----------------------------
DROP TABLE IF EXISTS `tb_comm`;
CREATE TABLE `tb_comm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bankroll_id` int(11) NOT NULL,
  `stock_id` varchar(255) NOT NULL,
  `comm_status` varchar(255) NOT NULL,
  `commQuantity` int(255) NOT NULL,
  `accomplishQuantity` int(255) DEFAULT NULL,
  `commPrice` decimal(10,3) NOT NULL,
  `commDate` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `accomplishDate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `stock_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_corporation
-- ----------------------------
DROP TABLE IF EXISTS `tb_corporation`;
CREATE TABLE `tb_corporation` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_registerNumber` varchar(255) NOT NULL,
  `c_password` varchar(255) NOT NULL,
  `c_license` varchar(255) NOT NULL,
  `c_idcard` varchar(255) NOT NULL,
  `c_name` varchar(255) NOT NULL,
  `c_telephone` varchar(255) NOT NULL,
  `c_recordDate` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `c_address` varchar(255) NOT NULL,
  `a_name` varchar(255) NOT NULL,
  `a_idcard` varchar(255) NOT NULL,
  `a_telephone` varchar(255) NOT NULL,
  `a_address` varchar(255) NOT NULL,
  `bankroll_id` int(11) DEFAULT NULL,
  `c_status` int(11) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_fund
-- ----------------------------
DROP TABLE IF EXISTS `tb_fund`;
CREATE TABLE `tb_fund` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usable` decimal(18,2) DEFAULT NULL,
  `freezed` decimal(18,2) DEFAULT NULL,
  `incash` decimal(18,2) DEFAULT NULL,
  `total` decimal(18,2) DEFAULT NULL,
  `tocalStock` decimal(18,2) DEFAULT NULL,
  `transactionPw` varchar(255) NOT NULL,
  `withdrawalsPw` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `idcard` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_position
-- ----------------------------
DROP TABLE IF EXISTS `tb_position`;
CREATE TABLE `tb_position` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bankroll_id` int(11) NOT NULL,
  `stock_id` varchar(225) NOT NULL,
  `count` int(11) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `totalprice` decimal(10,2) NOT NULL,
  `dealdate` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `stock_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_transaction
-- ----------------------------
DROP TABLE IF EXISTS `tb_transaction`;
CREATE TABLE `tb_transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dealDate` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `count` int(11) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `procedureCost` decimal(10,2) NOT NULL,
  `stock_id` varchar(255) NOT NULL,
  `stock_name` varchar(255) NOT NULL,
  `bankroll_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) NOT NULL,
  `u_password` varchar(255) NOT NULL,
  `u_gender` varchar(255) NOT NULL,
  `u_idcard` varchar(255) NOT NULL,
  `u_address` varchar(255) NOT NULL,
  `u_job` varchar(255) NOT NULL,
  `u_education` varchar(255) NOT NULL,
  `u_employer` varchar(255) NOT NULL,
  `u_telephone` varchar(255) NOT NULL,
  `u_recordDate` date NOT NULL,
  `u_type` varchar(255) NOT NULL,
  `u_elseIdcard` varchar(255) DEFAULT NULL,
  `u_status` int(255) NOT NULL,
  `bankroll_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
