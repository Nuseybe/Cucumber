@TEC-103
Feature: Esty Search Functionality

  Scenario Outline: Validate Etsy Search message
    Given Navigate Etsy HomePage
    When User searches for "<item>"
    Then Validate search message has the word "<item>"
    Examples:
      | item   |
      | carpet |
      | 123    |

  Scenario Outline: Validate each department of Etsy has valid title
    Given Navigate Etsy HomePage
    When User clicks on "<Department>"
    Then User validate title "<Title>"
    Examples:
      | Department            | Title                         |
      | Jewelry & Accessories | Jewelry & Accessories \| Etsy |
      | Clothing & Shoes      | Clothing & Shoes \| Etsy      |
      | Home & Living         | Home & Living \| Etsy         |
      | Wedding & Party       | Wedding & Party \| Etsy       |
      | Toys & Entertainment  | Toys & Entertainment \| Etsy  |


  @TEC-105

  Scenario: Validating free shipping label on result items
    Given Navigate Etsy HomePage
    When User searches for "Wireless phone charger"
    And User clicks on Free shipping checkbox
    Then Verify all results have "Free shipping" label

  @TECTC-1014
  Scenario: Validating Over price functionality
    Given Navigate Etsy HomePage
    When User searches for "carpet"
    And User click on Over Price checkbox
    Then User verifies all items prices are over that price