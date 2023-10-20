package com.itsrdb.productservice.service;

import com.itsrdb.productservice.dto.ProductRequest;
import com.itsrdb.productservice.model.Product;
import com.itsrdb.productservice.repository.ProductRespository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRespository productRespository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRespository.save(product);
        log.info("Product {} is Saved", product.getId());
    }
}
