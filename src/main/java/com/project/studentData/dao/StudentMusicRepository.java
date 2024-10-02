package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentData.model.StudentMusic;

public interface StudentMusicRepository extends JpaRepository<StudentMusic, String> {
	List<StudentMusic> findAll();
}
