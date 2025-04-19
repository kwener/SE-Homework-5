
---

### `question12/README.md`
```markdown
# Question 12: MVC Model & Controller

This module implements the MVC pattern’s Model and Controller and includes JUnit 4 tests.

## Prerequisites

- Java 8+ JDK
- `curl`

## 1. Install JUnit 4 & Hamcrest

```bash
mkdir -p lib
curl -L -o lib/junit-4.13.2.jar      https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
curl -L -o lib/hamcrest-core-1.3.jar https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

## 2. Compile
rm -rf out && mkdir -p out

javac \
  -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar \
  -d out \
  src/RideModel.java \
  src/RideController.java \
  test/RideModelControllerTest.java


## 3. Run 
java -cp out:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar \
     org.junit.runner.JUnitCore \
     RideModelControllerTest

You should see: 
JUnit version 4.13.2
....
OK (4 tests)
