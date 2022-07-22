DROP DATABASE IF EXISTS todolist;
CREATE DATABASE IF NOT EXISTS todolist;

USE todolist;

CREATE TABLE IF NOT EXISTS todo (
   id BIGINT UNSIGNED AUTO_INCREMENT,
   name VARCHAR(128) NOT NULL,
   dueDate DATE,
   PRIMARY KEY (id)
);

INSERT INTO todo (name, dueDate)
VALUES ("Walk the dog", "2022-08-13"), ("Wash the pots", "2022-08-14");