package com.spring.productsexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.productsexample.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  List<Product> findByName(String name);

  List<Product> findByNameContaining(String name);

}
