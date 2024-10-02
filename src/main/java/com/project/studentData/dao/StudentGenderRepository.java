package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.StudentGender;

public interface StudentGenderRepository extends JpaRepository<StudentGender, String> {
	List<StudentGender> findAll();
}
