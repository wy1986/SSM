package com.wy.dao;

import java.util.ArrayList;

import com.wy.bean.Teacher;

public interface TeacherDao {
	
	public ArrayList<Teacher> getTeachers();
	
	public Teacher getTeacherById(Integer id);
	
	public void addTeacher(Teacher teacher);
	
	public void updateTeacher(Teacher teacher);
	
	public void deleteTeacher(Integer id);

}
