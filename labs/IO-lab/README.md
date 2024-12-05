# **Library Management System - NIO File Handling with BufferedReader and BufferedWriter Lab**

## **Objective**  
In this lab, you will enhance your **Library Management System** by implementing file handling using **Java NIO** (Non-blocking I/O) with **BufferedReader** and **BufferedWriter**. This will allow the system to efficiently read from and write to files, preserving book and user data, including borrow dates and due dates.

---

## **Instructions**

### **1. Setup File Paths**
- **Define file paths** for storing book data:
  - Create a `Path` object named `booksFilePath` for the books' data file (e.g., `library_books.txt`).
  - Ensure the file exists before reading or writing by checking with `Files.exists()` and creating it if necessary.

---

### **2. Save Book Data to File**
- **Create a method `saveBooksToFile()`**:
  - Use **BufferedWriter** from `Files.newBufferedWriter()` to write book data to the file.
  - Serialize the following details for each book:
    - Title
    - Author
    - Number of pages
    - Best seller status (`true`/`false`)
    - Availability (`true`/`false`)
    - Borrow date (if applicable)
    - Due date (if applicable)
    - Return date (if applicable)
  - Ensure each book is written on a new line in a comma-separated format.
  - Handle `IOException` gracefully and display an error message if writing fails.


### **3. Read And Write to the file**:
  - This application should read and write to a file
  - When the application runs it should load all the data from a file
  - When the application is shut down it should use the `saveBooksToFile()` to write to the file.

**Example format:**
```plaintext
The Great Gatsby,F. Scott Fitzgerald,180,true,false,2024-12-01,2024-12-15,null
