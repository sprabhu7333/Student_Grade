package com.std.Grade.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.Grade.DTO.SubjectDto;
import com.std.Grade.Entity.Subject;
import com.std.Grade.Repository.SubjectRepo;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepo subjectRepo;
	
	public Subject saveSubject(SubjectDto dto) {

		Subject subject=new Subject();
		
		subject.setSubName(dto.getSubjectName());
		
		subject.setTotalMarks(dto.getTotalMarks());;
		
		return subjectRepo.save(subject);
	}
}
