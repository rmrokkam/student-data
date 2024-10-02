package com.project.studentData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.studentData.model.StudentData;

@Repository
public interface StudentDataRepository extends JpaRepository<StudentData, String>  {
	List<StudentData> findAll();
	StudentData findById(int ref);
}
