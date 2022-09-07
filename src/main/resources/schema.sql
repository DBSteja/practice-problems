
DROP TABLE IF EXISTS HOME;
DROP TABLE IF EXISTS STATUS;

DROP TABLE IF EXISTS ENVIRONMENT;

CREATE TABLE HOME(
  title varchar(80) NOT NULL primary key,
  release_date date default null,
  description varchar(250),
  environment varchar(20),
  status varchar(50)
);

create table status(
status_id int auto increment,
select_status varchar(50),
primary key (status_id)
);

create table environment(
id int,
select_environment varchar(20),
status_id int,
primary key(id),
foreign key(status_id) references status(status_id)
);