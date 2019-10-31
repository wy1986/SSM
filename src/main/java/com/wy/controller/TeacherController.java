package com.wy.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wy.bean.Course;
import com.wy.bean.Teacher;
import com.wy.service.CourseDaoImpl;
import com.wy.service.TeacherDaoImpl;

@Controller
public class TeacherController {

	@Autowired
	private TeacherDaoImpl teacherDaoImpl;
	@Autowired
	private CourseDaoImpl courseDaoImpl;

	@RequestMapping("/getTeacher")
	public String getTeacher(@RequestParam("id") int id, Model model) {
		Teacher teacher = teacherDaoImpl.getTeacherById(id);
		model.addAttribute("teacher", teacher);
		System.out.println(teacher);
		return "success";
	}

	@RequestMapping("/getTeachers")
	public String getTeachers(Model model) {
		ArrayList<Teacher> teachers = teacherDaoImpl.getTeachers();
		model.addAttribute("teachers", teachers);
		model.addAttribute("a", "a");
		return "showTeachers";
	}

	@RequestMapping(value = "/teacher",method = RequestMethod.GET)
	public String teacher(Model model) {
		ArrayList<Course> courses = new ArrayList<Course>();
		courses = courseDaoImpl.getCourses();
		model.addAttribute("courses", courses);
		model.addAttribute("teacher", new Teacher());
		return "addTeacher";
	}
	
	@RequestMapping(value = "/teacher", method = RequestMethod.POST)
	public String addOrUpdateTeacher(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("course") String course) {
		Teacher teacher = new Teacher();
		System.out.println(name);
		if (id.equals("")) {
			teacher.setName(name);
			teacher.setCourse(course);
			teacherDaoImpl.addTeacher(teacher);
		} else {
			teacher.setId(Integer.parseInt(id));
			teacher.setCourse(course);
			teacher.setName(name);
			teacherDaoImpl.updateTeacher(teacher);
		}
		return "redirect:/getTeachers";
	}
	
	@RequestMapping(value="teacher/{id}",method = RequestMethod.GET)
	public String updateTeacher(@PathVariable("id")Integer id,Model model)
	{
		Teacher teacher = teacherDaoImpl.getTeacherById(id);
		model.addAttribute("teacher", teacher);
		ArrayList<Course> courses = new ArrayList<Course>();
		courses = courseDaoImpl.getCourses();
		model.addAttribute("courses", courses);
		return "addTeacher";
	}
	
	@RequestMapping(value="teacher/{id}",method=RequestMethod.DELETE)
	public String deleteTeacher(@PathVariable("id")Integer id)
	{
		teacherDaoImpl.deleteTeacher(id);
		return "redirect:/getTeachers";
	}

}
