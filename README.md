# JAVA-SELENIUM

A Java + Selenium automation project focused on exploring browser-based automation for Instagram activity and history management.

---

## 📦 Third-Party Code & Provenance

- **`undetectedselenium/`**: This directory is a vendored third-party open-source library created by **bramar**, distributed under its own license (`undetectedselenium/LICENSE`). It is included as a vendored dependency and is **not my original work**.
- **User-Authored Code**: The only code written by me in this repository is [`test-instagram/src/main/java/Main.java`](test-instagram/src/main/java/Main.java) (~127 lines). This script is a proof-of-concept experiment that utilizes hardcoded absolute XPaths and is brittle by design.

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

> ⚠️ **Note:** Features are currently experimental and educational only.

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

## ⚙️ Setup

### 1. Install Java

Install the **Java Development Kit (JDK)**.

Verify the installation:

```bash
java -version
javac -version
```

PowerShell:
```powershell
java -version
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
cd JAVA-SELENIUM
```

PowerShell:
```powershell
git clone https://github.com/gochalamvinod/JAVA-SELENIUM.git
Set-Location JAVA-SELENIUM
```

---

### 4. Configure the Project

Ensure Maven is installed and available on your system:

```bash
mvn -version
```

Maven will automatically download the required dependencies defined in `pom.xml`.

---

## ▶️ Running the Project

A `run.bat` file is included to simplify compiling and running the Java program on Windows.

### Windows (cmd / PowerShell)
```powershell
.\run.bat
```

---

## 🔬 Project Status

**Status: 🧪 Experimental / Educational Archive**

This project is an exploratory experiment to understand browser automation limitations when interacting with dynamic single-page web applications.

---

## ⚠️ Disclaimer & Terms of Service Notice

This project is provided **strictly for educational and research purposes only**.

- It is **not affiliated with, endorsed by, or officially supported by Instagram or Meta**.
- **Terms of Service:** Automating Instagram interactions, scraping content, or automating clicks via unofficial tools **violates Instagram's Terms of Service and Platform Policies**. Doing so may result in rate-limiting, temporary account blocks, CAPTCHA challenges, or permanent account termination.
- Users are solely responsible for understanding and complying with the applicable policies and terms of service of third-party platforms.
- The author does not endorse or promote automating accounts or bypassing terms of service.

---

## 🎯 Learning Objectives

The main purpose of this project was learning and experimenting with:

* ☕ Java programming
* 🌐 Selenium WebDriver
* 🤖 Browser automation APIs
* 🔎 XPath and element selection limitations
* 📦 Maven build configuration
* 🪟 Windows batch scripting
* 🔬 Understanding the fragility of absolute XPaths on dynamic modern web apps

---

## 🙏 Acknowledgements

* **Selenium** — Browser automation framework
* **bramar/undetected-chromedriver** — Vendored Java port of undetected-chromedriver
* **ChatGPT & Claude** — Assistance with initial Java environment setup and learning Selenium concepts

---

## 📜 License
See [`undetectedselenium/LICENSE`](undetectedselenium/LICENSE) for the vendored undetectedselenium library license.
The educational test script `test-instagram/` is provided under the MIT License.
