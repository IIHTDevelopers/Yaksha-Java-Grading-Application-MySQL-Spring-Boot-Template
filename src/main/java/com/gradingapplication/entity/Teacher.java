package com.gradingapplication.entity;

import java.util.List;

public class Teacher {
	private Long id;

	private String name;

	private List<Student> students;

	public Teacher() {
		super();
	}

	public Teacher(Long id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
}
