package com.std.Grade.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.Grade.DTO.GradeDto;
import com.std.Grade.Entity.Grade;
import com.std.Grade.Service.GradeService;

@RestController
@RequestMapping("/grade")
public class GradeContoller {

	@Autowired
	private GradeService gradeService;
	
	@PostMapping("/saveGrade")
	public Grade saveGrade(@RequestBody GradeDto dto) {
		return gradeService.saveGrade(dto);
	}
	
}
