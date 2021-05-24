package com.example.SpringBootDemoWithGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.controller")
public class SpringBootDemoWithGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoWithGitApplication.class, args);
	}

}
