# Student Management System

## Overview

A Java and MySQL based Student Management System that allows users to perform CRUD (Create, Read, Update, Delete) operations on student records.

The project demonstrates database connectivity using JDBC and follows a simple layered architecture for managing student information efficiently.

---

## Features

* Add new student records
* View all students
* Update existing student details
* Delete student records
* MySQL database integration
* JDBC connectivity
* Menu-driven console interface

---

## Technologies Used

* Java
* JDBC
* MySQL
* SQL
* Git & GitHub

---

## Database Schema

Table: students

| Column | Type              |
| ------ | ----------------- |
| id     | INT (Primary Key) |
| name   | VARCHAR(100)      |
| age    | INT               |
| course | VARCHAR(100)      |

---

## Project Structure

src/
├── Student.java
├── StudentDAO.java
├── DatabaseConnection.java
└── Main.java

---

## How to Run

### Clone Repository

git clone https://github.com/yourusername/Student-Management-System.git

### Open Project

Open in IntelliJ IDEA or any Java IDE.

### Create Database

Run database.sql in MySQL.

### Configure Database

Update database credentials in DatabaseConnection.java.

### Compile and Run

Run Main.java

---

## Learning Outcomes

* JDBC Connectivity
* SQL CRUD Operations
* Object-Oriented Programming
* Exception Handling
* Database Management
* Git and GitHub Workflow

---

## Future Enhancements

* Java Swing GUI
* Spring Boot Integration
* Search and Filter Features
* User Authentication

---

## Author

Shrishti Yadav 
B.Tech CSE (AI)
KIET Group of Institutions
