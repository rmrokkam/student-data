package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.StudentSports;

public interface StudentSportsRepository extends JpaRepository<StudentSports, String> {
	List<StudentSports> findAll();
}
