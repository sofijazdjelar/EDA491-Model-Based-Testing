## Part 2: Find a software/lib that uses the testing tool
PayPal has used Cucumber for business-driven development. 

**Q2.1. What is the purpose of the sw/lib, i.e. what does it aim to do for users/developers?**\
PayPal is an online payments system that supports online money transfers. 

**Q2.2. What are the key technologies used to develop the lib?**   
PayPal was developed using many different programming languages. However, key languages seem to be C++, Java, JavaScript (as Node.js) and Python. 

**Q2.3. What kind of automated testing tools are used to test the sw/lib (including but possible more than YTT) and what are their key features?** PayPal uses the automated testing tools Selenium and TestNG. Moreover, they have developed automated testing tools of their own that utilizes Selenium and/or TestNG: 
- [Nemojs](https://nemo.js.org/): PayPal’s own open source Node.js automation framework. More specifically, Nemojs provides a way to add Selenium automation to NodeJS web projects.
- [SeLion](http://paypal.github.io/SeLion/html/documentation.html#what-is-selion): Enables Test Automation in Java. The tool uses TestNG and Selenium to provide a set of capabilities that get you up and running with Selenium WebDriver in a short time. It can be used for testing web and mobile applications.

**Q2.4. Which features of the automated testing tools are currently used by the test suite?** As mentioned above, they use different automated testing tools and only refer to a few features used by the test suite. Some references of the features are the following: From Selenium they use WebDriver (for both Nemojs and SeLion) and from TestNG they use a set of compatible data providers which allow you to access test data from Excel, YAML, JSON, and XML (for SeLion).

**Q2.5. Which features of the automated testing tools are NOT used by the test suite?** They do not explicitly refer to the features not used by the test suite. One cannot assume that a feature not mentioned is a feature not used. 

## Part 3: Interview developers/testers of YTT

**Q3.1. Reach out to the developers of YTT and ask them about their reasons for developing YTT. Why this particular type of testing technology? Which situations isit good for and less good for?** 

**Q3.2 Ask them how mature they think YTT is? Is it suitable for use by companiesdeveloping real-world software at scale? Why / why not?** Waiting for an answer. I sent an email to research_requests@mozilla.com :email:

**Q3.3. Ask them how they plan to evolve and develop YTT going forward. What are the main improvements needed to take the tool to the next level?** Waiting for an answer. I sent an email to research_requests@mozilla.com :email:
