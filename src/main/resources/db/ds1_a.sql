/*
 Navicat MySQL Data Transfer

 Source Server         : 本地数据库
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost
 Source Database       : sshdemo

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : utf-8

 Date: 01/28/2019 11:03:34 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `ds1_a`
-- ----------------------------
DROP TABLE IF EXISTS `ds1_a`;
CREATE TABLE `ds1_a` (
  `a1` int(11) NOT NULL DEFAULT '0',
  `a2` char(10) DEFAULT NULL,
  PRIMARY KEY (`a1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
