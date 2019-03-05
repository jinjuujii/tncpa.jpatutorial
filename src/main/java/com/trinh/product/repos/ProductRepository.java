package com.trinh.product.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.trinh.product.entities.Product;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
