Feature: Login page

  Background:
    Given user is on login page


    @login
    Scenario: Verify user can login to System with valid credentials
      When user enters "tima" in username input field
      And user type "gitara007" in password input field
      And user click on Login button
      Then user should successfully long to Home page
