# Question 5 – Strategy Pattern

This module demonstrates the **Strategy Design Pattern** for a dynamic pricing system. Based on demand, it selects either `RegularPricingStrategy` or `SurgePricingStrategy`.

---

## 📁 Structure

- `PricingStrategy.java`: Strategy interface
- `RegularPricingStrategy.java`: Returns flat base price
- `SurgePricingStrategy.java`: Increases price based on demand
- `PricingContext.java`: Context class that chooses which strategy to apply
- `PricingContextTest.java`: Unit tests to validate pricing logic

---

## 🚀 How to Run the Code

There is no `main()` method in this module, since it's meant to be **tested** rather than executed directly.

---

## ✅ How to Run the Tests

You can run tests in two ways:

### 🧪 Option 1: Using IntelliJ

- Navigate to `src/test/java/com/example/question5/PricingContextTest.java`
- Right-click the file and choose **Run 'PricingContextTest'**

### 🧪 Option 2: Using Gradle

From the root directory of the project:

    ```bash
    ./gradlew :question5:test