# Easy School Website
The official website of Easy School, a fun school with flexible courses. this application was created as part of learning to work with spring boot

### Configuration

To run the application for the first time, few configurations are needed :

- On your local sql server, create a database named **easyschool**
- if you're using SQL on the *3306* port make sure to change it in the applications properties
- run the two scripts inside the static folder, *schema.sql* first to create the tables of the database and establish the relationships between them, then *data.sql* to populate some tables with some dummy data and necessary data
- run the application by running the main *SchoolbootApplication*
- Open the application on `localhost:8080`
- You can create a new student account or login using the administrator credentials : Email : *admin@eazyschool.com* && Password : *admin*

### Features 

- Info about the school, the courses, and the professors in the home page
- Courses page and courses categories
- A holidays list page
- About page with more information
- Contact forum with no authentication to contact the school
- Authentication as the admin or a student
- **Student features :**
  - Edit personal information (name, password, address...)
  - Consult assigned classes
- **Admin features :**
  - Edit personal information (name, password, address...)
  - Check the messages the school receives
  - Check the available classes, and the students assigned to that class
  - Assign existing students to a class
  - Check the list of courses, as well as the students enrolled in them
  - Assign a student to a course
  - Create a new class or course

### Bonus REST feature

although the application uses a Spring JPA in the application to store, display and manipulate data,
it can as well be deployed as a REST Api, you can check the available api after
logging in as the admin and consulting the following link *HAL explorer* : http://localhost:8080/data-api/
it should be something like this :

![img](https://user-images.githubusercontent.com/99540220/219009441-2fdbd0ff-d6e2-46f3-91c8-e3102891e03e.png)

Here, you will find all the available links to use this application as a REST API another application makes use of.
per example `http://localhost:8080/data-api/contacts` will return messages stored in the *Contact* table in the database in JSON format :

![img_1](https://user-images.githubusercontent.com/99540220/219009461-e5a13914-9b1d-4f4c-a931-9ae3bc8f8731.png)


### Screenshots of the application :

![img_2](https://user-images.githubusercontent.com/99540220/219008980-c3c7d0bb-178f-4706-bd41-a5a4d148639b.png)

![img_3](https://user-images.githubusercontent.com/99540220/219009020-311faf67-59b3-4bcb-90cb-a458a06365d3.png)

![img_17](https://user-images.githubusercontent.com/99540220/219009423-b575b22b-dae5-43e0-ad84-b46ed5f73bb4.png)

![img_4](https://user-images.githubusercontent.com/99540220/219009042-1754e952-e388-48f1-91f4-931debb1609d.png)

![img_5](https://user-images.githubusercontent.com/99540220/219009101-45ed600f-bb04-44ab-9023-30d9c1d8d047.png)

![img_7](https://user-images.githubusercontent.com/99540220/219009139-11258f5f-43b9-4614-94c1-b843b9f445c9.png)

![img_6](https://user-images.githubusercontent.com/99540220/219009117-96ec3bc3-5591-4a98-b95e-ad8ef2e1dc5d.png)

![img_8](https://user-images.githubusercontent.com/99540220/219009172-1e90a122-fd1d-40e4-b6bc-c5f551f3b243.png)

![img_15](https://user-images.githubusercontent.com/99540220/219009380-fed9abd0-ff35-4d6b-9a0f-b4e852cc5eb8.png)

![img_16](https://user-images.githubusercontent.com/99540220/219009397-e7417035-7f9e-4706-bd38-0001c6a70f0e.png)

![img_9](https://user-images.githubusercontent.com/99540220/219009201-fd30f2d7-8fbd-4986-952c-2a3f30473d06.png)

![img_10](https://user-images.githubusercontent.com/99540220/219009233-0d50df63-90ee-40ec-b123-84a3b648616f.png)

![img_11](https://user-images.githubusercontent.com/99540220/219009255-f8a9481d-8682-437f-99c7-8e9221ffd986.png)

![img_12](https://user-images.githubusercontent.com/99540220/219009300-66ee02db-87c9-4890-8354-336976aca250.png)

![img_13](https://user-images.githubusercontent.com/99540220/219009324-3c3ab0ac-dec0-46c9-8d46-9c823c78e71e.png)

![img_14](https://user-images.githubusercontent.com/99540220/219009354-61c03b48-f70b-401d-8e8c-dd02182f89fc.png)

