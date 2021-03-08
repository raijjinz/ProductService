package com.example.ProductService.dto;


import lombok.Data;

@Data
public class ProductPostDTO {
    private String product_name;
    private Long price;
    private String imgsrc;
}
