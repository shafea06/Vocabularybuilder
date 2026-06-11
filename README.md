# Vocabulary Builder 📖

A simple, interactive, and lightweight desktop application designed to help learners build their personal English dictionary. Tailored for school students, university students, and individuals preparing for English proficiency exams (such as TOEFL and IELTS).

## 🎥 Project Demo (Video)

**Watch the full project demonstration and code explanation here:**
!Watch the video(https://youtu.be/s98Ywh2mmzI)

*(Click the badge above to watch the video on YouTube)*

---

## 🚀 Features

* **Secure Authentication:** User registration and login system with SHA-256 password hashing.
* **Full CRUD Operations:** Add, View, Update (memorization status), and Delete vocabulary entries easily.
* **Smart Quiz Mode:** An interactive flashcard-style quiz system that filters unmemorized words and randomizes them for effective learning.
* **Offline Reliability:** All user and vocabulary data is stored locally via robust File I/O operations (`users_data.txt` and `vocabulary_data.txt`), ensuring the app works 100% offline.
* **Dynamic Data Table:** View all words in an organized table with sorting capabilities (A-Z, Z-A, Recently Added).
* **Clean UI:** A user-friendly, modern graphical interface built with Java Swing.

## 🛠️ Tech Stack

* **Language:** Java (JDK 8+)
* **GUI Framework:** Java Swing
* **Data Storage:** Local Text Files (Flat-file database)
* **Security:** `java.security.MessageDigest` (SHA-256 Cryptography)

## 📁 Project Structure

* `JFrameLogin.java`: Handles user authentication, registration, and secure password hashing.
* `JFrameDashboard.java`: The core dashboard managing the vocabulary table, sorting, and CRUD operations.
* `JframeQuiz.java`: The interactive learning module for testing unmemorized vocabulary.

## ⚙️ How to Run

1. Clone this repository to your local machine:
   ```bash
   git clone (https://github.com/shafea06/Vocabularybuilder/blob/main/README.mdس)