package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.StudentVolunteering;

public interface StudentVolunteeringRepository extends JpaRepository<StudentVolunteering, String> {
	List<StudentVolunteering> findAll();
}
