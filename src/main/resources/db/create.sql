SET MODE postgreSQL;

CREATE TABLE IF NOT EXISTS departments(
id int PRIMARY KEY auto_increment,
     departmentName VARCHAR;
     description VARCHAR;
     totalEmployees int;
     id int;

);



CREATE TABLE IF NOT EXISTS news(
id int PRIMARY KEY auto_increment,
    news VARCHAR,
    departmentId int,
    id int,
);



CREATE TABLE IF NOT EXISTS user(
id int PRIMARY KEY auto_increment,
    username VARCHAR,
    address VARCHAR,
    phone VARCHAR,
    email VARCHAR,
    departmentId int,
    position VARCHAR,
    roles VARCHAR,
);

