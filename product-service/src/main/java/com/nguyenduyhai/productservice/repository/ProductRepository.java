package com.nguyenduyhai.productservice.repository;

import com.nguyenduyhai.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  ProductRepository extends MongoRepository<Product, String> {
}
