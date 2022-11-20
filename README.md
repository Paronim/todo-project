# Todo project

This project is developed in java in the IntelliJ IDEA development environment using the Spring framework, PostgreSQL and interaction with it is implemented through Postman (workkspace files are attached to it)


## Database

The database was created on the basis of Postgresql for the functionality of this project
it consists of tables:
<img src="./img_readme/db.png"  
  alt="db" align="left" >
<ol>
<li> activity - stores user activation data
<li> category - stores data by task category
<li> priority - stores data on the priority of task execution
<li> role_data - stores data by user role
<li> stat - stores data on the status of the task (completed/uncompleted)
<li> task - stores data on tasks
<li> user_data - stores user data
<li> user_role - a link for many to many communication between user_data and role_data
</ol>

## Project

The project itself is a java code using the Spring framework and connecting a database on a monolithic architecture

<img src="./img_readme/plan.png"  
  alt="db" align="left" >

<ol>
<li> the repository contains all database queries
<li> services use the repository to call queries from the database, calls the necessary queries to the database and gets the result
<li> model - objects obtained from the database
<li> the controller receives a request from the client, calls the necessary methods from the service and receives a response from it
<li> the database stores the data
</ol>

## Postman

All workspace Postman files are attached to the repository. They contain all requests for interaction with the application. It remains only to import them into Postman, launch the application and enjoy its work.


