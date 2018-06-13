package com.stackroute.activitystream.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stackroute.activitystream.model.Circle;


public interface CircleRepository extends JpaRepository<Circle, String>{

	@Query(value = ("select c from Circle c where c.circleName like (?1)"))
	List<Circle> findAll(String searchString);
	
}
