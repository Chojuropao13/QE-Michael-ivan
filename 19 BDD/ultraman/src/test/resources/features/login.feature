Feature: As a user i want to login so that i can see my homepage

  @login
  Scenario : as an user i want to input invalid username and valid password
  Given user on login page
  When user input invalid username
  And user input valid password
  And user click login button
  Then user see error message

    @failed
    Scenario: user can't login
      Given user on login page
      And user input cresendital data
      Then user see the eror