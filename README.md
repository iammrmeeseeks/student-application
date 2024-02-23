
# Student application

## Overview

This Student application is an application designed to manage student records efficiently. Utilizing Spring, JPA (Java Persistence API), and H2 Database, it provides a comprehensive solution for Create, Read operations on student entities.

## Features

- **Operations:** Supports adding, retrieving student records.
- **API:** Exposes endpoints for interaction with student records.
- **In-Memory Database:** Utilizes H2 Database for quick setup and testing.

## Components

1. **Student Entity:** Represents the student data model.
2. **Student Repository:** Interface for data access operations, extending JpaRepository.
3. **Student Service:** Contains business logic for managing student records.
4. **Student Controller:** Controller to handle HTTP requests.
5. **Application Entry Point:** Main class that runs the application.

## Getting Started

### Prerequisites

- JDK 11 or later
- Maven 3.2+

### Running the Application

1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using:

```sh
mvn spring-boot:run
```

### API Endpoints

- `POST /students/new`: Add a new student.
- `GET /students/info`: Retrieve added students.
- `GET /students`: Retrieve all students.

### Technologies

- **Spring**: Framework for building web applications.
- **JPA/Hibernate**: For ORM and data persistence.
- **H2 Database**: In-memory database.
