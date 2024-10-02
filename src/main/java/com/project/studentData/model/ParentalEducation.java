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

@Table(name="PARENTAL_EDUCATION")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class ParentalEducation {
	@Id
	@Column(name="parental_education_id")
	private int id;
	
	@Column(name="parental_education")
	private String parentalEducation;
}
