Feature: Check the hotel rating
  Scenario Outline: User goes to main page enters name of hotel and checks <name> name and <rating> rating
    Given Main Booking page opened
    When User enters name of hotel in input "Where are you going?"
    And Click "Search"
    Then <name> hotel presents on page
    Then <rating> rating is presented
    Examples:
      | name | rating |
    |"Cairo Marriott Hotel & Omar Khayyam Casino"|"7.6"|
    |"Anubis Pyramids Inn"                       |"7.8"|