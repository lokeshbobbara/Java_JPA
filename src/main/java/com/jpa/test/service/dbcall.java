package com.jpa.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.entities.userDetails;
import com.jpa.test.repository.repository;

@Service
public class dbcall {
	@Autowired
	repository Repository;
	
	public void bdd() {
		
		
		userDetails user= new userDetails();
		user.setName("FGHHHJJ");
		user.setCity("AP");
		user.setStatus("BPMN");
		
		userDetails user1= new userDetails();
		user1.setName("VBNMBCC");
		user1.setCity("JM");
		user1.setStatus("Camundaa Bpm");
		
		List<userDetails> users = List.of(user,user1);
		Iterable<userDetails> result = Repository.saveAll(users);
		for(userDetails ab : result)
		{
			System.out.println(ab);
		}

		
		System.out.println("db inserted");
	}

}
