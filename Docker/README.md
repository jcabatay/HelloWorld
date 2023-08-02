# Docker
- Introducton to Docker
- Docker-compose
- Mysql, PhpmyAdmin


##  Necesaries versions:

- Maven 3.8.5
- Java 17
- Docker image: phpmyadmin:5.2.1 ( this is automatically downloaded on building module)
- Docker image: mysql:8.0.33 ( this is automatically downloaded on building module)

## Starting services

* on terminal: docker-compose run -d
* on IDE run: DockerApp

## Stopping services
* on terminal: docker-compose down
* on IDE stop DockerApp


## Endpoints
- #### To execute PhpMyAdmin + MySQL
```
  localhost:8090
```

- #### To execute services
```
 localhost:8762/hellodocker/v1/hello
 localhost:8762/hellodocker/v1/getall
 localhost:8762/hellodocker/v1/add
```