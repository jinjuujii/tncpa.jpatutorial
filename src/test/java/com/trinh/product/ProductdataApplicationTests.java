package com.trinh.product;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.trinh.product.entities.Product;
import com.trinh.product.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ProductdataApplicationTests {
	
	@Autowired
	ProductRepository repository;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDesc("something is greate with this");
		product.setPrice(80100d);
		
		 
		repository.save(product);
		
 
				
	}
	
	@Test
	public void testRead() {
	

		
		
		Product optionalProduct  = repository.getOne(1);
		
		//product= repository.findById(1);
		
		assertNotNull(optionalProduct);
		assertEquals("Laptop", optionalProduct.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>" + optionalProduct.getDesc());
		
		
	} 

}
