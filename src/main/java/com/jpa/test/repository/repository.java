package com.jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entities.userDetails;

public interface repository extends JpaRepository<userDetails, Integer> {

}
