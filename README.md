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



---

