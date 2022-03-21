package com.Market.Market.Service;

import com.Market.Market.Model.Product;
import com.Market.Market.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    public Product getProductById(long id) {
        return productRepository.getProductById((int) id);
    }

    public boolean updateProduct(long id, Product product) {
        return productRepository.updateProduct((int) id, product);
    }

    public boolean removeProductById(long id) {
        return productRepository.removeProduct(getProductById(id));
    }

    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    public long getValueProduct() {
        return productRepository.getAllValue();
    }
}