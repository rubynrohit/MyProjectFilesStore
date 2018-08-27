#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Google Dot Com
  I want to use this template for my feature file
//COMMITING
  Scenario Outline: Test Google Homepage
    Given URL and Valid Credentials
    When I enter the given credntials "<username>" and "<password>"
    When Click on login button
    Then I should be navigated to homepage

    Examples: 
      | username      | password        |
      | abc@gmail.com | rubbynrohit     |
      | def@gmail.com | sidhantbhandari |
