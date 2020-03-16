package com.example;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;



@EntityScan(
		basePackageClasses = {DateAndTimeTestCaseApplication.class,Jsr310JpaConverters.class}
		)

@SpringBootApplication
public class DateAndTimeTestCaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateAndTimeTestCaseApplication.class, args);
	}
	
	
	 @Bean
	    public CommandLineRunner run(ApplicationContext appContext) {
	        return args -> {

	            System.out.println("hello World!");
	            
	        };
	    }
	 
	 @PostConstruct
	 void init() {
	     TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	 }

}
