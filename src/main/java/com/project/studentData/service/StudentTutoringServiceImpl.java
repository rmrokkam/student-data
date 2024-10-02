package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.StudentTutoringRepository;
import com.project.studentData.model.StudentTutoring;

public class StudentTutoringServiceImpl implements StudentTutoringService {
	@Autowired
	StudentTutoringRepository refRepo;
	
	@Override
	public List<StudentTutoring> findAll() {
		return refRepo.findAll();
	}
}
