package com.steven.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steven.entity.Product;
import com.steven.service.ProductService;

@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
@RestController
@RequestMapping("/products")
public class RestProducts {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public List<Product> getProducts() {
		return productService.get();
	}
	
	@GetMapping(path = "/product/{id}")
	public Product getById(@PathVariable("id") Integer id) {
		return productService.getId(id);
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return productService.add(product);
	}
	
	@PutMapping(path = "/update/product/{id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable Integer id) {
		product.setId(id);
		return productService.edit(product);
	}
	
	@DeleteMapping(path = "/delete/product/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		productService.delete(id);
		return "Se eliminó el producto con el ID: " + id;
	}
	
}
