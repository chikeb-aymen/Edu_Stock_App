package org.sid.inventoryservice.controllers;

import lombok.AllArgsConstructor;
import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllCustomer(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getCustomerById(@PathVariable("id") Long id){
        return productRepository.findById(id).get();
    }
}
