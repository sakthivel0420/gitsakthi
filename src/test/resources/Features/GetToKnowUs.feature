Feature: Get to know us in SportsJam

Background:
  
  Given user is in the home page of sportsjam
  
 Scenario: User clicking About us

    When  User clicks About us
    Then Hello  Strikers message is shown
    
    Scenario: User clicking contact us
    When User clicks contact us
    Then Sportsjam.in Showrooms message is shown
    
     Scenario: User clicking inqury/feedback
      When User clicks inqury/feedback
    Then Sportsjam.in Showrooms message is showns
  
  
  Scenario: User clicking sportsjam team
      When User clicks sportsjam team
    Then WHO WE ARE @ SPORTSJAM.IN message is shown
  
  
