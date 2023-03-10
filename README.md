# spring-boot-basics
Web app basics using Spring boot

### Prerequisites
* JDK 1.8+
* Maven 3.2+
* Standalone mongoDB: https://www.mongodb.com/docs/manual/administration/install-community/
(directory needs to be created manually for mongoDB and start by using following option: mongod --dbpath ~/data/db)

### Examples presented in the project:
* Project initialized with Spring intialzr 
* Greeting object created
* Greeting controller created with Get and Post methods
* Simple test cases for controller
* Simple authentication using MVC

### Notes
# Queries:
## Default greeting
 curl http://localhost:8080/greeting
## Greeting for John
 curl "http://localhost:8080/greeting?name=john"
## Dynamic greeting
 curl -H 'Content-Type: application/json' http://localhost:8080/greeting -d '{"id":6,"content":"Hello, anna!"}'
## Add new applicant to DB:
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"john\",  \"lastName\" : \"mclane\" }" http://localhost:8080/applicants
## List applicants
curl http://localhost:8080/applicants
## PUT / PATCH / DELETE methods using applicant ID, e.g.
curl -X PUT -H "Content-Type:application/json" -d "{ \"firstName\": \"johnny\", \"lastName\": \"mclane\" }" http://localhost:8080/applicants/4334k2nn34vc5ly3
## find by last name:
curl "http://localhost:8080/applicants/search/findByLastName?name=mclane"