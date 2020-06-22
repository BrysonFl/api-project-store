package com.steven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steven.entity.Product;
import com.steven.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public List<Product> get() {
		return repository.findAll();
	}

	@Override
	public Product getId(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Product add(Product product) {
		return repository.save(product);
	}

	@Override
	public Product edit(Product product) {
		return repository.save(product);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	
	
}
