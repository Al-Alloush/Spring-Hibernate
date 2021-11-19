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

### Develop Java Code to perform database operation, like save java object using hibernate.

develop Java code to perform database operations. there are tow key player in hibernate:
- 1) SessionFactory: Reads the hibernate config file, create Session object, Heavy-weight object, **only create once in your app** and then you can reuse it X number of time throughout the Application.
	- This is a person that reads the hibernate config file, gets a connection to the database,and it'll create the session objects
	- when SessionFactory created, it will create sessions(objects) the second player.
	
- 2) Session: Wraps around a JDBC connection to database. Main object used to save/retrieve objects to database. Short-live object. Retrieve from SessionFactory. 
	- after Create Session from SessionFactory, It's short-live object, for a given method, you'll get a session, you'll use it then you'll throw it away and over and over when you need.
	- the Session is retrieved from SessionFactory the previous player

- to test save new Student object in database, need to create student table and has columns the same fields in student class.
---

