drop table if exists score_info;

create table score_info(
id int PRIMARY key auto_increment,
no varchar(20),
name varchar(20),
grade int,
clazz int ,
math double,
english double,
chinese double
);
create index name_index on score_info(name);
create index math_index on score_info(math);
create index english_index on score_info(english);
create index chinese_index on score_info(chinese);