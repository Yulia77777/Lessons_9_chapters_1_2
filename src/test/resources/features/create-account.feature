Feature: Create Account Test
  Check functionality that registers new accounts of users

  @MyTag
  Scenario: check validation of fields
  to verify that it is impossible to create a new account without populating mandatory dropdown listboxes
    Given Open browser
    And I click on SingIn
    And Create an account Email "yuliia.vorobiova@ctdev.io"
    When I populate mandatory fields First name "Yuliia" Last name "Vorobiova" Email "yuliia.vorobiova@ctdev.io" Password "11111" First name "Yuliia" Last name "Vorobiova" Address "Malinovska 12 Olx" City "Kiev" Mobile phone "380980000000" Address Alias "Alushta 12"
    Then Validation error should display "There are 2 errors"
    And Close browser