package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.studentData.dao.StudentDataRepository;
import com.project.studentData.model.StudentData;

@Transactional
@Service("testService")
public class StudentDataServiceImpl implements StudentDataService {

	@Autowired
	StudentDataRepository refRepo;

	@Override
	public List<StudentData> findAll() {
		return refRepo.findAll();
	}

	@Override
	public StudentData findById(int ref) {
		return refRepo.findById(ref);
	}
}