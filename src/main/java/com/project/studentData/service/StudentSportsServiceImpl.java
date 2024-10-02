package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.StudentSportsRepository;
import com.project.studentData.model.StudentSports;

public class StudentSportsServiceImpl implements StudentSportsService {
	@Autowired
	StudentSportsRepository refRepo;
	
	@Override
	public List<StudentSports> findAll() {
		return refRepo.findAll();
	}
}
