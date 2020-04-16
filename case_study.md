## Part 2: Find a software/lib that uses the testing tool
PayPal has used Cucumber for business-driven development. 

**Q2.1. What is the purpose of the sw/lib, i.e. what does it aim to do for users/developers?**\
PayPal is an online payments system that supports online money transfers. 

**Q2.2. What are the key technologies used to develop the lib?**  
PayPal was developed using many different programming languages. However, key languages seem to be C++, Java, JavaScript (as Node.js) and Python. 

**Q2.3. What kind of automated testing tools are used to test the sw/lib (including but possible more than YTT) and what are their key features?**

PayPal uses the automated testing tools Selenium and TestNG. Moreover, they have developed automated testing tools of their own that utilizes Selenium and/or TestNG: 
- [Nemojs](https://nemo.js.org/): PayPal’s own open source Node.js automation framework. More specifically, Nemojs provides a way to add Selenium automation to NodeJS web projects.
- [SeLion](http://paypal.github.io/SeLion/html/documentation.html#what-is-selion): Enables Test Automation in Java. The tool uses TestNG and Selenium to provide a set of capabilities that get you up and running with Selenium WebDriver in a short time. It can be used for testing web and mobile applications.

**Q2.4. Which features of the automated testing tools are currently used by the test suite?**\ 
As mentioned above, they use different automated testing tools and only refer to a few features used by the test suite. Some references of the features are the following: From Selenium they use WebDriver (for both Nemojs and SeLion) and from TestNG they use a set of compatible data providers which allow you to access test data from Excel, YAML, JSON, and XML (for SeLion).

**Q2.5. Which features of the automated testing tools are NOT used by the test suite?**\ 
They do not explicitly refer to the features not used by the test suite. One cannot assume that a feature not mentioned is a feature not used. 

## Part 3: Interview developers/testers of YTT\
I reached out to the founder of Cucumber - Aslak Hellesøy. He is currently working as Cucumber Open Source Lead at SmartBear which acquired Cucumber in 2019. 

**Q3.1. What was your reasons for developing Cucumber? Which situations is it good for and less good for?**\
>"I created Cucumber around 2008 because I had a strong belief that the traditional way to specify software requirements was fundamentally broken. I had seen too many programmers writing software based on ambiguous and imprecise requirements documents that were handed to them by someone they had never spoken to. This led to a lot of rework and delays because the requirements were misunderstood.
>
>Cucumber changed all that. It allows cross-functional teams to specify software requirements in a precise and unambiguous way using concrete examples. These examples are also executable, and programmers would use them as a guide while they were programming.
>
>It wasn’t until a few years later (2011) when testers discovered the tool that it became known as a testing tool. I never wanted to create a testing tool – I created a specification tool.
>
>Cucumber Is great for capturing the understanding of a diverse group of people (business, programmer, user, UX, tester) and make requirements unambiguous and precise. It’s a great companion for programmers who want constant fast feedback on their programming.
>
>It does a decent (but not great) job as a testing tool. I usually reach for other tools when I want to test existing software."

**Q3.2 How mature do you thinnk Cucumber is? Is it suitable for use by companies developing real-world software at scale? Why / why not?**\ 
>"Very mature. It’s been around for over a decade, it’s used by an estimated 1M people and is very popular in fortune 500 companies."

**Q3.3. How do you plan to evolve and develop Cucumber going forward? What are the main improvements needed to take the tool to the next level?**\ 
>"In the short term we’re improving reporting, using a new protocol for reporting results.
>
>In the mid term we’re using the same protocol to build tooling that will make it easier to integrate Cucumber with other systems such as specification tools, issue trackers, CI servers etc.
>
>In the longer term we plan to extend Cucumber to support other formats than Gherkin. This will most likely by Markdown and Excel."
