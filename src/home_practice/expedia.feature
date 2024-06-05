Feature: expedia core functionality

  AS a user I want to check expedia core functionality

  Background: I am on expedia homepage
    Given     I open google browser and write http://expedia.com
    When      I am on expedia.com homepage
    Then      I am on homepage tab

  Scenario: As s user I want to choose on "add a Flight"  or "add a car" option
    When    I click on "add a Flight" tab
    And     I click on "add a car" tab
    Then    I should be able to choose any filter option

  Scenario: I am able to click on leaving from option while click on "add a Flight" check box
    When    I am on "add a Flight" check box
    And     I click on check box
    Then    I am able to see "Leaving from" under "add a Flight"


  Scenario: I am able to click on flight tab
    When    I am on "home page"
    Then    I am able to click on flight tab

  Scenario: I am able to see multi city tab under flight tab
    When    I am on "home page"
    And     I am clicking on flight tab
    And     I am clicking on multi city tab
    Then    I am able to see multi city tab and  two flight option

  Scenario Outline: I able to select Traveller option under multi city tab
    When      I am on "home page"
    And     I am clicking on flight tab
    And     I am select on multi city tab
    Then    I am able to select "<Travellers>" tab

    Examples: Travellers
      | Adult          |
      | Children       |
      | Infant on lap  |
      | Infant in seat |

  Scenario Outline: I am able to add five flights under multi city tab
    When      I am on "home page"
    And     I am clicking on flight tab
    And     I am select on multi city tab
    And     I am able to select add flight
    Then    I am able to add "<Five Flight> " option with,"<Leaving From>", "<Going to>" and "< Date>"
    Examples: | Five Flight | Leaving From | Going to | Date |
    | Flight 1    | Leaving From | Going to | Date |
    | Flight 2    | Leaving From | Going to | Date |
    | Flight 3    | Leaving From | Going to | Date |
    | Flight 4    | Leaving From | Going to | Date |
    | Flight 5    | Leaving From | Going to | Date |