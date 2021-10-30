BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `users` (
	`id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT NOT NULL,
	`budget`	REAL NOT NULL DEFAULT 0,
	`time`	REAL NOT NULL DEFAULT 0,
	`fk_id_preference`	INTEGER NOT NULL,
	FOREIGN KEY(`fk_id_preference`) REFERENCES `attractions_type`(`id`)
);
INSERT INTO `users` VALUES (1,'Eowyn-Normal',10.0,7.25,1);
INSERT INTO `users` VALUES (2,'Eowyn-2-AtracNoBudget',13.0,9.0,1);
INSERT INTO `users` VALUES (3,'Eowyn-2-AtracNoTime',48.0,8.0,1);
INSERT INTO `users` VALUES (4,'Eowyn-PromotionNoBudget',9.0,10.0,1);
INSERT INTO `users` VALUES (5,'Gandalf',100.0,5.0,2);
INSERT INTO `users` VALUES (6,'Sam',36.0,8.0,3);
INSERT INTO `users` VALUES (7,'Galadriel',120.0,6.0,2);
INSERT INTO `users` VALUES (8,'Frodo',15.0,4.0,3);
INSERT INTO `users` VALUES (9,'Meriadoc',25.0,8.0,3);
INSERT INTO `users` VALUES (10,'Peregrin',40.0,12.0,1);
INSERT INTO `users` VALUES (11,'Boromir',10.0,9.0,3);
INSERT INTO `users` VALUES (12,'Legolas',26.0,4.0,2);
INSERT INTO `users` VALUES (13,'Gimli',38.0,12.0,2);
INSERT INTO `users` VALUES (14,'Roberto',100.0,100.0,2);
COMMIT;
