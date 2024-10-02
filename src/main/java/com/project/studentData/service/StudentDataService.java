package com.project.studentData.service;

import java.util.List;

import com.project.studentData.model.StudentData;

public interface StudentDataService {
	public List<StudentData> findAll();
	public StudentData findById(int ref);
}
