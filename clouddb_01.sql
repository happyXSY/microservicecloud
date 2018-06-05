/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : clouddb_01

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2018-06-05 20:04:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `dbsource` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('2', 'a', 'clouddb_01');
INSERT INTO `dept` VALUES ('3', 'a', 'clouddb_01');
INSERT INTO `dept` VALUES ('4', 'a', 'clouddb_01');

-- ----------------------------
-- Table structure for empl
-- ----------------------------
DROP TABLE IF EXISTS `empl`;
CREATE TABLE `empl` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8 NOT NULL,
  `age` int(3) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `sourcedb` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of empl
-- ----------------------------
INSERT INTO `empl` VALUES ('1', '徐申玉', '30', '18326605332', 'clouddb_01');
INSERT INTO `empl` VALUES ('2', '?', '32', '15209555521', 'clouddb_01');
INSERT INTO `empl` VALUES ('3', '?', '32', '15209555521', 'clouddb_01');
INSERT INTO `empl` VALUES ('4', '?', '32', '15209555521', 'clouddb_01');
INSERT INTO `empl` VALUES ('5', '?', '32', '15209555521', 'clouddb_01');
INSERT INTO `empl` VALUES ('6', '?', '32', '15209555521', 'clouddb_01');
INSERT INTO `empl` VALUES ('7', '?', '32', '15209555521', 'clouddb_01');
INSERT INTO `empl` VALUES ('8', '?', '32', '15209555521', 'clouddb_01');
