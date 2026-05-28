package com.std.Grade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.std.Grade.Entity.Grade;

public interface GradeRepo extends JpaRepository<Grade, Integer> {

}
