package com.example.ProductService.repository;

import com.example.ProductService.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query(value = "select * from Product where id in ?1 ",nativeQuery = true)
    List<Product> queryProducts (ArrayList<Long> arrOfP);

}
