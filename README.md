# <img height="50" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRG66GxRaW52PzNwJUqxFYS3kN0Nfg7xizelnQSzxlmbvq-JOHQNxBXuIxwfvZLx88jD20&amp;usqp=CAU" width="50"/> _**Vinyl-Records-Store**_ <img height="50" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRG66GxRaW52PzNwJUqxFYS3kN0Nfg7xizelnQSzxlmbvq-JOHQNxBXuIxwfvZLx88jD20&amp;usqp=CAU" width="50"/>

_**<img height="17" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcX9LHx-NLqeOK_0Z-rS5TY5L7i2AFBnQx4XV-6zLzhnzC5OZuA8L9ZywQcw2XV2uX3X0&amp;usqp=CAU" width="17"/> Description:**_

It's a group non-commercial project.
It's simple application that founded on Spring Framework, which adheres to principles SOLID, ACID and also using Java Hibernate, MySQL as a relational database.
The basics functionality provides add and get all data of Songs and Records. It's a small prototype of a big project in the future.
This project on AWS is accessed at this URL: http://vinyl-records-store.eu-central-1.elasticbeanstalk.com. Now the project has three working endpoints:
 - http://vinyl-records-store.eu-central-1.elasticbeanstalk.com/records/
 - http://vinyl-records-store.eu-central-1.elasticbeanstalk.com/records/{id}
 - http://vinyl-records-store.eu-central-1.elasticbeanstalk.com/songs/{id}

_**<img height="17" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_yXBqjlS1-CYP45KB4vhNSdgiVFWYR7Gk9w&amp;usqp=CAU" width="17"/> Project structure:**_

- Data access tier -> handled by DAO;
- Business logic tier -> handled by Service;
- Presentation tier -> handled by Controllers.

**_<img height="17" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOADZ3nyYCh5Gqe9KK4uMPWGmGh0bIoRdrk1vwyRhtCPX_OIUKHhdD2zYMBNG_Ws4VYfk&amp;usqp=CAU" width="17"/> Technologies used:_**

- Java for service (I'm using version 17.0.3.1)
- IntelliJ IDEA (I'm using IntelliJ IDEA 2021.2.2 Ultimate Edition)
- Maven for service (I'm using version 3.8.6)
- JDBC for connection to DB
- MySQL as local database (I'm using version 8.0.22)
- Apache Tomcat as local web server (I'm using version 9.0.50)
- Hibernate (I'm using version 5.6.14.Final)
- Spring (I'm using version 5.3.20)
- RDS as database
- AWS as web server

**_<img height="17" src="https://as1.ftcdn.net/v2/jpg/04/43/43/72/1000_F_443437215_bHVyN1JOrOveOhp671NB9Ls97cyZSSq4.jpg" width="17"/> How to launch the project on your PC:_**

- Download and install Intellij IDEA 2021.2.2 (Ultimate Edition)
- Download and install MySQLWorkbench version 8.0.31
- Download and install Tomcat 9.0.50
- Fork this project to your JDK
- Create new empty DB by MySQLWorkbench
- Configure db.properties file in project with data of your DB
- Add Tomcat server to configuration
- Click on debug icon to run project

**_<img height="17" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJ4j4NQKI2jyAE-HbnB8ZPHpCI2cpKX3c1-DIgOYnjcUUuTd_mabHoAzXdrqpsg1sku78&amp;usqp=CAU" width="17"/> DataBase structure:_**

![](DB.jpeg)


**_<img height="17" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS25GBSFUWxTHvphYngpNHV6cBxe_Y4Mv3PBecKnfESl4s9hybqOvEo6Rp19OuTCf89ZyE&amp;usqp=CAU" width="17"/> Functionalities (access to endpoints):_**

- GET: /records/ - accessed for all users
- GET: /records/{id} - accessed for all users
- GET: /songs/{id} - accessed for all users