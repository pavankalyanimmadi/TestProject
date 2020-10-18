package com.example.TestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestProjectApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}
	
	@Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(TestProjectApplication.class);
	    }

}
