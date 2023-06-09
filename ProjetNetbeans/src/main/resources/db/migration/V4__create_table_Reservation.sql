

CREATE TABLE Reservation (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  numero DOUBLE,
  prix DOUBLE,
  email VARCHAR(255),
  adresse VARCHAR(255),
  telephone VARCHAR(255),
  date DATE,
  Status VARCHAR(255),
  user_id BIGINT NOT NULL,
  restaurant_id BIGINT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES Users(id),
  FOREIGN KEY (restaurant_id) REFERENCES Restaurant(id)
);