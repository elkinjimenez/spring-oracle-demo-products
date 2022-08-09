package com.spring.productsexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.productsexample.model.Product;
import com.spring.productsexample.service.ProductService;

@RestController
@RequestMapping("products")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

  @Autowired
  private ProductService service;

  @GetMapping("/list")
  public ResponseEntity<List<Product>> getList() {
    return new ResponseEntity<>(service.productList(), HttpStatus.OK);
  }

  @GetMapping("/findByName")
  public ResponseEntity<List<Product>> findByName(@RequestParam(required = true) String name) {
    return new ResponseEntity<>(service.findByName(name), HttpStatus.OK);
  }

  @GetMapping("/findByNameContaining")
  public ResponseEntity<List<Product>> findByNameContaining(@RequestParam(required = true) String name) {
    return new ResponseEntity<>(service.findByNameContaining(name), HttpStatus.OK);
  }

}
