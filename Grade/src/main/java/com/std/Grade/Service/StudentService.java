package com.std.Grade.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.std.Grade.DTO.StudentDto;
import com.std.Grade.Entity.Student;
import com.std.Grade.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	//save student 
	public Student saveStudent(StudentDto dto) {
		
		Student student=new Student();
		
		student.setSname(dto.getStudentName());
		
		student.setEmail(dto.getStudentEmail());
		
		student.setDept(dto.getStudentDept());
		
		return studentRepo.save(student);
	}
	
	//get by id
//	public Student GetById(int sId) {
//		  Optional<Student> byId = studentRepo.findById(sId);
//		  if(byId.isPresent()) {
//			  return byId.get();
//		  }
//		  else
//		  	return null;
//		
//	}
	
}
