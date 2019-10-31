package com.wy.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wy.bean.Teacher;
import com.wy.dao.TeacherDao;

@Service
public class TeacherDaoImpl implements TeacherDao {
	
	@Autowired
	private TeacherDao teacherDao;

	public Teacher getTeacherById(Integer id) {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherById(id);
	}

	@Override
	public ArrayList<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return teacherDao.getTeachers();
	}

	@Override
	public void addTeacher(Teacher teacher) {
		
		teacherDao.addTeacher(teacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.updateTeacher(teacher);
	}

	@Override
	public void deleteTeacher(Integer id) {

		teacherDao.deleteTeacher(id);
		
	}
}
