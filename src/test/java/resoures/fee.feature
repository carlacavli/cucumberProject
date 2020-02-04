Feature: Create a Fee
  Scenario: Fee Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on fee
    And Type the feename "muberra"
    And Type the feecode "carla"

    And Type in Feepriority "2"
    And Remove the data "muberra"
    Then Verify data is removed "muberra"