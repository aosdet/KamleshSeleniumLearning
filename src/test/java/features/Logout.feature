Feature: Logout

  #Predefined steps
  Background:
    Given user is on login page of ecommerce application
    When user enters email "tr90wq@eample.com" and password "Password@123"
    And user clicks on login Button
    Then user should be redirecting to the dashbaord page

  @logout @regression
  Scenario: Logout
    When user clicks on signout button on home page
    Then user should be redirecting to the login page