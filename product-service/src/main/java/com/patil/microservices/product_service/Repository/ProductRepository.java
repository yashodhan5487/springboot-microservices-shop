package com.patil.microservices.product_service.Repository;

import com.patil.microservices.product_service.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
