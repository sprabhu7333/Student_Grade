package com.std.Grade.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.Grade.DTO.StudentDto;
import com.std.Grade.Entity.Student;
import com.std.Grade.Service.StudentService;


@RestController
@RequestMapping("/Students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody StudentDto dto) {
		return studentService.saveStudent(dto);
	}
	
//	@GetMapping("/getById/{sId}")
//	public Student GetById(@PathVariable int sId) {
//		return studentService.GetById(sId);
//	}
}
