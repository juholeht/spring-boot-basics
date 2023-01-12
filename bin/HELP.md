# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)



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

