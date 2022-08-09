package com.spring.productsexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.productsexample.model.Product;
import com.spring.productsexample.repository.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;

  public List<Product> productList() {
    return repository.findAll();
  }

  public List<Product> findByNameContaining(String name) {
    return repository.findByNameContaining(name);
  }

  public List<Product> findByName(String name) {
    return repository.findByName(name);
  }

}
