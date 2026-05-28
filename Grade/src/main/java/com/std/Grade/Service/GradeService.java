package com.std.Grade.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.Grade.DTO.GradeDto;
import com.std.Grade.Entity.Grade;
import com.std.Grade.Entity.Student;
import com.std.Grade.Entity.Subject;
import com.std.Grade.Repository.GradeRepo;
import com.std.Grade.Repository.StudentRepo;
import com.std.Grade.Repository.SubjectRepo;

@Service
public class GradeService {

	@Autowired
	private GradeRepo gradeRepo;
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private SubjectRepo subjectRepo;
	
	//for saving the grade
	public Grade saveGrade(GradeDto dto) {
		//to getting the student id
		Student student=studentRepo.findById(dto.getStudentId()).orElse(null);
		
		//for getting the subject id
		Subject subject=subjectRepo.findById(dto.getSubjectId()).orElse(null);
		
		Grade grade=new Grade();
		//setting marks
		grade.setMarks(dto.getMarks());
		
		//calculating Grade
		String result=calculateGrade(dto.getMarks());
		
		//setting grade
		grade.setGrade(result);
		
		//setting the grade into the student
		grade.setStudent(student);
		
		//setting the grade into the subject
		grade.setSubject(subject);
		
		//saving the grade into DB
		return gradeRepo.save(grade);
	}
	
	//grade calculation
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
