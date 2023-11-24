package com.devstarrk.dscommerce.repositories;

import com.devstarrk.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
