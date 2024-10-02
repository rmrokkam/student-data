package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.ParentalEducationRepository;
import com.project.studentData.model.ParentalEducation;

public class ParentalEducationServiceImpl implements ParentalEducationService {
	@Autowired
	ParentalEducationRepository refRepo;
	
	@Override
	public List<ParentalEducation> findAll() {
		return refRepo.findAll();
	}
}
