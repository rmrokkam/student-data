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

@Table(name="STUDENT_MUSIC")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class StudentMusic {
	@Id
	@Column(name="music_id")
	private int id;
	
	@Column(name="music_participation")
	private String musicParticipation;
}
