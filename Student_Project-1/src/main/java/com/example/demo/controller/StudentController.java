package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.details.Student;
import com.example.demo.service.StudentService;




@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	
	@GetMapping(path="/student/{id}")
	public Student getById(@PathVariable("id") int id){
		return this.service.getById(id);
	}
}
