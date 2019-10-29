package com.wy.service;

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

	/*
	 * @Override public Teacher getTeacherById(Integer id) { // TODO Auto-generated
	 * method stub return teacherDao.getTeacherById(id); }
	 */

}
