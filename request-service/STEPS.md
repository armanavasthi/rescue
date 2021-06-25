Issue 1:<br>
Since we have added spring-data-jpa dependency, the `gradle build` command wasn't working. Because it also tries to run the tests, for that it tries to build the jpa beans also, and some beans need the database connection. Only when we have mysql up and running, the `gradle build` command was running successfully. To address this issue, added h2 dependency and in test/resources/application.properties, added h2 related configuration information.

