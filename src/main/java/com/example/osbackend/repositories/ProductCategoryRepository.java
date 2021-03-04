package com.example.osbackend.repositories;

import com.example.osbackend.models.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>, JpaSpecificationExecutor<ProductCategory> {

}