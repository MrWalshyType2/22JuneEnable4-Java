DROP DATABASE IF EXISTS example;
CREATE DATABASE IF NOT EXISTS example;

USE example;

CREATE TABLE IF NOT EXISTS user (
   id BIGINT UNSIGNED AUTO_INCREMENT,
   forename VARCHAR(128) NOT NULL,
   surname VARCHAR(128) NOT NULL,
   age TINYINT UNSIGNED,
   PRIMARY KEY (id)
);

INSERT INTO user (forename, surname, age)
VALUES ("Fred", "Smith", 32), ("Aiden", "Walker", 27), ("Sarah", "Hills", 29), ("Marcus", "Cooper", 35);