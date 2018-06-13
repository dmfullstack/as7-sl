package com.stackroute.activitystream.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.stackroute.activitystream.model.UserCircle;




public interface UserCircleRepository extends CrudRepository<UserCircle, Integer>{
	
	@Query("select uc from UserCircle uc where uc.username=(?1) and uc.circleName=(?2)")
	UserCircle getUsernameAndCircleName( String username, String circleName);

	@Query("select circleName from UserCircle where username = (?1)")
	List<String> findCircleNameByUserName(String username);
	

}
