# 🎟️ Ticket Booking System

A simple **Spring Boot** application for managing movie ticket bookings. This project demonstrates CRUD operations using Spring Boot, Spring Data JPA, and a layered architecture for clean code management.

## 🚀 Features

- Add new tickets
- View all tickets
- View a single ticket by ID
- Update ticket details
- Delete a ticket
- Integrated with H2 in-memory database

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Lombok


## 🧪 API Endpoints

| Method | Endpoint             | Description              |
|--------|----------------------|--------------------------|
| GET    | `/tickets`           | Get all tickets          |
| GET    | `/tickets/{id}`      | Get ticket by ID         |
| POST   | `/tickets`           | Add a new ticket         |
| PUT    | `/tickets/{id}`      | Update a ticket          |
| DELETE | `/tickets/{id}`      | Delete a ticket by ID    |

## ⚙️ Configuration

In `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:ticketdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```
# 🧰 How to Run
> Clone the repository:
```
git clone https://github.com/Prakash123456780/Ticket-Booking.git
cd Ticket-Booking
```
> Build the project using Maven:
```
mvn clean install
```
> Run the application:
```
mvn spring-boot:run
```
The app will start on http://localhost:8080.






