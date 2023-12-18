package com.gradingapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gradingapplication.dto.TeacherDTO;
import com.gradingapplication.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Override
	public List<TeacherDTO> getAllTeachers() {
		// write your logic here
		return null;
	}

	@Override
	public TeacherDTO getTeacherById(Long teacherId) {
		// write your logic here
		return null;
	}

	@Override
	public TeacherDTO createTeacher(TeacherDTO teacherDTO) {
		// write your logic here
		return null;
	}

	@Override
	public TeacherDTO updateTeacherById(Long teacherId, TeacherDTO teacherDTO) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteTeacherById(Long teacherId) {
		// write your logic here
		return false;
	}
}
