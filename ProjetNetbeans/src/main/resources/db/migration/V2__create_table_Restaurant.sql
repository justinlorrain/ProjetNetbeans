/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  justi
 * Created: 9 juin 2023
 */

CREATE TABLE Restaurant (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  lastname VARCHAR(255),
  adresse VARCHAR(255),
  phone VARCHAR(255),
  ville VARCHAR(255),
  rue VARCHAR(255)
);