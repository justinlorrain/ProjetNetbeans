/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  justi
 * Created: 9 juin 2023
 */

CREATE TABLE Users (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(30),
  last_name VARCHAR(255),
  email VARCHAR(255),
  adresse VARCHAR(255),
  telephone VARCHAR(255),
  date DATE,
  Role VARCHAR(255)
);