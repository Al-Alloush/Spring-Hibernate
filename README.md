# Spring & Hibernate 

## add new folder to add jar files

- download **Hibernate ORM** from : [hibernate website](https://hibernate.org/orm/), copy all hibernate jars inside lib -> required to lib folder in project.

- download **MySql Connector (JDBC Driver for MySQL (Connector/J))** from : [MySQL page](https://dev.mysql.com/downloads/connector/j/). copy the jar file inside root directory to lib folder project.

- add all above jars files in Java Build Path, on project > Properties > Java Build Path > Libraries > add all jars inside classpath library.

---

## Test JDBC Connection, 
- create a simple JBDC class to test the connection with MySql Server

---

## Hibernate Development process

### Add Hibernate Configuration File
Hibernate use JDBC in background for communicating with the database.
- Create ``hibernate.cfg.xml`` file in *src root directory* to be available for hibernate to use it, because it has to be on the actual classpath of Application, note: can create it in other location .



### Annotate Java Class
as for as terminology Hibernate has a concept of an Entity Class (java class that mapped to database table), it's like any other Java Class has fields getter & setter methods, then add annotation on it to mapping it a database table.

there are tow options to mapping:

- 1 - XML ``config file`` (old school legacy approach)
- 2 - Java JPA Annotations (modern & preferred approach), JPA annotations are used in mapping java objects to the database tables.
	- step 1) Map class to database table
	- step 2) map field to database columns



---

