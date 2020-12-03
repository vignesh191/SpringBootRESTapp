# SpringBootRESTapp
A simple full-stack app, that uses Spring Boot as the backend server, OrientDB as the database, and React for the frontend. This is to just experiment with Spring Boot.

## Some Notes
I am using CoreUI as the frontend template, just to understand how the layout works for personal purposes. You can use whatever frontend layout you'd like.

## Instructions
Before beginning, you will need to setup OrientDB locally on your machine, visit: https://www.orientdb.org/ to download and find instructions to start the database server locally. You must also have Node.js (with npm) installed.

1. Clone this repo to your machine locally

The Backend:
1. Ensure that the OrientDB server is up and running on `http://10.0.0.55:2480/studio/index.html`
2. `cd backend` and go to file `TestingApplication.java` and run it to start the backend SpringBoot server on `localhost:8080`
3. If successful, you should be able to open a browser and type `localhost:8080/country/IN` and get some JSON data

The Frontend:
1. `cd frontend` and type `npm i` to install all dependencies.
2. type `npm start` to start the frontend server locally on `localhost:3000`

## The UI
In the UI of the frontend, there should be a sidebar. Click on the tab labeled 'Backend Test' and interact with that page. 
You can type a country code to get the respective country's name or you can query for all countries in the OrientDB.
