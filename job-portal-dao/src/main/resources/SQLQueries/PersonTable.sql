CREATE DATABASE IF NOT EXISTS jobPortal;
 
USE jobPortal;
 
CREATE TABLE IF NOT EXISTS Person (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50)
);