# [Cucumber](http://cucumber.io)
Cucumber is an open source tool for creating automated acceptance tests. The tool was designed to support behavior-driven development (BDD) - an agile software development process that focuses on collaborative work among stakeholders. For instance, BDD involves using natural language and concrete examples to specify expected software behavior in a way that all stakeholders can understand. Cucumber uses a natural language parser called Gherkin to define executable test cases in a BDD style. **Testing Approach:** Behavior-driven testing. **Testing Level:** Acceptance testing. **Target Application Domain:** ???.

## Features
* Gherkin: 
* CucumberStudio: A testing platform that allows the team to co-design acceptance tests. It provides a real-time environment for designing, executing, automating and refactoring tests. The platform is intended to be used by everyone in a software delivery team, i.e. customers, product managers, testers and developers.
* Cucumber for Jira: 
* Built in documentation: The specifications provide not only executable test cases, but also a description of what the system actually does in a language that everyone working on the project can understand.

## Pros
* Acts as a bridge between business and technical people. 
* Allows test cases to be written without knowledge of any code (allows the involvement of non-programmers).
* Supports many different programming languages and software platforms. 

## Cons
* Con

## Required information / models
Using a set of keywords (e.g. Given, When and Then), the user specifies expected software behavior (derived from business requirements) in a so-called Feature File. The specifications consist of multiple examples, or scenarios. Each scenario is a list of steps for Cucumber to work through. When Cucumber executes a Gherkin step, it will look for a corresponding piece of code to execute in the Step Definition file. If there is an error or exception in any line of code inside the step definition, Cucumber will mark that in the result output and then move on to execute the next step. 

## Target platform and dependencies
Cucumber is written in Ruby and the tool is confirmed to work on Windows, OSX and Linux. Moreover, Cucumber supports many different programming languages (including Java, JavaScript, PHP, Net, Python and Perl) and almost all popular software platforms. 

## Updates
**Latest update:** March 17, 2020.
**First release date:** July 25, 2009.

## Licensing / Cost
MIT License / Free (not including CucumberStudio and Cucumber for Jira).

## Tutorials and documentation
* Documentation: The official documentation is available 
[here](http://lcamtuf.coredump.cx/afl/QuickStartGuide.txt)

## Usage examples
```
Scenario: Emil wants to withdraw money from his bank account at an ATM
    Given Emil has a valid Credit or Debit card
    And his account balance is $1000
    When he inserts his card
    And withdraws $450
    Then the ATM should return $450
    And his account balance is $550
```
## Alternative tools

