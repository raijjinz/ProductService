package com.example.ProductService.contoller;

import com.example.ProductService.dto.ProductResponseDTO;
import com.example.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;

    //For service 2
    @GetMapping(path = "/serviceCalls")
    public ArrayList<ProductResponseDTO> getProductsByPids(@RequestBody ArrayList<Long> arrOfP) {
        return productService.getProductsByPids(arrOfP);
    }

    //For client product page
    @GetMapping(path = "/getProducts")
    public ArrayList<ProductResponseDTO> showProducts() {
        return productService.showProducts();
    }
}
