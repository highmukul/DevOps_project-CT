package com.highmukul.CTproject;

import com.highmukul.CTproject.model.Product;
import com.highmukul.CTproject.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("Product 1", "Description 1", "Usage Instructions 1", "Safety Precautions 1"));
        productRepository.save(new Product("Product 2", "Description 2", "Usage Instructions 2", "Safety Precautions 2"));
    }
}