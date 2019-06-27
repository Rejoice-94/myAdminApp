# myAdminApp

This app is intended to register an employee and fetch all employees.

It's consisting of 2 main modules i.e. server and client. 

### Version
myAdminApp_V1 

## Prerequisites

Please download the following prerequisites to run/develop the application.

Name  | URL
------------- | -------------
Angular CLI   | https://angular.io
Node and NPM  | `https://nodejs.org/en/download/` and `https://www.npmjs.com/get- npm` 
Java  | `https://www.oracle.com/technetwork/java/javase/downloads/index.html`
  MVN    | `https://maven.apache.org/`
IDE | Eclipse, Visual Studio code, Sublime etc (For Development) 


## Install and Run

1. Clone this repository from `https://github.com/Rejoice-94/myAdminApp.git`
2. Once done, you will get 2 folders `/myAdmin-client` (Client App) and `/myAdmin-server` (Server)
3. Move to `/myAdmin-server` and do the following to start the server:

	1. Run the command `mvn spring-boot:run` to run the spring boot app.
	2. OR Import the project to the IDE (Eclipse) and do `maven install` and `run as spring boot app` .
	3. The server will run on `http://localhost:8090`.

4. Move to `/myAdmin-client` and do the following to start the client app:

	1. Run the command `npm install` to download all the dependencies.
	2. After that run `ng serve` to run the client app.
	3. The app will run on `http://localhost:4200`.


## Running the tests

1. Move to `/myAdmin-client` and do the following to run the test in client app:

	1. Run the command `ng test` to initiate test.
	2. An browser window will appear and show the status of tests.

2. Move to `/myAdmin-server` and do the following to run the test in server app:

	1. Run the command `mvn clean test` to initiate test.
	2. OR in IDE (Eclipse) do `run as maven test`.
	3. The test result will appear in the respective consoles.

## Build the app

1. Move to `/myAdmin-client` and do the following to build client app:

	1. Run the command `ng build --prod` to initiate build.
	2. Generated content will be in `/dist` folder.

2. Move to `/myAdmin-server` and do the following to build server app:

	1. Run the command `mvn package` to initiate build.
	2. OR in IDE (Eclipse) do `run as maven build`.
	3. The build log will appear in the respective consoles.
	

## Post installation
1. Open browser and enter `http://localhost:4200/employees` which loads the client portal.
2. `http://localhost:8090/h2/myAdmin/portal` is the admin portal for H2 database.
3. `http://localhost:8090/swagger-ui.html` will load the `SWAGGER` doc for the server end-points

## Authors

* **Rejoice Hota** - ** - [Rejoice-94](https://github.com/Rejoice-94)
## License


