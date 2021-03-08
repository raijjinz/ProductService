package com.example.ProductService.service;

import com.example.ProductService.dto.ProductPostDTO;
import com.example.ProductService.dto.ProductRequestDTO;
import com.example.ProductService.dto.ProductResponseDTO;
import com.example.ProductService.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> getProductsByPids(ArrayList<Long> arrOfP);

    ArrayList<ProductResponseDTO> showProducts();

    ProductResponseDTO addProducts(ProductPostDTO requestDTO);
}


