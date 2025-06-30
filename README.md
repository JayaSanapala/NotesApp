# # NotesApp 

A simple text-based notes manager written in Java using File I/O.  
This application allows you to write and read notes directly from the console. All notes are stored in a local text file.

---

##  Features

- Add new notes
- View all saved notes
- Notes are saved to a file (`notes.txt`) using `FileWriter`
- Notes are read from the file using `BufferedReader`

---

##  Technologies Used

- Java (Standard Edition)
- File I/O (`FileWriter`, `FileReader`, `BufferedReader`)
- Command-line interface
- Eclipse IDE (optional)

---

##  Getting Started

### Prerequisites

- Java JDK 8 or above
- Git (optional)
- Eclipse IDE or any Java IDE
- Terminal / Command Prompt

---

###  Clone the Repository

```bash
git clone https://github.com/JayaSanapala/NotesApp.git
cd NotesApp

=== Notes App ===

1. Write Note
2. View Notes
3. Exit
Choose option: 1
Enter your note: Complete Java assignment
Note saved.

Choose option: 2
--- Your Notes ---
- Complete Java assignment

## File Structure
NotesApp/
│
├── NotesApp.java        # Main application file
├── notes.txt            # File where notes are stored
└── README.md            # Project documentation

