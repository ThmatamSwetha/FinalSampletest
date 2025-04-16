Feature: Conduit CRUD Feature

Scenario: Login into App
Given User is on Login Page
When user Provide "swetha.reddy7242@gmail.com" and "Swetha@58"
Then user should be on home page

 Scenario: create a new article
Given  User should be on  new article page
When User enter article details
|title|Desc|Content|Tag|
|TEST12|TESTING|ARTICLES|TAGSS|
Then Article details page must be displayed

@SmokeTest
Scenario: error message 
Given  User should be on  new article page
When User enter article details
|title|Desc|Content|Tag|
|TEST12|TESTING|ARTICLES|TAGSS|
Then error message should be displayed

Scenario: Update an article
Given Article details page must be displayed
When user update article detail
Then Article detail mustbe updated

Scenario: Delete an article
Given Article details page must be displayed
When User delete article
Then Article must be deleted


 