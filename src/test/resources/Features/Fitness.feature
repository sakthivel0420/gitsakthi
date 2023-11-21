Feature: To select a product and use filters to see if the product gets sorted and displays only limited products
  
  Scenario: Looking for product, sorting it and adding filters
    Given user is in the home page of sportsjam
    When User selects fitness
    When User selects the cycle option
    And User sorts the product to low to high
    And User selects the Giants brand
    Then User verifies the number of products displayed