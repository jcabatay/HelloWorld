## App
 * ### HelloWorld

## About project
- Introductions and exercises.
- Here starts all.

##  Necesaries versions:

- Maven 3.8.5 
- Java 17
- Docker image: phpmyadmin:5.2.1 ( this is automatically downloaded on building module)
- Docker image: mysql:8.0.33 ( this is automatically downloaded on building module)

## Project modules.
* [Docker](Docker/README.md)<br>
  - Dockerize MySQL, PHPMyAdmin, JPA 
  - Create table and insert data at start project. 


* [SolidPrinciples](SolidPrinciples/README.md)<br>
  - Building the project


## Building module.

The below commandline: 

>* run in terminal ->  docker-compose up

Download image phpmyadmin, mysql, run this images as container.

[Insert data in mysql, see: customer_data.sql](Docker/customer_data.sql) 



## Endpoint
- 127.0.0.1:8080/hellodocker/v1/hello
- 127.0.0.1:8080/hellodocker/v1/list-all

## License
> MIT