package com.spring.productsexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_EXAMPLE")
public class Product {

  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "PRICE", nullable = false)
  private float price;

  public Product() {
  }

  public Product(String name, float price) {
    this.name = name;
    this.price = price;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

}
