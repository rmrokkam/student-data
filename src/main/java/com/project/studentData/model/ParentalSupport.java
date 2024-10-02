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

@Table(name="PARENTAL_SUPPORT")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ParentalSupport {
	@Id
	@Column(name="parental_support_id")
	private int id;
	
	@Column(name="parental_support")
	private String parentalSupport;
}
