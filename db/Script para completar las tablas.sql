--- OK ---
--- 1 ---
INSERT INTO "attractions_type" (name) VALUES ('ADVENTURE'),
('SCENERY'),
('TASTING');

--- OK ---
--- 2 ---
INSERT INTO "attractions" (id, name, cost, time, quota, fk_id_attraction_type) VALUES (1, 'Moria', 10, 2, 6, 1),
(2,'Minas Tirith', 5, 2.5, 25, 2),
(3,'La Comarca', 3, 6.5, 150, 3),
(4,'Mordor', 25, 3, 4, 1),
(5,'Abismo de Helm', 5, 2, 15, 2),
(6,'Lothlorien', 35, 1, 30, 3),
(7,'Erebor', 12, 3, 32, 2),
(8,'Bosque Negro', 3, 4, 12, 1),
(9,'Paso de Caradhras', 9, 8, 7, 2);


--- OK ---
--- 3 ---
INSERT INTO "users" (id, name, budget, time, fk_id_preference) VALUES (1, 'Eowyn-Normal', 10, 7.25, 1),
(2, 'Eowyn-2-AtracNoBudget', 13, 9, 1),
(3, 'Eowyn-2-AtracNoTime', 48, 8, 1),
(4, 'Eowyn-PromotionNoBudget', 9, 10, 1),
(5, 'Gandalf', 100, 5, 2),
(6, 'Sam', 36, 8, 3),
(7, 'Galadriel', 120, 6, 2),
(8, 'Frodo', 15, 4, 3),
(9, 'Meriadoc', 25, 8, 3),
(10, 'Peregrin', 40, 12, 1),
(11, 'Boromir', 10, 9, 3),
(12, 'Legolas', 26, 4, 2),
(13, 'Gimli', 38, 12, 2),
(100, 'Roberto', 100, 100, 2);


--- OK ---
--- 4 ---
INSERT INTO "promotion_type" (name) VALUES ('PERCENTAGE'),
('ABSOLUTE'),
('A_AND_B');


--- OK ---
--- 5 ---
INSERT INTO "promotions" (id, name, time, cost, discount, fk_id_promotion_type) VALUES (1,'Pack Aventura',0,0,20,1),
(2,'Pack Degustacion',0,0,2,2),
(3,'Pack Paisajes',0,0,0,3);


--- OK ---
--- 5 ---
INSERT INTO "promotions_attractions" (fk_id_promotion, fk_id_attraction) VALUES (1,8),
(1,4),
(2,6),
(2,3),
(3,2),
(3,5),
(3,7);




