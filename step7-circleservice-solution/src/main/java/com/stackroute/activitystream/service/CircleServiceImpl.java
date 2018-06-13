package com.stackroute.activitystream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.activitystream.model.Circle;
import com.stackroute.activitystream.repository.CircleRepository;

@Service("CircleService")
public class CircleServiceImpl implements CircleService{
	
	
	@Autowired
	private CircleRepository circleRepository;
	
	public boolean save(Circle circle) {
		if(circleRepository.findOne(circle.getCircleName())!=null) {
			return false;
		}else{
			
			return (circleRepository.save(circle)!=null);
		}
	}
	
	public List<Circle> getAllCircles() {
		
		return circleRepository.findAll();
	}
	
	public List<Circle> getAllCircles(String searchString) {
		
		return circleRepository.findAll(searchString);
	}
	
	public Circle get(String circleName) {
		
		return circleRepository.findOne(circleName);
	}
	
	public boolean delete(Circle circle) {
		if(circleRepository.findOne(circle.getCircleName())!=null) {
			return false;
		}else{
			circleRepository.delete(circle);
			return true;
		}
	}
		
}
