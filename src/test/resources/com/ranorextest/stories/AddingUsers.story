Scenario: Adding female users to the site ranorex
Given User opens the homepage
When adds a user using gender female
Then User added with gender female

Scenario: Adding male users to the site ranorex
When adds a user using gender male
Then User added with gender male

Scenario: Adding users to the site ranorex
When Enter user first name
And Enter user last name
And Add user

Scenario: Enter only first name female and add
When Enter user female first name
And Choose grander female
And Add user
And Confirm the incorrect filling
Then The user with the completed only one field first name and grander female is not added

Scenario: Enter only first name male and add
When Enter user male first name
And Choose grander male
And Add user
And Confirm the incorrect filling
Then The user with the completed only one field first name and grander male is not added

Scenario: Enter only last name female and add
When Enter user female last name
And Choose grander female
And Add user
And Confirm the incorrect filling
Then The user with the completed only one field last name and grander female is not added

Scenario: Enter only last name male and add
When Enter user male last name
And Choose grander male
And Add user
And Confirm the incorrect filling
Then The user with the completed only one field last name and grander male is not added

Examples:
|firstName|lastName|
|Peter|Bishop|
|Ivanov|Ivanov|
|Vasy|Beluchy|
|Fox|Malder|

