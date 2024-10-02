package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.StudentGenderRepository;
import com.project.studentData.model.StudentGender;

public class StudentGenderServiceImpl implements StudentGenderService {
	@Autowired
	StudentGenderRepository refRepo;
	
	@Override
	public List<StudentGender> findAll() {
		return refRepo.findAll();
	}
}
