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

 Date: 01/28/2019 11:03:43 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `ds2_b`
-- ----------------------------
DROP TABLE IF EXISTS `ds2_b`;
CREATE TABLE `ds2_b` (
  `b1` int(11) NOT NULL DEFAULT '0',
  `b2` char(10) DEFAULT NULL,
  PRIMARY KEY (`b1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
