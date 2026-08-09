@echo off
cd /d "%~dp0"

echo.
echo ==============================
echo   Building and Running Java
echo ==============================
echo.

..\tools\apache-maven\bin\mvn.cmd compile exec:java

echo.
pause