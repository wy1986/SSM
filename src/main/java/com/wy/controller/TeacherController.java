package com.wy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wy.bean.Teacher;
import com.wy.service.TeacherDaoImpl;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherDaoImpl teacherDaoImpl;
	
	@RequestMapping("/getTeacher")
	public String getTeacher(@RequestParam("id") int id,Model model)
	{
		Teacher teacher = teacherDaoImpl.getTeacherById(id);
		model.addAttribute("teacher", teacher);
		System.out.println(teacher);
		return"success";
	}

}
