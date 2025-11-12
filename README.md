
### 🎓 Student Result Management System

A simple Java-based console application for managing student marks and results — built to demonstrate **exception handling**, **custom exceptions**, and **object-oriented programming**.

---

#### 🧠 Features

* Add new student records with marks for 3 subjects.
* Validate marks to ensure they are between `0–100`.
* Automatically calculate average and determine pass/fail.
* Handles:

  * Custom exception (`InvalidMarksException`)
  * Input mismatches
  * Missing or invalid data
* Uses `try-catch-finally`, `throw`, and `throws` correctly.

---

#### 🧩 Project Structure

```
C:\JavaProjects\StudentResultSystem
│
├── InvalidMarksException.java   # Custom exception class
├── Student.java                 # Student data and validation logic
├── ResultManager.java           # Main class with user interface
└── README.md                    # Project documentation
```

---

#### ⚙️ How to Run

**Option 1: Using Command Prompt**

```bash
cd C:\JavaProjects\StudentResultSystem
javac *.java
java ResultManager
```

**Option 2: Using VS Code or IntelliJ**

* Open the folder in your IDE.
* Run `ResultManager.java` (contains `main()` method).

---

#### 🧮 Sample Interaction

```
===== Student Result Management System =====
1. Add Student
2. Show Student Details
3. Exit
Enter your choice: 1
Enter Roll Number: 101
Enter Student Name: Alice
Enter marks for subject 1: 85
Enter marks for subject 2: 90
Enter marks for subject 3: 92
Student added successfully. Returning to main menu...
```

```
Enter your choice: 2
Enter Roll Number to search: 101
Roll Number: 101
Student Name: Alice
Marks: 85 90 92
Average: 89.0
Result: Pass
```

```
Enter your choice: 3
Exiting program. Thank you!
```

---

#### 🧰 Concepts Used

* **Exception Handling:** try-catch-finally
* **Custom Exception:** `InvalidMarksException`
* **Checked & Unchecked Exceptions**
* **OOP Principles:** Encapsulation, Modularity, Reusability

---

#### 👨‍💻 Developed By

**Name:** Pratyush Jha
**University:** K.R. Mangalam University
**Course:** BCA (AI & Data Science)
**Session:** 2025–26

