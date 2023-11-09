@Sign_up
Feature: Sign up page of the customer application

  @sign_up_page_elements
  Scenario: Validate elements in sign up page
    Given Verify that user is on the sign up page from the landing page
    Then Verify that back button should be displayed in the sign up page
    Then Verify that back button should be clickable in the sign up page
    Then Verify that need help link text should be displayed in the sign up page
    Then Verify that need help link text should be clickable in the sign up page
    Then Verify that sign up and service man image should be displayed in the sign up page
    Then Verify that sign up text should be displayed in the sign up page
    Then Verify that first name user field should be displayed in the sign up page
    Then Verify that first name user field placeholder text should be "First name" displayed in the sign up page
    Then Verify that first name user field should be clickable in the sign up page
    Then Verify that last name user field should be displayed in the sign up page
    Then Verify that last name user field placeholder text should be "Last name" displayed in the sign up page
    Then Verify that last name user field should be clickable in the sign up page
    Then Verify that country code flag should be displayed in the sign up page
    Then Verify that country code flag should be clickable in the sign up page
    Then Verify that mobile number user field should be displayed in the sign up page
    Then Verify that mobile number user field should be clickable in the sign up page
    Then Verify that mobile number user field placeholder text should be "Enter mobile number here" displayed in the sign up page
    Then Verify that get otp button should be displayed in the sign up page
    Then Verify that get otp button should not be clickable in the sign up page
    Then Verify that by continuing something text should be displayed below the get otp button in the sign up page
    #Then Verify that t and c link text should be clickable below the get otp button in the sign up page
    #Then Verify that privacy policy link text should be clickable in the get otp button in the sign up page
    Then Verify that facebook sign up button should be displayed in the sign up page
    Then Verify that facebook sign up button should be clickable in the sign up page
    Then Verify that google sign up button should be displayed in the sign up page
    Then Verify that google sign up button should be clickable in the sign up page
    Then Verify that apple sign up button should be displayed in the sign up page
    Then Verify that apple sign up button should be clickable in the sign up page
    Then Verify that already have an account text should be displayed in the sign up page

  #Then Verify that log in link should be displayed in the sign up page
  #Then Verify that log in link should be clickable in the sign up page
  
  @back_button
  Scenario: Validate back button in sign up page
    Given Verify that user is on the sign up page from the landing front page
    When user click on the back button in the sign up page
    Then Verify that user is on the landing page from the sign up page

  @need_help_link
  Scenario: Validate need help link in sign up page
    Given Verify that user is on the sign up page from the start page
    When user click on the need help text link sign up page
    Then Verify that user is on the contact and support page from the sign up page

  @get_otp_button
  Scenario: Validate get otp button in sign up page
    Given Verify that user is on the sign up page from the startup page
    When user send text in the first name user field "Karan" in the sign up page
    When user send text in the last name user field "Arjun" in the sign up page
    When user search "+971" and select UAE country code in the sign up page
    #UNITED ARAB EMIRATES instead of 971 we can use
    When User send mobile number in the mobile number user field "000000001" in the sign up page
    Then user click on the get otp button in the sign up page
    Then User should be on the verify otp page from the sign up page

  #Valid test data
  
  @get_otp_button
  Scenario: Validate get otp button with valid first name with upto max length in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "Indiansouthvishwanathmallikakaranarjunxxxxxxxxxxxx" last name "wick" and mobile number "123456789"
    Then Verify that get otp button should be clickable with valid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with valid last name with upto max length in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "John" last name "Indiansouthvishwanathmallikakaranarjunxxxxxxxxxxxx" and mobile number "123456789"
    Then Verify that get otp button should be clickable with valid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with valid both with upto max length in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "Indiansouthvishwanathmallikakaranarjunxxxxxxxxxxxx" last name "Indiansouthvishwanathmallikakaranarjunxxxxxxxxxxxx" and mobile number "123456789"
    Then Verify that get otp button should be clickable with valid test data in the sign up page

  #Invalid test data
  
  @get_otp_button
  Scenario: Validate get otp button with all invalid test data in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "Sd" last name "Aa" and mobile number "454545"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with invalid first name and last name in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "Sd" last name "Aa" and mobile number "123456789"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with invalid first name and mobile number in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "Sd" last name "Mango" and mobile number "12345"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with invalid last name and mobile number in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "John" last name "Wi" and mobile number "12345"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with all invalid first name and mobile number in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "sd" last name "Wick" and mobile number "12345"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with invalid mobile number in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "john" last name "Wick" and mobile number "454545"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with invalid last name in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "John" last name "wi" and mobile number "123456789"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button with invalid first name in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "jo" last name "wick" and mobile number "123456789"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button as invalid first name with numbers in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "123" last name "wick" and mobile number "123456789"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button as invalid last name with numbers in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "John" last name "123" and mobile number "123456789"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button as invalid mobile number with letters in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "John" last name "Wick" and mobile number "abcdefg"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button as invalid first name with special chars in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "$$&$%$$" last name "wick" and mobile number "123456789"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button as invalid last name with with special chars in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "John" last name "$%#$" and mobile number "123456789"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  @get_otp_button
  Scenario: Validate get otp button as invalid mobile number with special chars in sign up page
    Given Verify that user is on the sign up page from the first landing page
    When User enter first name "John" last name "Wick" and mobile number "$&$%^^&$&"
    Then Verify that get otp button should not be clickable with invalid test data in the sign up page

  #Facebook Google apple
  #Link validation pending
  
  @Log_in_page_link
  Scenario: Validate log in link sign up page
    Given Verify that user is on the sign up page from the comeup page
    When User click on the log in link from the sign up page
    Then Verify that user is on the log in page from the sign up page
