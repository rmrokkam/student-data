package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.ParentalEducation;

public interface ParentalEducationRepository extends JpaRepository<ParentalEducation, String> {
	List<ParentalEducation> findAll();
}
