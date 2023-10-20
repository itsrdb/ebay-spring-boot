package com.itsrdb.productservice.repository;

import com.itsrdb.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRespository extends MongoRepository<Product, String> {
    
}
