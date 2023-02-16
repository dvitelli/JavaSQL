# SQL Database GUI

## Description 

Simple interface that allows the user to use add, search, and delete queries in a SQL database.

## User Flow

When opened user is given four text fields for User ID, First Name, Last Name, and Job Title. 

	User ID - Every user in the database must have a User ID and it must be >= 3 numbers. This is the database Key and duplicate ID can not be entered.

	First Name/Last Name/Job Title - Simple identifiers for users in database. Can be duplicate, can be blank.


After entering all information the user may press the search button, add button, or delete button.

	Search Button - The program checks if User ID exists, queries a singular search for that ID because the keys are unique, returns the information into an Employee object
  and then displays the information in a popup screen. 

	Add User Button - The program checks if User ID exists, if it does it returns an error, else it adds all data entered in First Name, Last Name, Job Title into database query.
  Adds the information to employee object and returns a popup screen on successful entry.
  
	Delete Button - The program checks if the User ID exists, if it does it sets the employee object with the search query information and then uses a delete query to remove the info in the 
  database. The interface has a popup showing deleted information if successful.

Built with a singleton connection to the database to optimize efficiency.

## Notes:

- Needs to be refactored especially with more methods to clean up code
- Want to add an edit feature




