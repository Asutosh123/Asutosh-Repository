Feature: imagenecsi login

Scenario: Register on imagenecsi with valid username and password
Given hit the imageneCsi url 
When enter the valid username "raviiolead@yopmail.com" and password "oefhwf" in the text box
Then user should be logged into the application successfully

Scenario Outline:: Register on imagenecsi with invalid username and password
Given hit the imageneCsi url 
When enter the invalid "<username>" and "<password>" in the text box
Then error message should be displayed
Examples:
|username||password|
|hgdfsghdfjgs||g3434treg|