### Spring Boot, PostgreSQL, JPA, Hibernate REST API Demo

#### Steps to Setup

__1. Clone the repository__

`git clone https://gitlab.com/hendisantika/spring-boot-postgresql.git`

__2. Configure PostgreSQL__

First, create a database named postgres_demo. Then, open src/main/resources/application.properties file and change the spring datasource username and password as per your PostgreSQL installation.

__3. Run the app__

Type the following command from the root directory of the project to run it -

`mvn clean spring-boot:run`

Alternatively, you can package the application in the form of a JAR file and then run it like so -
```
mvn clean package
java -jar target/spring-boot-postgresql-0.0.1-SNAPSHOT.jar
```

This project is based on a GitLab [Project Template](https://docs.gitlab.com/ee/gitlab-basics/create-project.html).

Improvements can be proposed in the [original project](https://gitlab.com/gitlab-org/project-templates/spring).

### CI/CD with Auto DevOps

This template is compatible with [Auto DevOps](https://docs.gitlab.com/ee/topics/autodevops/).

If Auto DevOps is not already enabled for this project, you can [turn it on](https://docs.gitlab.com/ee/topics/autodevops/#enabling-auto-devops) in the project settings.