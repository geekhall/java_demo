
## 数据库环境搭建

```sql
-- 创建数据库
create database db01 default charset=utf8;

-- 创建用户并授权;
use mysql;
CREATE USER 'user01'@'%' IDENTIFIED BY 'yy123456';

-- 为用户添加权限
GRANT ALL ON db01.* TO 'user01'@'%';


-- 建表
use db01;
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `db_source` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
	  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- 插入数据
insert into dept(dname, db_source) values ('开发部', DATABASE());
insert into dept(dname, db_source) values ('人事部', DATABASE());
insert into dept(dname, db_source) values ('财务部', DATABASE());
insert into dept(dname, db_source) values ('市场部', DATABASE());
insert into dept(dname, db_source) values ('运维部', DATABASE());

-- 查看结果
select * from db01.dept;

```
