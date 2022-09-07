create table home(title varchar(250) ,date Date,description varchar(1000),status varchar(250),environment varchar(250));
insert into home (title,date,description,status,environment)
values ('java','2008-11-11','java file','progress','java');

--Environment drop down
CREATE SCHEMA project_management;
CREATE TABLE project_management.environment_drop_down(
env_id bigint not null auto_increment primary key,
env_name varchar(15)
);
insert into project_management.environment_drop_down (env_id,env_name) values
 (1,'Pre'),(2,'Pro'),(3,'Test');


--PRE table
 CREATE TABLE project_management.pre_table(
pre_id bigint not null auto_increment primary key ,
pre_title varchar(50),
pre_release_date date,
pre_status varchar(50),
pre_environment varchar(10)
);
insert into project_management.pre_table (pre_id,pre_title,pre_release_date,pre_status,pre_environment) values
 (1,'java',"2022-09-07",'OnProgress','PRE'),(2,'java2',"2022-09-06",'Completed','PRO'),(3,'java3',"2022-09-05",'OnProgress','TEST');