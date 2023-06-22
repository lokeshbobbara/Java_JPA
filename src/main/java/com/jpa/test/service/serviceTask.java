 package com.jpa.test.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.entities.userDetails;
import com.jpa.test.repository.repository;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;


@Service
public class serviceTask {
	@Autowired
	repository Repository;
	@JobWorker(type="DBservice", autoComplete = true)
	public void  insert(ActivatedJob job) 
	{
		Map<String,Object> keyValue = job.getVariablesAsMap();
		System.out.println("Key-Value Details: "+keyValue);
		Integer Id = (Integer)keyValue.get("id");
		String Name = (String)keyValue.get("name");
		String City = (String)keyValue.get("city");
		String Status = (String)keyValue.get("status");
		
		userDetails userData = new userDetails();
		userData.setName(Name);
		userData.setCity(City);
		userData.setStatus(Status);
		userDetails result = Repository.save(userData);

		System.out.println("details Inserted");
	}
	
	
	



}
