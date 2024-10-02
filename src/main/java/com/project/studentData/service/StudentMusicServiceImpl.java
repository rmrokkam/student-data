package com.project.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.studentData.dao.StudentMusicRepository;
import com.project.studentData.model.StudentMusic;

public class StudentMusicServiceImpl implements StudentMusicService {
	@Autowired
	StudentMusicRepository refRepo;
	
	@Override
	public List<StudentMusic> findAll() {
		return refRepo.findAll();
	}
}
