package com.example.ProductService.service.impl;

import com.example.ProductService.dto.ProductPostDTO;
import com.example.ProductService.dto.ProductRequestDTO;
import com.example.ProductService.dto.ProductResponseDTO;
import com.example.ProductService.entity.Product;
import com.example.ProductService.repository.ProductRepository;
import com.example.ProductService.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;



    @Override
    public List<Product> getProductsByPids(ArrayList<Long> arrOfP){
//        ArrayList<ProductResponseDTO> ResponseArr = new ArrayList<>();
//        arrOfP.forEach((id) -> {
//
//            Optional<Product> productOptional = productRepository.findById(id);
//            if (productOptional.isPresent()) {
//                ProductResponseDTO productResponseDTO = new ProductResponseDTO();
//                BeanUtils.copyProperties(productOptional.get(), productResponseDTO);
//                ResponseArr.add(productResponseDTO);
//                //return productResponseDTO;
//            }
//        });

//        return ResponseArr;
        List<Product> QueryArr = productRepository.queryProducts(arrOfP);

        System.out.println(QueryArr);
        return QueryArr;



        }


        @Override
     public ArrayList<ProductResponseDTO> showProducts(){
         ArrayList<ProductResponseDTO> ResponseArr = new ArrayList<>();
         Iterable<Product> productOptional = productRepository.findAll();
         productOptional.forEach((product -> {
             ProductResponseDTO productResponseDTO =new ProductResponseDTO();
             BeanUtils.copyProperties(product,productResponseDTO);


             ResponseArr.add(productResponseDTO);
         }));

         return ResponseArr;



     }


    @Override
    public ProductResponseDTO addProducts(ProductPostDTO requestDTO)
    {

        Product product = new Product();
        BeanUtils.copyProperties(requestDTO, product);
        Product savedProduct = productRepository.save(product);
        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        BeanUtils.copyProperties(savedProduct, productResponseDTO);

        return productResponseDTO;


    }
}




