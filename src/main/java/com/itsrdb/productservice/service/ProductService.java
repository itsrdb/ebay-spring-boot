package com.itsrdb.productservice.service;

import com.itsrdb.productservice.dto.ProductRequest;
import com.itsrdb.productservice.model.Product;
import com.itsrdb.productservice.repository.ProductRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRespository productRespository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
    }
}
