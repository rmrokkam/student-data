package com.project.studentData.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="student_data")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class StudentData {
	@Id
	@Column(name="student_id")
	private int id;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "gender_id")
	private StudentGender studentGender;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "ethnicity_id")
	private StudentEthnicity studentEthnicity;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "parental_education_id")
	private ParentalEducation parentalEducation;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "tutoring_id")
	private StudentTutoring studentTutoring;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "parental_support_id")
	private ParentalSupport parentalSupport;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "extracurricular_id")
	private StudentExtracurricular studentExtracurricular;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "sports_id")
	private StudentSports studentSports;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "music_id")
	private StudentMusic studentMusic;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "volunteering_id")
	private StudentVolunteering studentVolunteering;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "grade_letter_id")
	private StudentGrade studentGrade;

	@Column(name="age")
	private int age;
	
	@Column(name="study_time_weekly")
	private double studyTimeWeekly;
	
	@Column(name="absences")
	private int absences;
	
	@Column(name="gpa")
	private double gpa;
}
