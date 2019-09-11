/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50532
Source Host           : localhost:3306
Source Database       : springbootdemo

Target Server Type    : MYSQL
Target Server Version : 50532
File Encoding         : 65001

Date: 2019-09-11 22:26:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(36) NOT NULL,
  `pass_word` varchar(36) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '111', 'aY1RoZ2KEhzlgUmde3AWaA==', '2019-09-11 22:09:20');
INSERT INTO `user` VALUES ('2', '222', 'vL4zZeasleosA0OiOVg03Q==', '2019-09-11 22:10:01');
INSERT INTO `user` VALUES ('3', '333', 'MQ3Lv0zOYvdioqqhSNVWvQ==', '2019-09-11 22:16:12');
