package com.std.Grade.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.Grade.DTO.SubjectDto;
import com.std.Grade.Entity.Subject;
import com.std.Grade.Service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("/saveSubject")
	public Subject saveSubject(@RequestBody SubjectDto dto) {
		return subjectService.saveSubject(dto);
	}
}
