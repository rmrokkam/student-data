package com.project.studentData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.studentData.model.StudentData;
import com.project.studentData.service.StudentDataService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/students")
public class StudentDataController {
	@Autowired
	StudentDataService studentDataService;

	@GetMapping("/{id}")
	public StudentData getStudentByID(@PathVariable int id) {
		StudentData studentData = studentDataService.findById(id);
		return studentData;
	}
	
	@GetMapping()
	public List<StudentData> findAllStudentData() {
		List<StudentData> studentDataList = studentDataService.findAll();
		return studentDataList;
	}
}
