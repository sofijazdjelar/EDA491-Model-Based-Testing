# Automated Testing Tool: Cucumber
## Description 
[Cucumber](https://cucumber.io/) is an open source tool for creating automated acceptance tests. The purpose of this test is to evaluate a system’s compliance with its business requirements and determine whether it is acceptable for delivery. The tool was designed to support behavior-driven development (BDD) - an agile software development process that focuses on collaborative work among stakeholders. For instance, BDD involves using natural language and concrete examples to specify expected software behavior in a way that all stakeholders can understand. Cucumber uses a natural language parser called Gherkin to define executable test cases in a BDD style. Gherkin uses a set of keywords (e.g. Given, When and Then) to give structure and meaning to the test cases. Syntax is centered around a line-oriented design, i.e. the structure of a file is defined using whitespace and other control characters. Worth mentioning is that Gherkin has been translated to over 70 languages: The language chosen should be the language used by the stakeholders. 

## Usage example
```
Scenario: Emil wants to withdraw money from his bank account at an ATM
    Given Emil has a valid Credit or Debit card
    And his account balance is $1000
    When he inserts his card
    And withdraws $450
    Then the ATM should return $450
    And his account balance is $550
```
When Cucumber executes a Gherkin step in the scenario, it will look for a corresponding step definition (piece of code) to execute. If there is an error or exception in any line of code inside the step definition, Cucumber will mark that in the result output and then move on to execute the next step. In other words, Cucumber tests interact directly with the code but are written in a language that everyone can understand. 
Cucumber supports many different programming languages through various implementations. 
