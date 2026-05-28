package com.std.Grade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.std.Grade.Entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {

}
