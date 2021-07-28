# 动态SQL


环境

```sql
drop table blog;
create table `blog` (
    `id` varchar(50) not null comment '博客id',
    `title` varchar(100) not null comment '标题',
    `author` varchar(30) not null comment '作者',
    `ctime` datetime not null comment '创建时间',
    `views` int(30) not null comment '浏览量'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


```