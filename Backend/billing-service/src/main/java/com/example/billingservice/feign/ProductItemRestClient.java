package com.example.billingservice.feign;

import com.example.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "INVENTORY-SERVICE")
public interface ProductItemRestClient {
    @GetMapping(path = "/api/v1/products")
    PagedModel<Product> pageProducts();
    @GetMapping(path = "/api/v1/products/{id}")
    Product getProductById(@PathVariable Long id);
}
