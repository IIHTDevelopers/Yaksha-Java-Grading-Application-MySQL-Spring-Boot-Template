package com.gradingapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gradingapplication.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
