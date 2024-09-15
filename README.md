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
