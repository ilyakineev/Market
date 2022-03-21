package com.Market.Market.Repository;

import com.Market.Market.Model.Product;

import java.util.List;

public interface ProductRepository {
    long getAllValue();
    List<Product> getAllProduct();
    boolean addProduct(Product product);
    Product getProductById(int id);
    boolean updateProduct(int id, Product product);
    boolean removeProduct(Product product);
}
