package com.Market.Market.Controller.imp;

import com.Market.Market.Controller.ProductController;
import com.Market.Market.Model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerImp implements ProductController {
    @Override
    public boolean addProduct(@RequestBody Product product) {
        System.out.println(product.toString());
        return false;
    }

    @Override
    public Product getProductById(@PathVariable(value = "id") long id) {
        return null;
    }

    @Override
    public boolean updateProduct(@PathVariable(value = "id") long id, @RequestBody Product product) {
        System.out.println(product.toString());
        return false;
    }

    @Override
    public boolean removeProductById(@PathVariable(value = "id") long id) {
        return false;
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public long getValueProduct() {
        return 0;
    }
}
