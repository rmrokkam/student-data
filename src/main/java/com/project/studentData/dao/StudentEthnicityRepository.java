package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.StudentEthnicity;

public interface StudentEthnicityRepository extends JpaRepository<StudentEthnicity, String> {
	List<StudentEthnicity> findAll();
}
