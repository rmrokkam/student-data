package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.ParentalSupportRepository;
import com.project.studentData.model.ParentalSupport;

public class ParentalSupportServiceImpl implements ParentalSupportService {
	@Autowired
	ParentalSupportRepository refRepo;
	
	@Override
	public List<ParentalSupport> findAll() {
		return refRepo.findAll();
	}
}
