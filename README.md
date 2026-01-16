# Auth API – Spring Boot & JWT 🔐

###### REST API for authentication and authorization built with Java and Spring Boot.  
###### Implements secure user registration, login, password hashing and JWT-based authentication.

---

## 🚀 Features

- User registration
- User login
- Password encryption with BCrypt
- JWT token generation
- Spring Security configuration
- Role-based user model (ready for extension)
- RESTful architecture

---

## 🛠 Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT (JSON Web Tokens)
- MySQL
- Maven
- Lombok
- Postman

---

## 📐 Architecture

Controller → Service → Repository → Database
↓
JWT Service

---

## 📦 Endpoints

### Register
POST /api/auth/register

```json
{
  "email": "user@test.com",
  "password": "123456"
}
```

### Login
POST /api/auth/login

```json
{
  "email": "user@test.com",
  "password": "123456"
}
```

---

## ⚙️ Setup

### Requirements
- Java 17+
- MySQL
- Maven

### Database configuration
Edit application.properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
spring.datasource.username=your_user
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

jwt.secret=your_secret_key
jwt.expiration=86400000
```
### Run project
```bash
mvn spring-boot:run
```

---

## 🧭 Project Status

### Implemented
- User entity
- User repository
- Register endpoint
- Login endpoint
- Password encryption
- JWT generation
- Security configuration

### Planned
- JWT validation filter
- Endpoint protection
- Role-based authorization
- Refresh tokens
- Global exception handling
- Unit tests

---

## 👨‍💻 Author

### Nicolás Rojas | Backend Developer – Java & Spring Boot

#### 🔗 LinkedIn: https://linkedin.com/in/nicolaserojas
#### 💻 GitHub: https://github.com/nicorojass
