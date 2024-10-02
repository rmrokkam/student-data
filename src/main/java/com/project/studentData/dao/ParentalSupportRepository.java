package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.ParentalSupport;

public interface ParentalSupportRepository extends JpaRepository<ParentalSupport, String> {
	List<ParentalSupport> findAll();
}
