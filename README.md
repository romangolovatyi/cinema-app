# CINEMA-APPLICATION 🎦
## 🖊️ Description
Simple RESTful web application will help you manage a cinema platform:
- registration and authentication users;
- CRUD cinema halls,  movies, shoping carts and others;
- a layered system:
  - adherence to SOLID principles;
  - handling HTTP requests in controllers
    filtering;
  - retrieving information from DB.

## 🏃 How to Install and Run the Project
1. Install JDK v11 or later
2. Clone this project to your JDK
3. Install Database Management System (recomended MySQL 8.0.22 and use MySQLWorkbench v8.0 or later)
4. Install Apache Tomcat 9.0.50
5. Install some Java IDE (recomended IDE IntelliJ Ultimate)
6. Configure connection to DB in [db.properties](src/main/java/resources/db.properties) file
7. Install Apache Tomcat v9.0.69 or later and [configure them](https://www.jetbrains.com/help/idea/run-debug-configuration-tomcat-server.html)
8. Run application

## ⚙ Technologies
### **Web**
* Apache Tomcat v9.0.69
### **Database**
* MySql Database v8.0.22
### **Enviroments**
* MySqlWorkbench enviroment v8.0 CE
* IntelliJ IDEA
### **Others**
* Apache Maven as application builder
* Spring MVC and Spring Security
* ORM Hibernate

## ⚠️ Warning
1. When you run a project you need enter a nickname **admin@gmail.com** and password **12345678** if you want to login as *ADMIN* or **user@gmail.com** and password **12345678** as *USER*.

You can change this properties in the [DataInitializer](src/main/java/mate/academy/cinema/util/DataInitializer.java) file.

2. I recommend you to use [Postman](https://www.postman.com/) to perform CRUD operations within the project