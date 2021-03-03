package com.example.ProductService.dto;

import lombok.Data;

@Data
public class ProductResponseDTO {
    private Long id;
    private String product_name;
    private Long price;
    private String imgsrc;
}
