package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;
import org.springframework.web.SpringServletContainerInitializer;

@Component
@SpringBootApplication
public class FormSubmissionApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(FormSubmissionApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(FormSubmissionApplication.class, args);
	}

}
