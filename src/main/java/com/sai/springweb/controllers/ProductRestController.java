package com.sai.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sai.springweb.entities.Product;
import com.sai.springweb.repos.ProductRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository repository;

	//Find or Read all products
	@RequestMapping(value="/products/",method=RequestMethod.GET)
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	//Read a single product
	@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
	//Create a product
	@RequestMapping(value="/products/",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	//Update an existing product
	@RequestMapping(value="/products/",method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	//Delete an existing product
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	
	
}
