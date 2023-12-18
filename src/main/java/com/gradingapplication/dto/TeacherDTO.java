package com.gradingapplication.dto;

public class TeacherDTO {
	private Long id;

	private String name;

	public TeacherDTO() {
		super();
	}

	public TeacherDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "TeacherDTO [id=" + id + ", name=" + name + "]";
	}
}
