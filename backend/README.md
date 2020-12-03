# SpringBootRESTapi
This is a skeleton code to create a Spring Boot REST api service using data from an OrientDB database while documenting requests using Swagger. 

## Getting Started
1. Download this repo in a parent folder named "testing".
2. Make sure to have OrientDB installed and setup. In this example code, we will be using the provided "demodb".
3. Open your favorite Java IDE and navigate to "TestingApplication.java" inside the "src/java" folder and execute that file.
4. Open "localhost:8080/country/US" in your browser and view the amazing JSON response containing details of the United States.

## Deeper details
* The http endpoints and requests can be created in the file "CountryController.java". Follow similar syntax to the one provided GET request already inside the file.
* The provided endpoint: "localhost:8080/country/{code}" is mutable. The "{code} parameter can be changed to any country code inside the Countries class in the OrientDB demodb. Based off of the provided "{code}" a different JSON response will be returned to the browser. 

USEFUL TIP:
* To query a different class besides just the provided Country OrientDB class, follow the same format as the files provided in the "api", "dao", "model", and "service" folders. 
* This backend can be connected to a frontend easily using a proxy address to "localhost:8080" 

## Swagger
* This project has an added dependency for Swagger. Swagger allows project collaborators to easily view REST metadata such as request types and request endpoints. 
* To access Swagger in a human-friendly ui, visit "localhost:8080/swagger-ui/". 
* To access Swagger data in a JSON format, visit "localhost:8080/v2/api-docs".


