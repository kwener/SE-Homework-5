
---

### `question11/README.md`
```markdown
# Question 11: Microservice Controller Logic

This module contains a simple `RideController` (no Spring) and JUnit 4 tests.

## Prerequisites

- Java 8+ JDK
- `curl`

## 1. Install JUnit 4 & Hamcrest

```bash
mkdir -p lib
curl -L -o lib/junit-4.13.2.jar      https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
curl -L -o lib/hamcrest-core-1.3.jar https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

## 1. Compile
rm -rf out && mkdir -p out

javac \
  -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar \
  -d out \
  src/RideRequest.java \
  src/RideController.java \
  test/LegacyRideControllerTest.java

## 2. Run Tests
java -cp out:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar \
     org.junit.runner.JUnitCore \
     LegacyRideControllerTest

Expected Output:
JUnit version 4.13.2
...
OK (3 tests)
