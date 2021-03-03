package com.example.ProductService.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    @GenericGenerator(name = "product_id_seq", strategy = "increment")
    @GeneratedValue(generator = "product_id_seq", strategy = GenerationType.AUTO)

    private Long id;
    private String product_name;
    private Long price;
    private String imgsrc;
}
