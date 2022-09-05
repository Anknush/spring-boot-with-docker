package com.example.mongos.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongos.model.Student;

@Repository
public interface MongoRepos extends MongoRepository<Student, String> {
	List<Student> findByName(String name);	
	Student findByNameAndEmail(String name,String email);
}
