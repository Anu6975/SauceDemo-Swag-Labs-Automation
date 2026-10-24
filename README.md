# 🛒 SauceDemo | E-Commerce Test Automation Framework

<p align="center">
  <img src="https://img.shields.io/badge/Automation-Selenium%20WebDriver-43B02A?style=for-the-badge&logo=selenium&logoColor=white" alt="Selenium WebDriver"/>
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Testing-TestNG-DC382D?style=for-the-badge" alt="TestNG"/>
  <img src="https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven"/>
</p>

<p align="center">
  <b>Turning real user journeys into reliable automated tests.</b>
  <br/>
  A UI automation project focused on validating essential e-commerce workflows using Selenium WebDriver, Java, TestNG, and the Page Object Model.
</p>

---

## ✨ About the Project

An e-commerce website can look perfect and still fail where it matters most: logging in, displaying products correctly, updating the cart, or completing an order.

This project automates key user journeys on **[SauceDemo](https://www.saucedemo.com/)** to validate the behavior of an online shopping application.

The goal is simple: go beyond clicking buttons and verify that the application behaves as expected.

## 🎯 What Does This Framework Test?

| Module | Test Coverage |
|---|---|
| 🔐 Authentication | Valid login, locked-out user, and login outcome validation |
| 🛍️ Product Listing | Product sorting in ascending and descending alphabetical order |
| 🛒 Shopping Cart | Adding products, removing products, and validating cart badge counts |
| 💳 Checkout | Entering customer details, continuing checkout, and completing an order |
| ✅ Order Confirmation | Verifying the successful order confirmation message |

## 🧰 Tech Stack

| Technology | Purpose |
|---|---|
| Java | Programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test execution and assertions |
| Maven | Dependency and build management |
| Page Object Model (POM) | Separating page interactions from test logic |
| Chrome | Browser under test |
| Git & GitHub | Version control and project hosting |

## 🏗️ Framework Architecture

The framework follows the Page Object Model (POM), keeping page-specific interactions separate from test scenarios.

```text
SauceDemo-Automation/
│
├── src/
│   └── test/
│       └── java/
│           ├── Base/
│           │   └── BaseTest.java
│           │
│           ├── Page/
│           │   ├── Login_Page.java
│           │   ├── OpenMenu_Page.java
│           │   ├── Products_Page.java
│           │   └── Cart_Page.java
│           │
│           ├── tests/
│           │   ├── Login_tests.java
│           │   ├── Products_tests.java
│           │   └── PlaceOrder_tests.java
│           │
│           └── utilities/
│               └── Waits.java
│
├── pom.xml
├── README.md
└── .gitignore
```

*The structure above describes the intended project organization. Only include files that are actually present in your repository.*

### Why POM?

- **Maintainability:** Page locators and interactions stay in dedicated classes.
- **Reusability:** Common actions can be reused across test scenarios.
- **Readability:** Test classes focus on workflows and expected outcomes.
- **Scalability:** Additional test scenarios can be added without duplicating every interaction.

## 🧪 Automated Test Scenarios

### 1. Authentication Testing
- Log in using valid credentials.
- Verify that a locked-out user cannot access the inventory page.
- Validate login outcomes using TestNG assertions and a data provider.

### 2. Product Sorting
- Select *Name (A to Z)*.
- Verify the displayed product names are alphabetically sorted.
- Select *Name (Z to A)*.
- Verify the reverse alphabetical order.

### 3. Shopping Cart Validation
- Add products to the cart.
- Verify the cart badge count.
- Remove products from the cart.
- Verify that the badge disappears when the cart becomes empty.

### 4. End-to-End Checkout
- Log in to the application.
- Add a product to the cart.
- Open the cart and initiate checkout.
- Enter customer information.
- Continue to the checkout overview.
- Finish the order.
- Verify the **"Thank you for your order!"** confirmation.

## ⚙️ Getting Started

### Prerequisites

Before running the tests, ensure you have:

- Java JDK installed and configured.
- Maven installed, or Maven support enabled in your IDE.
- Google Chrome installed.
- An IDE such as Eclipse or IntelliJ IDEA.
- An internet connection to access SauceDemo and resolve dependencies.

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
```

Replace the URL with your actual GitHub repository URL.

**2. Open the project**

Import the downloaded project into your IDE as an existing Maven project.

**3. Resolve Maven dependencies**

```bash
mvn clean test-compile
```

**4. Execute the tests**

Run the desired TestNG test classes from your IDE, or configure a TestNG suite to execute them together.

If you use Maven to execute the complete suite, ensure the TestNG tests are configured to be discovered or included through your project's Maven configuration.

## 📊 Test Execution & Validation

The framework uses TestNG assertions to verify expected outcomes rather than relying only on successful clicks.

Examples of validation include:

- Checking whether login reaches the inventory page.
- Comparing actual product order against expected alphabetical order.
- Verifying cart badge counts after add/remove operations.
- Checking cart contents and the final order confirmation message.

Test results can be reviewed in the TestNG results view in your IDE. Additional reporting can be integrated as the framework evolves.

## 🔮 Future Enhancements

Potential improvements for future iterations include:

- Replacing remaining fixed waits with explicit waits.
- Adding more negative and boundary-value test scenarios.
- Introducing centralized configuration for browser and test data.
- Adding screenshots on test failures.
- Integrating automated execution into a CI/CD pipeline.
- Generating richer HTML test reports.

## 👩‍💻 What This Project Demonstrates

This project showcases practical skills in:

- UI automation with Selenium WebDriver.
- Java-based test development.
- TestNG assertions and data-driven testing.
- Page Object Model implementation.
- E-commerce workflow validation.
- Functional and negative testing.
- Organizing automation code for maintainability.

## ⚠️ Disclaimer

This is an educational automation project using the publicly available SauceDemo demonstration website. It is intended for learning and testing practice, not for commercial use.

---

<p align="center">
  <b>Test the journey. Validate the behavior. Trust the evidence. 🚀</b>
  <br/>
  <sub>Built with curiosity, Java, Selenium, and a tester's mindset.</sub>
</p>
