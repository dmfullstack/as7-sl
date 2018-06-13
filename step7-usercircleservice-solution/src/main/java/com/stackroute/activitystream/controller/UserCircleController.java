package com.stackroute.activitystream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.activitystream.model.UserCircle;
import com.stackroute.activitystream.service.UserCircleService;

@RestController
@RequestMapping("/api/usercircle")
public class UserCircleController {

	@Autowired
	UserCircleService userCircleService;
	

	@Autowired
	UserCircle userCircle;

	@PutMapping("/addToCircle/{username}/{circleName}")
	public ResponseEntity<UserCircle> addUser(@PathVariable("username") String username,
			@PathVariable("circleName") String circleName) {
		
		if(userCircleService.get(username, circleName)!=null) {
			return new ResponseEntity<UserCircle>(HttpStatus.CONFLICT);
		}
		boolean status = userCircleService.addUser(username, circleName);
		if (status == false) {

			return new ResponseEntity<UserCircle>(HttpStatus.INTERNAL_SERVER_ERROR);

		} else {

			return new ResponseEntity<UserCircle>(HttpStatus.OK);
		}

	}

	@PutMapping("/removeFromCircle/{username}/{circleName}")
	public ResponseEntity<UserCircle> removeUser(@PathVariable("username") String username,
			@PathVariable("circleName") String circleName) {
		
		boolean status = userCircleService.removeUser(username, circleName);
		if (status == false) {

			return new ResponseEntity<UserCircle>(HttpStatus.INTERNAL_SERVER_ERROR);

		} else {
			return new ResponseEntity<UserCircle>(HttpStatus.OK);

		}

	}
	
	
	 /*Retrieve circles for a specific user*/
	 	
	
	@GetMapping("/searchByUser/{username}")
	public ResponseEntity<List<String>> getMyCircles(@PathVariable("username") String username) {
		
		return new ResponseEntity<List<String>>(userCircleService.getMyCircles(username), HttpStatus.OK);

	}

}
