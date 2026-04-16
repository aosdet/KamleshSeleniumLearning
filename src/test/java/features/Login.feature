Feature: Login Feature

  #Given- Present Condition of the User
  #When - User actions
  #Then - Validation
  #And - joins Multiple Actions

  #common steps
  Background:
    Given user is on login page of ecommerce application

  @Validlogin @login @regression
  Scenario: Login Test with Valid Credentials
    When user enters email "tr90wq@eample.com" and password "Password@123"
    And user clicks on login Button
    Then user should be redirecting to the dashbaord page


  @InValidlogin @login @regression
  Scenario Outline: Login Test with InValid Credentials
    When user enters invalid "<email>" and "<password>"
    And user clicks on login Button
    Then user should remains on login page itself

    Examples:
      | email             | password  |
      | anu@gmail.com     | Test@1234 |
      | kamlesh@gmail.com |Test@1234  |


    #DataTable will be discussed in Framework development