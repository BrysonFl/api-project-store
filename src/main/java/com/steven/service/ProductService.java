package com.steven.service;

import java.util.List;

import com.steven.entity.Product;

public interface ProductService {

	List<Product> get();
	Product getId(Integer id);
	Product add(Product product);
	Product edit(Product product);
	void delete(Integer id);
	
}
