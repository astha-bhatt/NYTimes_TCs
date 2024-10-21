# NYTimes_TCs

# NY Times assignment

---

**Prerequisites**

Java Development Kit (JDK) 8 or higher

Apache Maven

Selenium WebDriver

Eclipse or any other IDE

Cucumber plugin

**Features**

- Cross-Browser Testing: Supports Chrome, Firefox, Safari, and Edge.

- Data-Driven Testing: Ability to read test data from external sources (CSV/Excel).

- Explicit Waits: Implements explicit waits to ensure elements are loaded before interaction.

- Reusable Utility Methods: Contains utility methods for common functionalities.

- Clean Code Structure: Adheres to OOPs.

---


**Setup Instructions**

- Clone the repository:

	'''bash
	git clone<https://github.com/astha-bhatt/NYTimes_TCs.git>


- Configure WebDriver:

 Ensure you have the appropriate WebDriver executables (e.g., chromedriver, geckodriver, edgedriver) in your system's PATH

- Install Maven dependencies:

 Navigate to the project directory and run:

 mvn clean install

**Configure Browser Settings:**

Browser to be used can be specified in the src/test/resources/browser-config.properties file.

**To run all tests:**

 mvn test

**Path For important files :-**

- configuration.properties : /nytimes-sample/src/test/resources/browser-config.properties

- excel test data file : /nytimes-sample/src/test/resources/TestData.xlsx

**Running Tests on different browser**
  
- \src\test\resources\browser-config.properties

- Change the browser type to below in the above mentioned config file for running on different browser:

- Chrome(Currently set)
- Edge
- Firefox


**Test Case Information :-**

- OtherSection Test Case : Verify user clicks on Games link in another section

- Search Test Case : verify user is able to search with a keyword on NY Times 

- Sign Up : Verify sign up functionality with invalid email, verify sign up functionality with valid email and incorrect password

- Today's Paper : Verify user routes to Today's Paper page.

**Project Structure**

- src: Source code for test scripts, this package consists of below given structure.

- src/main/java: Consists of all the packages of browser handling, Core Functions which can be reused, Object repository, utils.

- src/main/resources

- src/test/java: Application Hooks file, TestRunner file, Test classes (having Step Definitions), test utils, Feature Files (having the test cases).

- src/test/resources: Test Data ,  Config files.

- test-output: Directory containing test output results

- .gitignore: Git ignore file.

- pom.xml: Maven project file for managing dependencies.
