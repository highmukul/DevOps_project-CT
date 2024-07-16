package com.highmukul.CTproject.Repository;

import com.highmukul.CTproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
