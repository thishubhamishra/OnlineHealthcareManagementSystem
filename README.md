# Online Healthcare Management System

A web-based **Online Healthcare Management System** built using **Core Java, JDBC, Servlets, JSP, and MySQL**.  
The system provides role-based access for Patients and Doctors with full appointment management features.

---

## 🚀 Overview

This system allows users to:

- Register as **Patient** or **Doctor**
- Login with **role-based authentication**
- **Book appointments** (Patient)
- **View/manage appointments** (Doctor)
- Store and manage data using a secure MySQL database

The project follows **MVC Architecture**, ensures modularity, and demonstrates clean **OOP principles**.

---

## 📌 Features

### 🔹 User Management
- Register as **Patient** or **Doctor**
- Login with authentication
- Role-based dashboards
- Session handling with Servlets

### 🔹 Appointment System
- Patients can **book appointments**
- Doctors can **view assigned appointments**
- Appointment details: date, time, reason, status  
- Status types: **BOOKED / CANCELLED / COMPLETED**

### 🔹 Database Integration
- MySQL database via JDBC
- **DAO (Data Access Object) pattern**
- Secure `PreparedStatement` queries
- `schema.sql` included for easy setup

### 🔹 Web Functionality
- JSP pages for front-end UI
- Servlets for server-side logic
- Proper forward/redirect usage
- Clean MVC folder structure

---

## 🧱 OOP Concepts Used

### ✔ Encapsulation
Model classes use private fields with getters/setters.

### ✔ Modularity
Separate packages for:
- DAO interfaces  
- DAO implementations  
- Models  
- Servlets  
- JSP pages  

### ✔ Abstraction
Database operations abstracted through DAO methods like:
- `saveUser()`
- `findByUsername()`
- `saveAppointment()`

### ✔ Reusability
`DBUtil.java` centralizes database connection logic.

---
