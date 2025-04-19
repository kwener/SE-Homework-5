# Question 4 – Adapter Pattern

This module demonstrates the **Adapter Design Pattern** using a `PayPalAdapter` class that allows a legacy `PayPalPayment` system to conform to the `PaymentProcessor` interface.

---

## 📁 Structure

- `PaymentProcessor.java`: Interface for processing payments
- `PayPalPayment.java`: Legacy class simulating a third-party payment API
- `PayPalAdapter.java`: Adapter that bridges `PayPalPayment` to `PaymentProcessor`
- `PaymentSystem.java`: Main class to demonstrate the adapter in action
- `PayPalAdapterTest.java`: Unit test using Mockito to validate adapter logic

---

## 🚀 How to Run the Code

1. Open a terminal at the root of the project.
2. Run the `main()` method from `PaymentSystem`:

**From IntelliJ:**
- Navigate to `src/main/java/com/example/question4/PaymentSystem.java`
- Right-click the file and choose **Run 'PaymentSystem.main()'**

You should see:

Payment of $23.5 processed through PayPal.

---

## ✅ How to Run the Tests

You can run tests in two ways:

### 🧪 Option 1: Using IntelliJ
- Right-click the `PayPalAdapterTest.java` file
- Choose **Run 'PayPalAdapterTest'**

### 🧪 Option 2: Using Gradle
In terminal from root directory:

    ```bash
    ./gradlew :question4:test

Test output should show BUILD SUCCESSFUL.

## 🧰 Requirements

Java 17

Gradle 8.x
JUnit 5
Mockito

