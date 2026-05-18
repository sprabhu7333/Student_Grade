package com.std.Grade.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.Grade.Entity.Student;

@RestController
@RequestMapping("/Students")
public class StudentController {
	
	ArrayList<Student>al=new ArrayList<>();
	Student s=new Student();
	
	@PostMapping
	public Student addStudent(@RequestBody Student s) {
		return al.add(s);
	}
}
