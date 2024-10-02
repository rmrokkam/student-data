package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.StudentExtracurricularRepository;
import com.project.studentData.model.StudentExtracurricular;

public class StudentExtracurricularServiceImpl implements StudentExtracurricularService {
	@Autowired
	StudentExtracurricularRepository refRepo;
	
	@Override
	public List<StudentExtracurricular> findAll() {
		return refRepo.findAll();
	}
}
