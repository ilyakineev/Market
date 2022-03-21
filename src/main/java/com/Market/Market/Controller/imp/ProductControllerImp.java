package com.Market.Market.Controller.imp;

import com.Market.Market.Controller.ProductController;
import com.Market.Market.Model.Product;
import com.Market.Market.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerImp implements ProductController {

    ProductService productService;

    @Autowired
    public ProductControllerImp(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public boolean addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @Override
    public Product getProductById(@PathVariable(value = "id") long id) {
        return productService.getProductById(id);
    }

    @Override
    public boolean updateProduct(@PathVariable(value = "id") long id, @RequestBody Product product) {
        return productService.updateProduct(id,product);
    }

    @Override
    public boolean removeProductById(@PathVariable(value = "id") long id) {
        return productService.removeProductById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @Override
    public long getValueProduct() {
        return productService.getValueProduct();
    }
}
