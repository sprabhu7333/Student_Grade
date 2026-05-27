package com.std.Grade.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.std.Grade.Entity.Student;
import com.std.Grade.Repository.StudentRepo;

public class Student_Service {
	@Autowired
	private StudentRepo repo;
	
	//save student 
	public Student addStudent(Student s) {
		return repo.save(s);
	}
	
	//get by id
	public Student GetById(int sId) {
		  Optional<Student> byId = repo.findById(sId);
		  if(byId.isPresent()) {
			  return byId.get();
		  }
		  else
		  	return null;
		
	}
	
	public String calculateGrade(int mark) {
		if(mark>=90)
			return "O";
		else if(mark>=80)
			return "A+";
		else if(mark>=70)
			return "A";
		else if(mark>=60)
			return "B+";
		else if(mark>=50)
			return "C";
		else
			return "Fail";
	}
}
