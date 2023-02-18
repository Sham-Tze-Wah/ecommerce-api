package com.programmingtechie.productservice.repository;

import com.programmingtechie.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repositoryry.MongoRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
