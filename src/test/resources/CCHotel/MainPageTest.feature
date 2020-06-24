Feature: Check main page functionalities
  Scenario Outline: User clicks on category buttons
    Given I am logged into the app
    When I click on "<category>" button on the main page
    Then I should see the "<categoryName>" card

    Examples:
      |category                 |categoryName             |
      |Luxury Room              |LUXURY ROOM              |
      |Superior Street View Room|SUPERIOR STREET VIEW ROOM|
      |Rockstar Suite Room      |ROCKSTAR SUITE ROOM      |

    Scenario: Login is successful
      When I am at the login page and I enter my valid credentials to log in
      Then I should arrive at the main page, where my username is on the navbar