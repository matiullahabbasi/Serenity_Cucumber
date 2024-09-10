Feature: Login To ZTNA_ExtremeCloud


  @LoginPage
  Scenario: Login with valid credentials
    Given user is on home page
    When user enter admin as username
    And user enter admin123 as password
    Then  user should be able to Login

    Given user is on ExtremeCloud Universal ZTNA page
    When user click on IAM button
    When user click on UserGroup button
    And user click on Create User Group button
    And user enter Group name
    Then user click on create to Add group to List.
