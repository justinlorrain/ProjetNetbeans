/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  justi
 * Created: 9 juin 2023
 */

CREATE TABLE Payement (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  methode_paiement VARCHAR(255),
  Date DATE,
  reservation_id BIGINT,
  FOREIGN KEY (reservation_id) REFERENCES Reservation(id)
);
