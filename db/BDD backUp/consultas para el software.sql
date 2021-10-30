SELECT users.id, users.name, budget, time, attractions_type.name AS preferences
FROM users
INNER JOIN attractions_type ON users.fk_id_preference = attractions_type.id
WHERE users.id = ?

"1"	"Eowyn"	"80.0"	"40.0"	"ADVENTURE"

User roberto = new User(1, "Roberto", 100, 100, AttractionType.valueOf("SCENERY"));