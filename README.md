# Spring Boot Sqlite

A simple spring boot service with a sqlite database. 

## Goals
The main goal of this project is to prove to that certain goals can be achieved using spring-boot, before converting the project in kotlin.

### Steps Taken
1. Basic Crud Spring boot app in java and maven
2. Added a non-standard sqlite DB... Mostly to prove that I can
3. Added a rest service
4. Used `gradle init` to convert to a gradle project
5. Tweak build.gradle to allow the project to actually build and run

## Running the App
In maven:
```
mvn -Dspring.profiles.active=sqlite spring-boot:run
```
In gradle
```
SPRING_PROFILES_ACTIVE=sqlite gradle clean bootRun
```
