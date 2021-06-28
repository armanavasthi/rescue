#Rescue
This repository is the backend for Rescue application that helps you raise an issue/concern and nearby people will be notified for the same.<BR>
Development is in its initial state, contributions are welcomed.

####Steps to Run
- Start MySql in your local. <br>
- You can also run it on docker using command below<br>
`docker run -e MYSQL_ROOT_PASSWORD=admin --name mysql -d -p=3306:3306 mysql` <br>
- Create a database named `rescue` in the mysql server.<br>
- Start Location Service.<br>
- Start Request Service.<br>
- Access using `localhost:6060/`<br>
