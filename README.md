# Tutorial CRUD bookstore Webapp with Kotlin and Spring Boot

## Database

A PostgreSQL database is being used to store the books and authors

To start a database locally navigate to the directory of the docker-compose.yml and use the command

`docker-compose up`

## Start the Backend

When the database is up and running you can start the Kotlin application by starting the main function in BookStoreApplication.kt

The backend will use port 8080 for incoming connections.

## Adminer

Besides the database the webUI tool adminer is started to view and edit data within the database

Access it in your browser at [localhost:8888](localhost:8888)

Login by choosing PostgresSQL as database system and using

User: postgres
Password: localtest
Database: postgres

Within adminer you can now execute the SQL from the test-data.sql file to populate the database with test data

## Start the frontend

Navigate to the frontend/bookstore directory

Install the node dependencies with

`npm install`

Now you can start the frontend with the command

`npm run start`

Access the webUI in your browser at [http://localhost:3000/](http://localhost:3000/)
