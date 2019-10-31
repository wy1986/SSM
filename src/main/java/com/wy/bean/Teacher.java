package com.wy.bean;

public class Teacher {
	
	private Integer id;
	private String name;
	private String course;
	//private Date birth;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	/*
	 * public Date getBirth() { return birth; } public void setBirth(Date birth) {
	 * this.birth = birth;
	 */
	//}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
