package com.Git.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class GitProjectNew2Application {

	public static void main(String[] args) {
		SpringApplication.run(GitProjectNew2Application.class, args);
	}

}
