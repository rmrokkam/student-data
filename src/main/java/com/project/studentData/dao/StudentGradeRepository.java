package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.StudentGrade;

public interface StudentGradeRepository extends JpaRepository<StudentGrade, String> {
	List<StudentGrade> findAll();
}
