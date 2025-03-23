package com.uday.jdbc;

import com.uday.jdbc.model.Alien;
import com.uday.jdbc.repository.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Aysha");
		alien1.setTech("Java");

		AlienRepo alienRepo = context.getBean(AlienRepo.class);
		alienRepo.save(alien1);
		System.out.println(alienRepo.findAll());
	}

}
