package com.ihub.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ihub.www.model.Student1;
import com.ihub.www.service.StudentService;

@Controller
public class StudentController 
{   @Autowired
	StudentService studentService;
	@RequestMapping("/student")
    public String home()
    {
    	return "index.html";
    }
	@RequestMapping("/addStudent")
	public String addStu(Student1 stu)
	{
		return studentService.addStu(stu);
	}
}
