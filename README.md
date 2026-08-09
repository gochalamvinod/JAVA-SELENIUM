# JAVA-SELENIUM

A Java + Selenium automation project focused on exploring browser-based automation for Instagram activity and history management.

---

## 📌 About the Project

Instagram does not provide a direct built-in feature that allows users to automatically manage certain activity histories through a user-created script or public API.

This project was created to explore whether some of these processes could be automated through **Java + Selenium browser automation**.

The current areas of experimentation include:

* **Watch History**
* **Like History**
* **Comment History**
* Other Instagram activity-management workflows

The primary purpose of this project is **learning, experimentation, and automation research**.

---

## 🚀 Features

* 🌐 Browser automation using **Selenium WebDriver**
* ☕ Written in **Java**
* 🤖 Automated interaction with Instagram through a web browser
* 🔍 Exploration of automated Instagram activity management
* ⚙️ Automatic compilation and execution using `run.bat`
* 🧪 Experimental Selenium automation workflows
* 📁 Simple project structure for adding future experiments

> ⚠️ **Note:** Features are currently under development and may change as the project progresses.

---

## 🛠️ Technologies Used

| Technology                          | Purpose                             |
| ----------------------------------- | ----------------------------------- |
| **Java**                            | Main programming language           |
| **Selenium WebDriver**              | Browser automation                  |
| **Google Chrome**                   | Browser used for automation         |
| **ChromeDriver / Selenium Manager** | Browser control                     |
| **Maven**                           | Project and dependency management   |
| **Windows Batch (`.bat`)**          | Automatic compilation and execution |

---

## 📚 References & Learning Resources

### ChatGPT & Claude

During the initial stages of this project, **ChatGPT** and **Claude** were used as development assistants.

They helped with:

* Initial Java/Selenium environment setup
* Understanding Selenium concepts
* Debugging compilation issues
* Developing initial automation workflows
* Improving project structure

They were primarily used as development assistance while learning and experimenting with Selenium.

### Selenium Reference PDF

A **Selenium reference PDF** is included in this repository.

It was used as a learning resource while exploring:

* Selenium WebDriver
* Browser interaction
* Element selection
* XPath
* Web automation
* Selenium APIs

The PDF is located within the repository.

---

## ⚙️ Setup

### 1. Install Java

Install the **Java Development Kit (JDK)**.

Verify the installation:

```bash
java -version
```

```bash
javac -version
```

---

### 2. Install Google Chrome

Install **Google Chrome** on your system.

The project uses Chrome as the browser controlled by Selenium.

---

### 3. Clone the Repository

Clone the repository using Git:

```bash
git clone https://github.com/gochalamvinod/JAVA-SELENIUM.git
```

Navigate into the project:

```bash
cd JAVA-SELENIUM
```

---

### 4. Configure the Project

If the project uses Maven, make sure Maven is installed and available on your system.

Verify Maven:

```bash
mvn -version
```

Maven will automatically download the required dependencies defined in `pom.xml`.

---

## ▶️ Running the Project

A `run.bat` file is included to simplify compiling and running the Java program.

Instead of manually compiling the project, you can run:

```text
run.bat
```

### Windows

You can either:

**Option 1 — Double-click**

Open the project folder and double-click:

```text
run.bat
```

**Option 2 — PowerShell**

Run:

```powershell
.\run.bat
```

The batch file automatically handles the project build and execution.

### What `run.bat` Does

The script is intended to:

1. Build the Java project.
2. Compile the source code.
3. Resolve required Maven dependencies.
4. Run the compiled Java application.

This provides a convenient way to start the project without manually entering the build and execution commands.

---

## 🔬 Project Status

**Status: 🧪 Experimental / Under Development**

This project is currently an experiment to understand what can and cannot be automated through Selenium when interacting with Instagram.

The implementation is still evolving, and functionality may change as new experiments are added.

> **More updates coming soon. @Thinking**

---

## ⚠️ Disclaimer

This project is provided **for educational and research purposes only**.

It is **not affiliated with, endorsed by, or officially supported by Instagram or Meta**.

Automating interactions with third-party websites may be restricted by their terms of service, policies, or technical limitations.

Users are responsible for understanding and complying with the applicable rules and policies of the services they interact with.

Use this project responsibly and only with accounts and environments that you are authorized to automate.

---

## 🎯 Learning Objectives

The main purpose of this project is to learn and experiment with:

* ☕ Java programming
* 🌐 Selenium WebDriver
* 🤖 Browser automation
* 🔎 XPath and element selection
* 🖱️ Web interaction
* 🔄 Automation workflows
* 📦 Maven project management
* 🛠️ Java compilation and execution
* 🪟 Windows batch scripting
* 🐛 Debugging Selenium applications
* 🔬 Understanding the limitations of browser-based automation

---

## 🙏 Acknowledgements

* **Selenium** — Browser automation framework
* **ChatGPT** — Assistance with initial environment setup, Selenium concepts, debugging, and development
* **Claude** — Assistance with initial environment setup, Selenium concepts, debugging, and development
* **Selenium Reference PDF** — Learning and reference material included in this repository

---

## 🔮 Future Development

Possible future improvements include:

* Improved automation workflows
* Better error handling
* More reliable element detection
* Cleaner project structure
* Additional Selenium experiments
* Improved browser interaction
* More robust automation
* Additional documentation
* Further investigation into automated Instagram activity management

---

## 📌 Project Philosophy

This repository is primarily a **learning and experimentation project**.

The goal is not only to build automation, but also to understand:

> **What can be automated, how it can be automated, and where browser automation reaches its limitations.**

**More coming soon. 🚀**
