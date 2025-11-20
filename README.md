# Online Healthcare Management System Using Java, JDBC, Servlets & JSP

## Overview
This is a web-based Online Healthcare Management System implemented in Java using Object-Oriented Programming (OOP) principles along with Servlets, JSP, and JDBC. It allows users to:

- Register as Patient or Doctor  
- Login with authentication  
- Book appointments (Patient)  
- View/manage appointments (Doctor)  
- Store and retrieve data using MySQL  

The system demonstrates modular design, MVC architecture, and integration of core Java concepts with database connectivity.

---

## Features
- User registration & login  
- Role-based dashboards (Patient / Doctor)  
- Appointment booking with date, time, and reason  
- Doctors can view all assigned appointments  
- Input validation & error handling  
- JDBC-based database operations using DAO pattern  
- Session handling using Servlets  

---

## OOP Concepts Demonstrated
- **Encapsulation:**  
  Model classes (User, Appointment) use private fields with public getters/setters.

- **Modularity:**  
  Separate layers for Models, DAOs, Servlets, and JSP Views.

- **Abstraction:**  
  Core functions like `saveUser()`, `findByUsername()`, `saveAppointment()` are abstracted in DAO interfaces.

- **Reusability:**  
  `DBUtil.java` provides a reusable database connection handler.

---

## How to Run

### 1. Compile and Build
If using Maven:
```bash
mvn clean package
