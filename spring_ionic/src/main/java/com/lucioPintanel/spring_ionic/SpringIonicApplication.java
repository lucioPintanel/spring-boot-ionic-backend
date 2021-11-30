package com.lucioPintanel.spring_ionic;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucioPintanel.spring_ionic.domain.Categoria;
import com.lucioPintanel.spring_ionic.repositories.CategoriaRepository;

@SpringBootApplication
public class SpringIonicApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository cat_repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIonicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		
		cat_repo.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
