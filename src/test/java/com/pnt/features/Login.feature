Feature: Login functionality

#  Scenario: user being able to login successfully
#    Given user opens the browser and navigate to facebook.com
#    When user fills username field
#    Then  user fills password field
#    And user clicks on sign in button
#    And user is logged in successfully
#    Then user closes the browser

  Scenario: user being able to search for One Item
    Given user opens the browser and navigate to amazon.com
    When user can see the search bar
    Then user types Java Books in the searchh bar
    And user clicks on search button
    And user can see search result of Element
    Then user closes the browser

  Scenario Outline: user being able to search for Multiple Item
    Given user opens the browser and navigate to amazon.com
    When user can see the search bar
    Then user types <itemName> in the search bar
    And user clicks on search button
    And user can see search result of Element
    And user closes the browser

    Examples:
      | itemName    |
      | dslr camera |
      | iPhone      |
      | laptop      |