package com.project.studentData.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="STUDENT_EXTRACURRICULAR")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class StudentExtracurricular {
	@Id
	@Column(name="extracurricular_id")
	private int id;
	
	@Column(name="extracurricular")
	private String extracurricular;
}
