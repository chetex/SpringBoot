package com.chetex.studentmanagement.service.impl;

import com.chetex.studentmanagement.entity.Student;
import com.chetex.studentmanagement.repository.StudentRepository;
import com.chetex.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * Get student repository find all method.
     * @return studentRepository.findAll()
     */
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
