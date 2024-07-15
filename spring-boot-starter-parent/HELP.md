# Read Me First
The following was discovered as part of building this project:

* The original package name 'org.springframework.boot.spring-boot-starter-parent' is invalid and this project uses 'org.springframework.boot.spring_boot_starter_parent' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#web)
* [WebSocket](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#messaging.websockets)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#using.devtools)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#io.webservices)
* [Jersey](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#web.servlet.jersey)
* [JDBC API](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#data.sql)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.2.8-SNAPSHOT/reference/htmlsingle/index.html#data.sql.jdbc)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

