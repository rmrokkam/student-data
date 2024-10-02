package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.StudentExtracurricular;

public interface StudentExtracurricularRepository extends JpaRepository<StudentExtracurricular, String> {
	List<StudentExtracurricular> findAll();
}
