Feature: Reservations made at the booking page
  Scenario Outline: Reserving a room
    Given I am logged in
    When I try to reserve a room from "<start>" to "<end>"
    Then I should see a screen pop-up with "<message>"
   Examples:

    |start|end|message                                                                                                   |
    |1    |3  |You have successfully booked a Rockstar Suite Room. Thank you!                                            |
    |-3   |-1 |We are sorry, but we cannot provide you with a Rockstar Suite Room. Choose another one or come back later.|
    |0    |3  |You have successfully booked a Rockstar Suite Room. Thank you!                                            |
    |-1   |3  |We are sorry, but we cannot provide you with a Rockstar Suite Room. Choose another one or come back later.|
