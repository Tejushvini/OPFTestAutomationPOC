Feature: User Registration
  As a new user I want to register to the OPF platform

  Scenario Outline: Successful registration of new user with valid phone number and email address
    Given the new user is on the registration page
    When the new user enters valid name <name>
    And the new user enters valid surname <surname>
    And the new user enters valid cellNumber <cellNumber>
    And the new user enters valid email <email>
    And the new user accepts the terms and conditions
    When the new user click the get started button
    Then the user sees the OTP screen
    Examples:
      | name | surname | cellNumber | email |
      | Tej  | Beesoon | 0877145728 | opfautomation2@yopmail.com |
