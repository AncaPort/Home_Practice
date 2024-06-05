Feature: cv library core function criteria
  As a user I would like to check functionaliy of homepage.

  Background: I should able to see homepage
    Given     I enter Url "http:/cvlibrary.co.uk
    Then      I am able to see home page

  Scenario: I am on user login page
  when    I am able to enter Email id and password
    Then    I am successfully able to login with valid email Id and password

  Scenario: I am on recruiter login page
    When    I am able to login with valid recruiter email id and password
    Then    I am successfully able to login with valid email Id and password

  Scenario Outline: I should be able to see list of filter
    When    I am on login page
    Then    I should be able to see "<Filter>" under more options

    Examples: | Filter       |
    | Keyword      |
    | Location     |
    | Salary value |
    | Salary Type  |
    | Job Type     |
    | Find Jobs    |

  Scenario Outline: I should be able to choose any filter option with specific result
    When    I click on "<Filter>"
    And     I click on "<Option>"
    Then    I should be able to choose any filter option from the list
    And     I should be able to see "<Result>"

    Examples: | Filter      | Option              | Result                              |
    | Miles       | Miles are visible   | 1Mile,2 Mile,5 Mile up to 750 mile            |
    | Salary Type | GBP Value           | per Annum, Per Monthly, per Weekly, Per hour  |
    | Job Type    | Different contracts | permanent, part time, temporary,Apprenticipe  |
