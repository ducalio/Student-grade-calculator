# Java Inheritance Demo

## 📌 Description

This Java program demonstrates object-oriented programming concepts, specifically inheritance and method overriding.

The program creates instances of different classes in an inheritance hierarchy:

* Person (base class)
* Student (inherits from Person)
* GraduateStudent (inherits from Student)
* Teacher (inherits from Person)
* School (final class)

It showcases single, multilevel, and hierarchical inheritance.

---

## ⚙️ Features

* Demonstrates single inheritance (Student extends Person)
* Shows multilevel inheritance (GraduateStudent extends Student)
* Illustrates hierarchical inheritance (Teacher extends Person)
* Uses method overriding and super keyword
* Includes a final class that cannot be inherited

---

## 🧠 Concepts Used

* Classes and Objects
* Inheritance (extends keyword)
* Method Overriding
* super keyword for calling parent methods
* Access modifiers (protected, private)
* final classes
* Constructors in inheritance

---

## ▶️ How to Run

1. Save the file as:

   ```
   Main.java
   ```

2. Compile the program:

   ```
   javac Main.java
   ```

3. Run the program:

   ```
   java Main
   ```

---

## 🧪 Example Output

```
--- Student ---
Name: Caleb, Age: 17
Grade: 12

--- Graduate Student ---
Name: John, Age: 24
Grade: 16
Research Topic: Cybersecurity

--- Teacher ---
Name: Mr. Smith, Age: 40
Subject: Math

Welcome to the School System
```

---

## 📚 Inheritance Types Demonstrated

* **Single Inheritance**: Student inherits from Person
* **Multilevel Inheritance**: GraduateStudent inherits from Student (which inherits from Person)
* **Hierarchical Inheritance**: Both Student and Teacher inherit from Person
* **Final Class**: School cannot be extended

---

## ✍️ Author

Student project for learning Java OOP concepts.
