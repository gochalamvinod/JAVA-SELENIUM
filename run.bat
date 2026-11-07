@echo off
setlocal
cd /d "%~dp0test-instagram"
echo [JAVA-SELENIUM] Building and executing test-instagram project...
mvn compile exec:java
if %ERRORLEVEL% neq 0 (
    echo.
    echo [ERROR] Build or execution failed.
    echo Please ensure Maven (mvn) and Java JDK (javac) are installed and added to your PATH environment variable.
)
pause
