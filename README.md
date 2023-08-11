# Service on java
## A service that allowed people to create notes, fumble them between, sort, etc.
### Summary
A frames TODO list service provides users with the capability to CRUD. Users can create, edit, delete and move notes.
Actors
Users

Use case:
 
   Create/Update/Edit/Delete Notes

### Aggregates: 
   User
      UserID 
      Name
            
###   Note
      NoteID
      Owner
      Text

 ###  Services:
         Note service
         User service
###   API:
   REST
      GET /v1/users/(user_id)/notes/(note_id)
      POST /v1/users/(user_id)/notes
      DELETE /v1/users/(user_id)/notes/(note_Id)
      UPDATE /v1/users/(user_id)/notes/(note_Id)
         
### Project structure

config/
   ApplicationConfig
service/
   NoteSetvice
   UserService
model
   domain -pojo
      Note
      User
   web
      NoteRequest
      NoteResponse
   entity
      NoteEntity
      UserEntity
rest
   NodeController
   UserController
repository
   UserRepository
   NoteRepository
docker file
Unit test

## Prerequirements
1) JDK 19
2) Database: PostgreSQL. TBD! MongoDB, (ELK)elastic search, logstash, kibana.
3) Build Tool: Maven.  
4) Version Control: GitHub.
5) Testing Frameworks: JUnit.
6) Authentication: OAuth2.
7) Web Framework: Spring Boot for RESTful API development.

Requirements
## Functional 
   1)Create Notes: Users can create notes with titles and descriptions.
   2)Edit Notes: Users can edit existing notes.
   3)Delete Notes: Users can delete notes.
   4)Fumble Between Frames: Users can move notes between various frames or categories.
 ## Non-functional
   1)Performance: The system should respond quickly to user interactions.
   2)Scalability: Should be able to handle an increasing number of users and notes.
   3)Security: Secure user data with encryption and secure communication using HTTPS.
   4)Availability: Ensure high availability of the system.
   5)Maintainability: Code should be clean, well-commented, and follow standard design patterns.   
   6)Accessibility: The user interface should be accessible to users with disabilities, if applicable.
   7)Internationalization: Support for multiple languages, if required.

 ###  Architecture
## Front-End: Angular, React, or Vue.js for the client-side. Communication with the back-end through RESTful APIs.

## Back-End:

Controller Layer: Handles HTTP requests and responses.
Service Layer: Contains business logic.
Repository Layer: Interacts with the database.
Model: Defines the structure of notes, frames, and users.
Database: Relational database to store data.

Security: Integration with OAuth2 or JWT for user authentication and authorization.

Caching: Implement caching for frequently accessed data to enhance performance.

Logging & Monitoring: Tools like Logback and Prometheus for logging and monitoring.

CI/CD Pipeline

This architecture provides a scalable, maintainable, and robust solution for the frames TODO list service. Using Java with the Spring Boot framework, along with modern front-end technologies.
## TODO list
 1)Security
2) Data Base
3) REST GraphQL HATEOAS
4) Spring
5) DDD
6) CICD
7) TestingCertainly! Here's the process to create a system design using Actors and Aggregates, along with the connections between the units, focusing on the architecture for the frames TODO list service.
###
Step 1: Define Actors and Use Cases

Integration with other productivity tools (if applicable)
You can visualize these actors and use cases using a Use Cases diagram in draw.io.

Step 2: Determine Aggregates
Aggregates are entities that you'll store in the database or process within the system:

User Aggregate: Contains user information like username, password, email, etc.
Note Aggregate: Holds details of notes such as title, description, timestamp, priority, etc.
Frame Aggregate: Represents categories or frames for sorting notes.
Notification Aggregate: If there are notifications, this aggregate may contain information related to notifications.
Step 3: Establish Connections
The connections between these aggregates can be established as follows:

User <-> Note: One user can have multiple notes, but each note belongs to one user.
Note <-> Frame: One note can be in one frame, but one frame can contain multiple notes.
User <-> Frame: A user can create multiple frames for categorizing their notes.
User <-> Notification: If notifications are implemented, one user may have multiple notifications.


### Docker postgresql
## Pull the Postgres Docker Image
docker pull postgres
## Create a Docker Volume
docker volume create postgres_data
## Run the Postgres Docker Container

docker run --name postgres_container -e POSTGRES_PASSWORD=password -d -p 5433:5432 -v postgres_data:/var/lib/postgresql/data postgres
docker exec -it postgres_container bash