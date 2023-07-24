package com.ascii274;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.ascii274.docker"})
//@EntityScan("com.ascii274.docker.entity")
//@EnableJpaRepositories("com.ascii274.docker.repository")
public class DockerApp {

	public static void main(String[] args) {
		SpringApplication.run(DockerApp.class, args);
	}

}
