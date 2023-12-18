package com.gradingapplication.entity;

public class Student {
	private Long id;

	private String name;

	private String grade;

	private int semester;

	private Teacher teacher;

	public Student() {
		super();
	}

	public Student(Long id, String name, String grade, int semester, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.semester = semester;
		this.teacher = teacher;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", semester=" + semester + ", teacher="
				+ teacher + "]";
	}
}
