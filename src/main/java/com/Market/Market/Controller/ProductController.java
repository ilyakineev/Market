package com.Market.Market.Controller;

import com.Market.Market.Model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/product")
public interface ProductController {
    //Добавить Product
    @PostMapping("/add")
    boolean addProduct(Product product);

    //Найти Product
    @GetMapping("/get/{id}")
    Product getProductById(long id);

    //Изменить Product
    @PostMapping("/update/{id}")
    boolean updateProduct(long id, Product product);

    //Удалить Product
    @GetMapping("/remove/{id}")
    boolean removeProductById(long id);

    //Получить все Products
    @GetMapping("/getall")
    List<Product> getAllProduct();

    //Получить число Products
    @GetMapping("/value")
    long getValueProduct();
}
