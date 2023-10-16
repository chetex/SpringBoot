package com.chetex.studentmanagement.repository;

import com.chetex.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository to perform CRUD repository over Student table.
 * JpaRepository interface has to values. First table, and second primary key.
 * It is not needed to add @Repository tag, because JpaRepository already has.
 */
public interface StudentRepository extends JpaRepository<Student, Long> { }
