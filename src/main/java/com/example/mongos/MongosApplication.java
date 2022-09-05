package com.example.mongos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.mongos.repository")
public class MongosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongosApplication.class, args);
	}

}
	