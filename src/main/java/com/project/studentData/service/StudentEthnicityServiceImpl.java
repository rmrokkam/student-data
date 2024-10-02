package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.StudentEthnicityRepository;
import com.project.studentData.model.StudentEthnicity;

public class StudentEthnicityServiceImpl implements StudentEthnicityService {
	@Autowired
	StudentEthnicityRepository refRepo;
	
	@Override
	public List<StudentEthnicity> findAll() {
		return refRepo.findAll();
	}
}
