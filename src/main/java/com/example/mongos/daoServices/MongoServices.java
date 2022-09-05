package com.example.mongos.daoServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.mongos.model.Student;
import com.example.mongos.repository.MongoRepos;

@Service
public class MongoServices {
	@Autowired
	MongoRepos repo;

	public List<Student> createStudents(List<Student> student) {
		return repo.saveAll(student);
	}

	public List<Student> showAllStudents() {
		return repo.findAll();
	}

	public Student findStudentById(String id) {
		return repo.findById(id).get();
	}

	public Student updatingStudent(Student student) {
		return repo.save(student);
	}

	public String deletingStudent(String id) {
		repo.deleteById(id);
		return "student has been deletes";
	}

	public List<Student> findStuentByName(String name) {
		return repo.findByName(name);
	}

	public Student findStudentByNameAndEmail(String name, String email) {
		return repo.findByNameAndEmail(name, email);
	}

	public List<Student> findStudentByPage(int page_num, int page_size) {
		Pageable pages = PageRequest.of(page_num, page_size);
		return repo.findAll(pages).getContent();
	}
}
