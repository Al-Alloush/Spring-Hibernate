

Create TABLE student(
    id int not null AUTO_INCREMENT,
    first_name varchar(150),
    last_name varchar(150),
    email varchar(250) not null,
    PRIMARY key(id)
    )
    
--- start the id fom 300---
ALTER TABLE student AUTO_INCREMENT=300 

--- delete all rows in table and start id from the base
TRUNCATE student