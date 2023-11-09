@Landing_page
Feature: Landing page of the application

  @starting_page_elements
  Scenario: Validate that splash screen logo
    Then Verify that user should displayed the splash screen in the starting of the application
    Then Verify that user should be clickable in the enter as guest link in the landing of the application
    Then Verify that user should displayed the enter as guest link in the landing page of the application
    Then Verify that user should displayed the moving text in the landing page of the application
    Then Verify that user should displayed the dots below the moving text in the landing page of the application
    Then Verify that user should displayed the service men image in the landing page of the application
    Then Verify that user should be displayed the sign up button in the landing page of the application
    Then Verify that user should be clickable the sign up button in the landing page of the application
    Then Verify that user should be displayed the login button in the landing page of the application
    Then Verify that user should be clickable the login button in the landing page of the application

  @enter_as_guest
  Scenario: Validate enter as guest link
    When user click on the enter as guest in the landing page
    Then Verify that user should get the respected pop as coming soon in the landing page
