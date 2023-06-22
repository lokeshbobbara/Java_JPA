package com.jpa.test;
//import com.jpa.test.service.*;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.entities.userDetails;
import com.jpa.test.repository.repository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		
//		serviceTask db= new serviceTask();
//		db.insert();
		//ApplicationContext context= 
				SpringApplication.run(JpaApplication.class, args);
		
	//repository Repository=	context.getBean(repository.class);
	
	//Single filed ENtry to db
//	userDetails user=new userDetails();
//	user.setName("Database");
//	user.setCity("HYD");
//	user.setStatus("In");
//	
//	repository.save(user);
	
	//Multiple fields Entry In DB
	
	
	
	}

}
