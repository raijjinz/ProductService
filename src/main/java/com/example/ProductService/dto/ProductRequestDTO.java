package com.example.ProductService.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ProductRequestDTO {
    private ArrayList<Long> listOfPids;
}
