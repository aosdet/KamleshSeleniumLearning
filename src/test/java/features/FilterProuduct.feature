Feature: Filter Product

  Background:
    Given user is on login page of ecommerce application
    When user enters email "tr90wq@eample.com" and password "Password@123"
    And user clicks on login Button
    Then user should be redirecting to the dashbaord page


    @FilterProduct @regression
  Scenario: Filter product
    When user enters  Product "ADIDAS" into the Search Filter
    Then user should view the "ADIDAS" product into the Search Result

