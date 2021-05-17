/*
 Navicat Premium Data Transfer

 Source Server         : maven
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : bookdb

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 16/05/2021 12:21:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `Author` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `publish` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `publishdate` date NULL DEFAULT NULL,
  `Page` int(5) NULL DEFAULT NULL,
  `Price` int(5) NULL DEFAULT NULL,
  `Content` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, 'java', '李洁', '清华出版社', '2021-04-27', 130, 20, '出自清华大学');
INSERT INTO `book` VALUES (2, 'C++', '梁强胜', '西安邮电大学出版社', '2021-05-01', 280, 30, '出自西安大学');
INSERT INTO `book` VALUES (3, 'Html', '朱少敏', '人民邮电出版社', '2021-04-27', 320, 28, '中国工信出版集团');
INSERT INTO `book` VALUES (4, 'Python', '董志桢', '北京邮电出版社', '2021-04-27', 530, 37, '出自北京大学');
INSERT INTO `book` VALUES (11, 'java1', 'dsd', '北京', '2021-04-30', 32, 23, '广西科技师范学院');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `age` int(5) NULL DEFAULT NULL,
  `sex` int(2) NULL DEFAULT NULL,
  `nickname` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `usertype` int(2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '小李', '123', 18, 0, '小李子', 1);
INSERT INTO `user` VALUES (2, '小雪', '456', 19, 1, '花仙子', 2);
INSERT INTO `user` VALUES (3, '小梁', '789', 20, 1, '阳光子', 1);
INSERT INTO `user` VALUES (4, '小青', '123', 18, 1, '月亮兔', 2);

SET FOREIGN_KEY_CHECKS = 1;
