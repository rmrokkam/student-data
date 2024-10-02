package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.StudentVolunteeringRepository;
import com.project.studentData.model.StudentVolunteering;

public class StudentVolunteeringServiceImpl implements StudentVolunteeringService {
	@Autowired
	StudentVolunteeringRepository refRepo;
	
	@Override
	public List<StudentVolunteering> findAll() {
		return refRepo.findAll();
	}
}
