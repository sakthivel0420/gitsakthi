Feature: Checking the login functionality of the sportsjam web application

 

  @ValidCredentials
 Scenario: User logins to the web application with valid credentials
 Given user is in the home page of sportsjam
And User clicks the log in button
    When User gives valid Credentials
    |             email              | pass       |
    |  harshavarthiniv2000@gmail.com | Harsha@16  |
    And  User clicks the login button
    Then User is shown looged in to the website

  @InValidCredentials
   Scenario: User logins to the web application with Invalid credentials
   Given user is in the home page of sportsjam
And User clicks the log in button
    When  User gives Invalid Credentials
    |      email            | pass        |
    |  dasdasdasd@gmail.com | sdgsdf      |
    And User clicks the login button
    Then User is shown No customer account found message

  @ForgotPassword
  Scenario Outline: User uses the forgot password feature to recover their password 
  Given user is in the home page of sportsjam
And User clicks the log in button
  When  User clicks the forrgot password button 
  And user enter the details using sheetname  "<sheetname>" and rownumber <rownumber> 
  And the user clicks submit
  Then a pop is shown with a message sucessfully sent recovery email
 
  Examples:
      | sheetname | rownumber |
      | sheet1    |         0 |