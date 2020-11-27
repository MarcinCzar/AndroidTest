Feature: Login Test Feature

  @e2e
  Scenario Outline : User opens the android app first time (when not logged in yet)
    Given the user opens app for the first time
    Then login screen with <userLabel> and <passwordLabel> entries and <loginButtonLabel> is displayed

    Examples:
      | userLabel       | passwordLabel | loginButtonLabel |
      | User name       | Password      | LOGIN            |

  @e2e
  Scenario Outline : User login failed
    Given the user provided <userName> and <password>
    When login button is clicked
    Then error markers are displayed by user or and password entries
    Examples:
      | userName       | password |
      | test1          | password |
      | user1          | test1    |

  @e2e @smoke
  Scenario Outline : User login succeed
    Given the user provided <userName> and <password>
    When login button is clicked
    Then user is taken to the news screen
    Examples:
      | userName       | password |
      | user1          | password |

  @e2e @smoke
  Scenario  : User user opens app next time
    Given user opens app next time
    Then user is taken to the news screen





