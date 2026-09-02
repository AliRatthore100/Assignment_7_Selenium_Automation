# Assignment No. 7 – Selenium Automation
## Overview
Java + Selenium WebDriver + TestNG + Maven framework using Page Object Model.

## Application Under Test
**SauceDemo:** https://www.saucedemo.com/
The assignment does not specify a target application, so this stable public e-commerce demo is used.

## Demo Credentials
Username: `standard_user`
Password: `secret_sauce`

## Project Structure
```text
Assignment_7_Selenium_Automation/
├── src/test/java/
│   ├── base/BaseTest.java
│   ├── pages/LoginPage.java
│   ├── pages/HomePage.java
│   ├── pages/ProductPage.java
│   ├── tests/LoginTests.java
│   ├── tests/ProductTests.java
│   └── utils/ElementUtils.java
├── docs/TEST_CASES.md
├── docs/ASSIGNMENT_MAPPING.md
├── pom.xml
├── testng.xml
├── .gitignore
└── README.md
```

## Requirements Covered
- Selenium project setup
- Invalid login test
- Successful login test
- Homepage validation
- Product navigation
- Product name, price, description and availability validation
- Reusable utility/custom commands
- Page Object Model
- TestNG assertions and execution
- Maven dependency management

## Prerequisites
JDK 17+, Maven and Google Chrome.

## Run
```bash
mvn clean test
```
Results: `target/surefire-reports/`

Modern Selenium uses Selenium Manager to obtain the correct browser driver automatically, so manual ChromeDriver configuration is normally unnecessary.

## Git Submission
```bash
git init
git add .
git commit -m "Assignment 7 Selenium Automation"
git branch -M main
git remote add origin YOUR_GITHUB_REPOSITORY_URL
git push -u origin main
```

Submit the GitHub repository link.

## Note
Because no target website was supplied in the assignment, SauceDemo is the chosen application. If your instructor gave a different URL, keep this framework and replace the page locators/workflows with that application's UI.
