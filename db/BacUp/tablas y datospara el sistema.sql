CREATE TABLE IF NOT EXISTS 'attraction_type' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	'name'	INTEGER NOT NULL
);
INSERT INTO 'attraction_type' (id, name) VALUES (1,'ADVENTURE'),
(2,'SCENERY'),
(3,'TASTING');

CREATE TABLE IF NOT EXISTS 'users' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	'name'	TEXT NOT NULL,
	'budget'	REAL NOT NULL DEFAULT 0,
	'time'	REAL NOT NULL DEFAULT 0,
	'fk_id_preference'	INTEGER NOT NULL,
	FOREIGN KEY('fk_id_preference') REFERENCES 'attraction_type'('id')
);

INSERT INTO 'users' (id, name, budget, time, fk_id_preference,password) VALUES (1,'admin',10.0,7.25,1,'admin'),
(2,'Eowyn-Normal',10.0,7.25,1,''),
(3,'Eowyn-2-AtracNoBudget',13.0,9.0,1,''),
(4,'Eowyn-2-AtracNoTime',48.0,8.0,1,''),
(5,'Eowyn-PromotionNoBudget',9.0,10.0,1,''),
(6,'Gandalf',100.0,5.0,2,''),
(7,'Sam',36.0,8.0,3,''),
(8,'Galadriel',120.0,6.0,2,''),
(9,'Frodo',15.0,4.0,3,''),
(10,'Meriadoc',25.0,8.0,3,''),
(11,'Peregrin',40.0,12.0,1,''),
(12,'Boromir',10.0,9.0,3,''),
(13,'Legolas',26.0,4.0,2,''),
(14,'Gimli',38.0,12.0,2,''),
(15,'Roberto',100.0,100.0,2,'');

CREATE TABLE IF NOT EXISTS 'promotion_type' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	'name'	INTEGER NOT NULL UNIQUE
);
INSERT INTO 'promotion_type' (id, name) VALUES (1,'PERCENTAGE'),
(2,'ABSOLUTE'),
(3,'A_AND_B');

CREATE TABLE IF NOT EXISTS 'promotions' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	'name'	TEXT NOT NULL,
	'time'	REAL NOT NULL,
	'cost'	REAL NOT NULL,
	'discount'	REAL NOT NULL,
	'fk_id_promotion_type'	INTEGER NOT NULL,
	FOREIGN KEY('fk_id_promotion_type') REFERENCES 'promotion_type'('id')
);
INSERT INTO 'promotions' (id, name, time, cost, discount, fk_id_promotion_type) VALUES (1,'Pack Aventura',0.0,0.0,20.0,1),
(2,'Pack Degustacion',0.0,0.0,2.0,2),
(3,'Pack Paisajes',0.0,0.0,0.0,3),
(4,'Pack Promo Porcentaje',0.0,0.0,10.0,1),
(5,'Pack Promo Absoluta',0.0,0.0,4.0,2),
(6,'Pack Promo A & B',0.0,0.0,0.0,3);

CREATE TABLE IF NOT EXISTS 'attractions' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	'name'	TEXT NOT NULL,
	'cost'	REAL NOT NULL,
	'time'	REAL NOT NULL,
	'quota'	INTEGER NOT NULL,
	'fk_id_attraction_type'	INTEGER NOT NULL,
	FOREIGN KEY('fk_id_attraction_type') REFERENCES 'attraction_type'('id')
);
INSERT INTO 'attractions' (id, name, cost, time, quota, fk_id_attraction_type) VALUES (1,'Moria',10.0,2.0,6,1),
(2,'Minas Tirith',5.0,2.5,25,2),
(3,'La Comarca',3.0,6.5,150,3),
(4,'Mordor',25.0,3.0,4,1),
(5,'Abismo de Helm',5.0,2.0,15,2),
(6,'Lothlorien',35.0,1.0,30,3),
(7,'Erebor',12.0,3.0,32,2),
(8,'Bosque Negro',3.0,4.0,12,1),
(9,'Paso de Caradhras',9.0,8.0,7,2),
(10,'Parth Galen',7.0,5.0,6,3);

CREATE TABLE IF NOT EXISTS 'promotions_attractions' (
	'id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	'fk_id_promotion'	INTEGER NOT NULL,
	'fk_id_attraction'	INTEGER NOT NULL,
	FOREIGN KEY('fk_id_attraction') REFERENCES 'attractions'('id'),
	FOREIGN KEY('fk_id_promotion') REFERENCES 'promotions'('id')
);
INSERT INTO 'promotions_attractions' (id, fk_id_promotion, fk_id_attraction) VALUES (1,1,8),
(2,1,4),
(3,2,6),
(4,2,3),
(5,3,2),
(6,3,5),
(7,3,7);
