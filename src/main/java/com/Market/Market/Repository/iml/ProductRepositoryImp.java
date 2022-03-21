package com.Market.Market.Repository.iml;

import com.Market.Market.Model.Product;
import com.Market.Market.Repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImp extends AbstractRepository implements ProductRepository {

    @Override
    public long getAllValue() {
        return PRODUCTS.size();
    }

    @Override
    public List<Product> getAllProduct() {
        return PRODUCTS;
    }

    @Override
    public boolean addProduct(Product product) {
        PRODUCTS.add(product);
        return true;
    }

    @Override
    public Product getProductById(int id) {
        return PRODUCTS.get(id);
    }

    @Override
    public boolean updateProduct(int id, Product product) {
        PRODUCTS.set(id,product);
        return true;
    }

    @Override
    public boolean removeProduct(Product product) {
        PRODUCTS.remove(product);
        return true;
    }
}