# productOptimizerBackend

## Technical Specs ##
* Spring boot version 2.3.4
* Java 11
* Gradle 
* Packaging jar 
* Database Postgres

## Setting up project ##
1. download zip or clone project.
1. Import the database from the `` root/db`` folder to your postgres instance.
1. Make sure you use Java 11 for in the runtime environment for running the project.
1. change password and username settings for your postgres sql instance in Environment.properties which is in ``root/resources``.

## Run project locally ##
1. Using-CommandLine : Open project in root folder using terminal or command prompt and run ``./gradlew bootRun ``.
1. Using-IDE :Open with IDE and Use your IDE run tools to run the project.

## Run Tests ##
1. Open command prompt or terminal in root folder and give the command ``./gradlew test`` 
