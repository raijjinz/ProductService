package com.example.ProductService.service;

import com.example.ProductService.dto.ProductResponseDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ProductService {
    ArrayList<ProductResponseDTO> getProductsByPids(ArrayList<Long> arrOfP);

    ArrayList<ProductResponseDTO> showProducts();
}


