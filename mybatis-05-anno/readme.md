# 使用注解开发


## @Param() 注解
* 基本类型的参数或者String类型，需要加上
* 引用类型不需要加
* 如果只有一个基本类型的话可以忽略，但是建议都加上
* SQL中使用的就是@Param中设定的属性名


## db sql

```sql
create table `teacher`(
    `id` int(10) not null,
    `name` varchar(30) default NULL,
    primary key (`id`)
);

create table `student`(
    `id` int(10) not null,
    `name` varchar(30) default NULL,
    `tid` int(10) default null,
    primary key (`id`),
    key `fktid` (`tid`),
    constraint `fktid` foreign key (`tid`) references `teacher` (`id`)
);

insert into `teacher` (id, name) values (1, '极客堂');
insert into `student` (id, name, tid) values (1, '小红', '1');
insert into `student` (id, name, tid) values (2, '小象', '1');
insert into `student` (id, name, tid) values (3, '小红象', '1');
insert into `student` (id, name, tid) values (4, '小象红', '1');
insert into `student` (id, name, tid) values (5, '小张', '1');
insert into `student` (id, name, tid) values (6, '老王', '1');


```