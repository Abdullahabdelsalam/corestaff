# 🏢 CoreStaff Platform

An enterprise-grade Employee Management System built with **Spring Boot 4** and **Java 25**, designed to demonstrate real-world backend architecture, security, and production-ready practices.

---

## 🚀 Features

### 🔐 Security
- Session-based Authentication (JSESSIONID)
- Login / Logout system
- Spring Security integration
- CSRF / XSRF protection
- CORS configuration for frontend integration (Angular-ready)
- Role-based access control (ADMIN / USER)

---

### 👨‍💼 Employee Management
- Create Employee
- Update Employee
- Delete Employee
- Get Employee by ID
- List all Employees

---

### ⚙️ Backend Architecture
- Layered architecture (Controller / Service / Repository)
- DTO pattern using Java Records
- Exception handling with ProblemDetail (RFC 7807)
- Clean code separation

---

### ⚡ Performance & Optimization
- Caffeine Cache for read optimization
- Virtual Threads support (Java 25)
- MDC Logging with requestId tracing

---

### 📊 Monitoring & Documentation
- Spring Boot Actuator (Health & Metrics)
- Swagger UI (SpringDoc OpenAPI)

---

### 🐳 DevOps
- Docker Compose setup
  - PostgreSQL
  - pgAdmin
- Environment profiles (dev / prod)

---

### 🧪 Testing
- Unit Testing with Mockito
- Integration Testing with MockMvc
- HTTP file for manual API testing (`crud-employees.http`)

---

## 🏗️ Tech Stack

- Java 25
- Spring Boot 4
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL / PostgreSQL
- Caffeine Cache
- Docker
- Swagger (OpenAPI)
- JUnit 5
- Mockito

---

## 📁 Project Structure
