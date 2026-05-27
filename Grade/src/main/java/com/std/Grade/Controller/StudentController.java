package com.std.Grade.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.Grade.Entity.Student;
import com.std.Grade.Service.Student_Service;

@RestController
@RequestMapping("/Students")
public class StudentController {
	
	@Autowired
	private Student_Service service;
	
	@PostMapping("/save")
	public Student addStudent(@RequestBody Student s) {
		return service.addStudent(s);
	}
	
	@GetMapping("/getById/{sId}")
	public Student GetById(@PathVariable int sId) {
		return service.GetById(sId);
	}
}
