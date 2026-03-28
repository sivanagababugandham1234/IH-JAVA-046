package com.ihub.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihub.www.model.Student1;
import com.ihub.www.repository.StudentRepository;

@Service
public class StudentService 
{
  @Autowired
   StudentRepository studentRepository;
  public String addStu(Student1 stu)
  {
	  studentRepository.save(stu);
	  
	  return"index1.html";

  }
}
