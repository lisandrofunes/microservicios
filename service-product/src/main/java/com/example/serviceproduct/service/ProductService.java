package com.example.serviceproduct.service;

import java.util.List;

import com.example.serviceproduct.entity.Category;
import com.example.serviceproduct.entity.Product;

public interface ProductService {
    public List<Product> listAllProducts();
    public Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);
}
