package com.example.ProductService.contoller;

import com.example.ProductService.dto.ProductPostDTO;
import com.example.ProductService.dto.ProductRequestDTO;
import com.example.ProductService.dto.ProductResponseDTO;
import com.example.ProductService.entity.Product;
import com.example.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;

    //For service 2
    @GetMapping(path = "/serviceCalls/")
    public List<Product> getProductsByPids(@RequestParam ArrayList<Long> arrOfP) {
        System.out.println("Akshays");
        return productService.getProductsByPids(arrOfP);
    }

    //For client product page
    @GetMapping(path = "/getProducts")
    public ArrayList<ProductResponseDTO> showProducts() {
        return productService.showProducts();
    }

    //Post

    @PostMapping(path = "Add")
    public ProductResponseDTO addProducts(@RequestBody ProductPostDTO request){
        return productService.addProducts(request);}
}
