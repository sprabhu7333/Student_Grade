package com.std.Grade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.std.Grade.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
