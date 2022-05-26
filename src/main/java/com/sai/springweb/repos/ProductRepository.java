package com.sai.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
