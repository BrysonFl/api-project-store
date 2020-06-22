package com.steven.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.steven.entity.Product;

public interface ProductRepository extends Repository<Product, Integer> {

	List<Product> findAll();
	Product findById(Integer id);
	Product save(Product product);
	void deleteById(Integer id);
	
}
