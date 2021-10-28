BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `users` (
	`id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT NOT NULL,
	`budget`	REAL NOT NULL DEFAULT 0,
	`time`	REAL NOT NULL DEFAULT 0,
	`fk_id_preference`	INTEGER NOT NULL,
	FOREIGN KEY(`fk_id_preference`) REFERENCES `attractions_type`(`id`)
);

CREATE TABLE IF NOT EXISTS `promotions_attractions` (
	`id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`fk_id_promotion`	INTEGER NOT NULL,
	`fk_id_attraction`	INTEGER NOT NULL,
	FOREIGN KEY(`fk_id_promotion`) REFERENCES `promotions`(`id`),
	FOREIGN KEY(`fk_id_attraction`) REFERENCES `attractions`(`id`)
);

CREATE TABLE IF NOT EXISTS `promotions` (
	`id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT NOT NULL UNIQUE,
	`time`	REAL NOT NULL,
	`cost`	REAL NOT NULL,
	`discount`	REAL NOT NULL,
	`fk_id_promotion_type`	INTEGER NOT NULL,
	FOREIGN KEY(`fk_id_promotion_type`) REFERENCES `promotion_type`(`id`)
);

CREATE TABLE IF NOT EXISTS `promotion_type` (
	`id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`name`	INTEGER NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS `attractions_type` (
	`id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`name`	INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS `attractions` (
	`id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`name`	INTEGER NOT NULL UNIQUE,
	`cost`	REAL NOT NULL,
	`time`	REAL NOT NULL,
	`quota`	INTEGER NOT NULL,
	`fk_id_attraction_type`	INTEGER NOT NULL,
	FOREIGN KEY(`fk_id_attraction_type`) REFERENCES `attractions_type`(`id`)
);

COMMIT;
