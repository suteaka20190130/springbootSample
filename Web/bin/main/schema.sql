create table if not exists user (
    id int primary key auto_increment,
    name varchar(50),
    url varchar(50),
    comment varchar(255),
	postdate date,
	favorite int
);
