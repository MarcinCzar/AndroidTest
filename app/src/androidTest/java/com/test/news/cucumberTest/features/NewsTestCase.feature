Feature: News Test Feature

  @e2e @smoke
  Scenario Outline : News images are loaded
  Given the <userName> successfully logged in to the app using <password>
  When there is internet connection
  Then images are displayed in the rows on the list
  Examples:
    | userName       | password |
    | user1          | password |

  @e2e
Scenario Outline : Failed to load images
  Given the <userName> successfully logged in to the app using <password>
  When there is no internet connection
  Then <errorMessage> is displayed and Retry button
  Examples:
    | userName       | password | errorMessage        |
    | user1          | password | failed to load news |

  @e2e
Scenario Outline : News image is clicked
  Given the <userName> successfully logged in to the app using <password>
  And the news images are successfully loaded on the screen
  When the user clicks one of the image
  Then user is navigated to the external browser with clicked image loaded
  Examples:
    | userName       | password |
    | user1          | password |
