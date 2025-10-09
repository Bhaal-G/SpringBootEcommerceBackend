package com.ecommerce.project.service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.ProductDTO;
import org.springframework.stereotype.Service;

public interface ProductService {
    ProductDTO addProduct(java.lang.Long categoryId, Product product);
}
