package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.StudentGradeRepository;
import com.project.studentData.model.StudentGrade;

public class StudentGradeServiceImpl implements StudentGradeService {
	@Autowired
	StudentGradeRepository refRepo;
	
	@Override
	public List<StudentGrade> findAll() {
		return refRepo.findAll();
	}
}
