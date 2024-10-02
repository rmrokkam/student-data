package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.StudentTutoring;

public interface StudentTutoringRepository extends JpaRepository<StudentTutoring, String> {
	List<StudentTutoring> findAll();
}
