package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.details.Student;

@Service
public class StudentService {

	Map<Integer, Student> studentlist;

	public StudentService() {
		super();

		studentlist = new HashMap<>();
		init();
	}

	public void init() {
		studentlist.put(1, new Student(101, "Naveen"));

		studentlist.put(2, new Student(102, "sai"));

		studentlist.put(3, new Student(103, "kittu"));

		studentlist.put(4, new Student(104, "vinod"));

	}

	public Student getById(int id) {
		return this.studentlist.get(id);
	}

}
