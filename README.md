# **Spring Boot Tenant-Lease Management System**

## **Overview**
This project is a **Tenant-Lease Management System** built using **Spring Boot**. It provides a RESTful API to manage tenants and their leases, utilizing **MySQL** as the database. The project follows best practices in software engineering such as **microservices architecture**, **HATEOAS**, and **Eureka Discovery**. It also covers **CRUD operations**, **pagination**, **sorting**, **data validation**, and **exception handling** with custom error responses.

## **Key Features**
- Manage **Tenants** and **Leases** using RESTful APIs.
- Implements **Spring Data JPA** for ORM.
- Utilizes **HATEOAS** to enrich API responses with links.
- **MySQL** database integration.
- Service discovery using **Eureka**.
- **Global Exception Handling** for consistent error responses.
- **MapStruct** for DTO-Entity mapping.
- **Validation** with JSR 380 for input data integrity.
- Unit, integration, and mock tests using **JUnit** and **Mockito**.
  
## **Technologies Used**
- **Spring Boot** (Backend Framework)
- **MySQL** (Database)
- **Spring Data JPA** (ORM)
- **Spring HATEOAS** (Hypermedia Support)
- **Eureka** (Service Discovery)
- **MapStruct** (Entity-DTO Mapper)
- **JUnit, Mockito** (Testing Frameworks)
- **Swagger/OpenAPI** (API Documentation)
  
## **Project Structure**
```bash
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.tenantlease
│   │   │       ├── config          # Configuration classes for DataSource, Eureka, etc.
│   │   │       ├── controller      # REST Controllers for Tenant and Lease
│   │   │       ├── dto             # Data Transfer Objects (DTOs)
│   │   │       ├── entity          # JPA Entities for Tenant and Lease
│   │   │       ├── exception       # Custom exceptions and global error handling
│   │   │       ├── mapper          # MapStruct mappers for entity-DTO conversions
│   │   │       ├── repository      # Repositories for Tenant and Lease (Spring Data JPA)
│   │   │       ├── service         # Service interfaces and implementations for Tenant and Lease
│   │   │       └── util            # Utility classes (e.g., for pagination)
│   │   └── resources
│   │       ├── application.properties # MySQL, Eureka, Swagger configurations
│   │       └── data.sql             # Optional: Pre-populated SQL data for the database
│   ├── test
│   │   └── java
│   │       └── com.example.tenantlease
│   │           ├── controller       # Test cases for REST Controllers
│   │           ├── service          # Test cases for Service Layer
│   │           └── repository       # Test cases for Repositories
└── pom.xml
# **Setting Up the Project**
**Pre-requisites**
Before you begin, ensure you have the following installed:

- Java 11 or higher
- Maven
- MySQL
- Eureka Server (Running for service discovery)


1. Clone the repository
bash
Copy code
git clone https://github.com/yourusername/tenant-lease-management.git
cd tenant-lease-management
2. Configure the Database
Edit the application.properties file located in src/main/resources with your MySQL database credentials.

properties
Copy code
# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/tenant_lease_db
spring.datasource.username=root
spring.datasource.password=yourpassword

# JPA Settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Eureka Discovery
eureka.client.service-url.defaultZone=http://localhost:8761/eureka
3. Install Dependencies
bash
Copy code
mvn clean install
4. Running the Application
Start the application by running:

bash
Copy code
mvn spring-boot:run
The application will be accessible at http://localhost:8080.

5. Accessing Eureka Dashboard
The Eureka dashboard can be accessed via http://localhost:8761. Ensure your Eureka server is running.

API Endpoints

HTTP Method	Endpoint	Description
GET	/tenants	Retrieve all tenants
GET	/tenants/{id}	Retrieve tenant by ID
POST	/tenants	Create a new tenant
PUT	/tenants/{id}	Update an existing tenant
DELETE	/tenants/{id}	Delete a tenant by ID
GET	/leases	Retrieve all leases
GET	/leases/{id}	Retrieve lease by ID
POST	/leases	Create a new lease
PUT	/leases/{id}	Update an existing lease
DELETE	/leases/{id}	Delete a lease by ID
The responses are enriched with HATEOAS links to allow for further navigations.

HATEOAS Example
A sample response with HATEOAS links for GET /tenants/{id}:

json
Copy code
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com",
  "_links": {
    "self": {
      "href": "http://localhost:8080/tenants/1"
    },
    "leases": {
      "href": "http://localhost:8080/tenants/1/leases"
    }
  }
}

# **Testing**

**Unit Testing**
The project includes unit tests for services and controllers. To run the unit tests:

bash
Copy code
mvn test
**Integration Testing**
- Integration tests use MockMvc and ensure that the application behaves correctly with Eureka discovery and the database.

**Test Coverage**
- The project aims to achieve 100% test coverage for critical functionalities including service layers, controllers, and repository interactions.

**Swagger API Documentation**

- Swagger is configured to document and test APIs via the UI. After running the application, Swagger can be accessed at:

bash
Copy code
http://localhost:8080/swagger-ui/index.html
**Contributing**

We welcome contributions to this project. If you'd like to contribute:

Fork the repository.
Create a feature branch (git checkout -b feature/my-feature).
Commit your changes (git commit -am 'Add new feature').
Push to the branch (git push origin feature/my-feature).
Create a new Pull Request.
License

This project is licensed under the MIT License - see the LICENSE file for details.




