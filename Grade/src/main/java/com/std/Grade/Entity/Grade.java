package com.std.Grade.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int marks;
	private String grade;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sId")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subId")
	private Subject subject;
	
}
