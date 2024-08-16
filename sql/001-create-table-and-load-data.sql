DROP TABLE IF EXISTS boxerdata;

CREATE TABLE boxerdata
(
  id INT UNSIGNED AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  number_of_matches INT NOT NULL,
  win INT NOT NULL,
  ko INT NOT NULL,
  loss INT NOT NULL,
  draw INT NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO boxerdata (name, number_of_matches,win, ko, loss,draw)VALUES ('Inoue Naoya', 27,27, 24,0,0);
INSERT INTO boxerdata (name, number_of_matches,win, ko, loss,draw)VALUES ('Hasegawa Hozumi',41,36, 16, 5,0);
INSERT INTO boxerdata (name, number_of_matches,win, ko, loss,draw)VALUES ('Yaegashi Azuma', 35, 28, 16,7,0);
INSERT INTO boxerdata (name, number_of_matches,win, ko, loss,draw)VALUES ('Yamanaka Shinsuke', 31, 27, 19,2,2);
INSERT INTO boxerdata (name, number_of_matches,win, ko, loss,draw)VALUES ('Uchiyama takashi', 27, 24, 20,2,1);
