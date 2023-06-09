/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  justi
 * Created: 9 juin 2023
 */

CREATE TABLE Facture (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  quantité DOUBLE,
  reservation_id BIGINT,
  user_id BIGINT NOT NULL,
  FOREIGN KEY (reservation_id) REFERENCES Reservation(id),
  FOREIGN KEY (user_id) REFERENCES Users(id)
);