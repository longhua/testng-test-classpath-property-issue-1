This repository is just for demonstrating a `testng.test.classpath` property issue.

#### Issue

The following is the explanation of `testng.test.classpath` from [TestNG document](http://testng.org/doc/documentation-main.html#running-testng).
> If this property is set, TestNG will use it to look for your test classes instead of the class path. This is convenient if you are using the package tag in your XML file and you have a lot of classes in your classpath, most of them not being test classes.

However, it doesn't search the directory specified in testng.test.classpath during runtime. So no test cases are run.


#### Steps to reproduce

1. Add all TestNG required JAR's to CLASSPATH.
2. Compile the test classes: `javac src/test/*.java -d out`
3. Run the test: `java -cp $CLASSPATH:out org.testng.TestNG testng.xml`
4. Rerun the test with `testng.test.classpath` property: `java -Dtestng.test.classpath="out/" org.testng.TestNG testng.xml`


Observation: Four tests are run in Step 3. However, no tests are run in Step 4.


