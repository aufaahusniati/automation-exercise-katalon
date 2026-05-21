# Web UI Automation Testing - Automation Exercise

This repository contains an end-to-end (E2E) automated testing suite for the **Automation Exercise** website. The project covers 26 comprehensive core e-commerce scenarios developed using **Katalon Studio**.

## 🚀 Key Scenarios Tested
* **User Management:** User registration, login/logout, and handling duplicate/existing email validations.
* **E-Commerce Flow:** Product searching, adding items to the cart, checkout process, and verifying session retention post-login.
* **UI/UX Interactions:** Verifying page scrolling functionality (Scroll Up/Down murn murni and via "Arrow" buttons).

## 🛠️ Tools & Environment
* **Automation Tool:** Katalon Studio v11.1.3
* **Browser:** Google Chrome
* **Scripting Language:** Groovy / Java
* **Operating System:** Windows 11

## 🧠 Challenges & Solutions (Debugging Highlights)
* **Google Ad Overlays:** * *Challenge:* Dynamic and aggressive full-screen ads often intercepted the robot's cursor, causing `ElementClickInterceptedException`.
  * *Solution:* Migrated standard `Click` actions to **`Enhanced Click`** (JavaScript-based clicking) to bypass transparent ad layers.

## 📊 Test Execution Results
* **Total Test Cases:** 26
* **Passed:** 26 (100% Success Rate)
* **Execution Mode:** Automated Test Suite (Sequential Execution)
