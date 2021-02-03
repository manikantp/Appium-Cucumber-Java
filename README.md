<h1>Appium-Cucumber-Java</h1>

<h2>This repository contains working code for automating mobile apps using BDD(Cucumber)</h2>
This is a Maven Project with TestNG

<h4>Pre-requisites</h4>
* Appium should be setup into the machine

<h3>Dependencies</h3>
* Appium Server
* IntelliJ IDEA IDE or Eclipse
* Android Device (Support for iOS will be added soon)

<h4>Maven Dependencies</h4>
* cucumber-java (info.cukes)
* java-client (io.appium)
* testng (org.testng)
* cucumber-core (info.cukes) # cucumber-core and cucumber-java should belong from same group-id
* cucumber-html (info.cukes)
* cucumber-testng (info.cukes)
* selenium-server (org.seleniumhq.selenium)
* gherkin (info.cukes)
* hamcrest-all (org.hamcrest)
* log4j (log4j)
* cucumber-jvm-deps (info.cukes)
* allure-maven (io.qameta.allure)

‍<h2>💻 Steps:</h2>
1. Clone the repository via link *git clone https://github.com/manikantp/Appium-Cucumber-Java.git*.
2. Open the project in the IDE. (**I picked IntelliJ IDE**)
3. Let the IDE resolve the dependencies in the *pom.xml* file in the project.
4. Under `src/test/java/utility` there is a java class named as **Hook.java**, set the device name and the apk path.
5. Under `src/test/java/runner` there is a java class named as *RunTests.java*, open the class and right-click. Click on *Run **"RunTests"*** 

<h4>📈 Results</h4>
Results can be seen under `target/cucumber/index.html`

<h2>🌱 *Currently In Progress*</h2>
* Executing Mobile-web applications with Cucumber and Java
* Integrating with different types of reports