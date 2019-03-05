package com.trinh.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trinh.product.entities.Product;
import com.trinh.product.repos.ProductRepository;

@SpringBootApplication
public class ProductdataApplication implements CommandLineRunner{
	
	@Autowired
	ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProductdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//Product product2 = repository.findById(1);
	}

}
