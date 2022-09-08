package com.example.mongos.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongos.daoServices.MongoServices;
import com.example.mongos.model.Student;

@RestController
public class SubjectController {
	@Autowired
	MongoServices services;

	@GetMapping("")
	public String hello() {
		return "Hello docker is here";
	}
	@PostMapping("/create")
	public List<Student> createStudent(@RequestBody List<Student> student) {
		return services.createStudents(student);
	}

	@GetMapping("/all")
	public List<Student> showAll() {
		return services.showAllStudents();
	}

	@GetMapping("/getById/{id}")
	public Student findByid(@PathVariable String id) {
		return services.findStudentById(id);
	}

	@PutMapping("/update")
	public Student updatStudent(@RequestBody Student student) {
		return services.updatingStudent(student);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable String id) {
		return services.deletingStudent(id);
	}

	@GetMapping("/getbyname/{name}")
	public List<Student> findByName(@PathVariable String name) {
		return services.findStuentByName(name);
	}

	@GetMapping("/getbynameandemail")
	public Student findByNameAndEmail(@RequestParam String name, String email) {
		return services.findStudentByNameAndEmail(name, email);
	}

	@GetMapping("/showbypages")
	public List<Student> showByPages(@RequestParam int page_no, int page_size) {
		return services.findStudentByPage(page_no, page_size);
	}
}
