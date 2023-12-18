package com.gradingapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gradingapplication.dto.StudentDTO;
import com.gradingapplication.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<StudentDTO> getAllStudentsByTeacherId(Long teacherId) {
		// write your logic here
		return null;
	}

	@Override
	public StudentDTO createStudentUnderTeacher(Long teacherId, StudentDTO studentDTO) {
		// write your logic here
		return null;
	}

	@Override
	public StudentDTO updateStudentUnderTeacher(Long teacherId, Long studentId, StudentDTO studentDTO) {
		// write your logic here
		return null;
	}

	@Override
	public boolean assignGradeToStudent(Long teacherId, Long studentId, String grade) {
		// write your logic here
		return false;
	}
}
