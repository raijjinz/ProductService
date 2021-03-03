package com.example.ProductService.repository;

import com.example.ProductService.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
