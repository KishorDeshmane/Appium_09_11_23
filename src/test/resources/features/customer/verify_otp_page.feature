@Verify_OTP
Feature: Verify otp page of customer application

  @verify_otp_elements_via_sign_up
  Scenario: Validate verify otp page elements via sign up page
    Given Verify that user is on the verify otp page from the sign up page
    Then Verify that back button should be displayed in the verify otp page
    Then Verify that back button should be clickable in the verify otp page
    Then Verify that need help link text should be displayed in the verify otp page
    Then Verify that need help link should be clickable in the verify otp page
    Then Verify that plane image should be displayed in the verify otp page
    Then Verify that verify otp text should be displayed in the verify otp page
    Then Verify that we have sent an otp text should be displayed in the verify otp page
    #Then Verify that otp sent mobile number should be displayed in the verify otp page
    Then Verify that otp user fields should be clickable in the verify otp page
    Then Verify that edit number text link should be displayed in the verify otp page
    Then Verify that edit number text link should be clickable in the verify otp page
    Then Verify that resend in countdown should be displayed in the verify otp page
    Then Verify that verify otp button should be displayed in the verify otp page
    Then Verify that verify otp button should not be clickable in the verify otp page

  @verify_otp_elements_via_log_in
  Scenario: Validate verify otp page elements via log in page
    Given Verify that user is on the verify otp page from the log in page
    Then Verify that back button should be displayed in the verify otp page
    Then Verify that back button should be clickable in the verify otp page
    Then Verify that need help link text should be displayed in the verify otp page
    Then Verify that need help link should be clickable in the verify otp page
    Then Verify that plane image should be displayed in the verify otp page
    Then Verify that verify otp text should be displayed in the verify otp page
    Then Verify that we have sent an otp text should be displayed in the verify otp page
    #Then Verify that otp sent mobile number should be displayed in the verify otp page
    Then Verify that otp user fields should be clickable in the verify otp page
    Then Verify that edit number text link should be displayed in the verify otp page
    Then Verify that edit number text link should be clickable in the verify otp page
    Then Verify that resend in countdown should be displayed in the verify otp page
    Then Verify that verify otp button should be displayed in the verify otp page
    Then Verify that verify otp button should not be clickable in the verify otp page

  @back_button
  Scenario: Validate verify otp back button via log in page
    Given Verify that user is on the verify otp page from the log in page
    When user click on the back button in the verify otp page
    Then Verify that user should be on the log in page from verify otp page

  @back_button
  Scenario: Validate verify otp back button via sign up page
    Given Verify that user is on the verify otp page from the sign up page
    When user click on the back button in the verify otp page
    Then Verify that user should be on the log in page from verify otp page

  @need_help
  Scenario: Validate verify otp need help link via log in page
    Given Verify that user is on the verify otp page from the log in page
    When user click on the need help link in the verify otp page
    Then Verify that user should be on the contact and support page from verify otp page

  @need_help
  Scenario: Validate verify otp need help link via sign up page
    Given Verify that user is on the verify otp page from the log in page
    When user click on the need help link in the verify otp page
    Then Verify that user should be on the contact and support page from verify otp page

  @verify_otp_button
  Scenario: Validate verify otp button with 6 digits valid otp via log in page
    Given Verify that user is on the verify otp page from the log in page
    When user click in the first box and send valid otp in the user field from the verify otp page
    Then Verify that verify otp button should be clickable in verify otp page
    When user click on the verify otp button in the verify otp page
    Then Verify that user is on the home page of the application

  @verify_otp_button
  Scenario: Validate verify otp button with 6 digits valid otp via sign up page
    Given Verify that user is on the verify otp page from the sign up page
    When user click in the first box and send valid otp in the user field from the verify otp page
    Then Verify that verify otp button should be clickable in verify otp page
    When user click on the verify otp button in the verify otp page
    Then Verify that user is on the home page of the application

  @verify_otp_button
  Scenario: Validate verify otp button with 6 digits invalid otp via log in page
    Given Verify that user is on the verify otp page from the log in page
    When user click in the first box and send invalid otp in the user field from the verify otp page
    Then Verify that verify otp button should be clickable in verify otp page
    Then Verify that user should be on the same verify otp page


  @verify_otp_button
  Scenario: Validate verify otp button with 6 digits invalid otp via sign up page
    Given Verify that user is on the verify otp page from the sign up page
    When user click in the first box and send invalid otp in the user field from the verify otp page
    Then Verify that verify otp button should be clickable in verify otp page
    Then Verify that user should be on the same verify otp page


  @verify_otp_button
  Scenario: Validate verify otp button with 5 digits invalid otp via log in page
    Given Verify that user is on the verify otp page from the log in page
    When user click in the first box and send five digit otp in the user field from the verify otp page
    Then Verify that verify otp button should not be clickable in verify otp page

  @verify_otp_button
  Scenario: Validate verify otp button with 5 digits invalid otp via sign up  page
    Given Verify that user is on the verify otp page from the sign up page
    When user click in the first box and send five digit otp in the user field from the verify otp page
    Then Verify that verify otp button should not be clickable in verify otp page


  @edit_number_link
  Scenario: Validate edit number link via log in page
    Given Verify that user is on the verify otp page from the log in page
    When user click on the edit number link from the verify otp page
    Then Verify that user should be on the log in page from verify otp page

  @edit_number_link
  Scenario: Validate edit number link via sign up page
    Given Verify that user is on the verify otp page from the sign up page
    When user click on the edit number link from the verify otp page
    Then Verify that user should be on the sign up page from verify otp page

  @resend_otp_link
  Scenario: Validate resend otp link via log in page
    Given Verify that user is on the verify otp page from the log in page
    When user click on the resend otp link from the verify otp page
    Then Verify that user should get the respected pop with message in the verify otp page

  @resend_otp_link
  Scenario: Validate resend otp link via sign up page
    Given Verify that user is on the verify otp page from the sign up page
    When user click on the resend otp link from the verify otp page
    Then Verify that user should get the respected pop with message in the verify otp page
