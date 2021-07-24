
## Mysql 配置
```
url:  jdbc:mysql://127.0.0.1:3316/mybatis?useSSL=true
user：mybatis
db:   mybatis
password: yy123456
port : 3316

```


## sql 
```sql

-- 创建数据库
create database mybatis default charset=utf8;

-- 创建用户并授权;
use mysql;
CREATE USER 'mybatis'@'%' IDENTIFIED BY 'yy123456';

-- 为用户添加权限
GRANT ALL ON mybatis.* TO 'mybatis'@'%';


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'king', '*23AE809DDACAF96AF0FD78ED04B6A265E05AA257');
INSERT INTO `user` VALUES (2, 'Ares', '*6BB4837EB74329105EE4568DDA7DC67ED2CA2AD9');
INSERT INTO `user` VALUES (3, 'GeekHall', '*6BB4837EB74329105EE4568DDA7DC67ED2CA2AD9');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

```