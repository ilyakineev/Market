package com.Market.Market.Service;


import com.Market.Market.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class AbstractProductRepositoryTest {
    public static final Product PRODUCT_ADD;
    public static final Product PRODUCT_GET_BY_ID;
    public static final Product PRODUCT_UPDATE;
    public static final Product PRODUCT_REMOVE;

    public static final List<Product> PRODUCTS;

    static {
        PRODUCT_ADD = new Product(98, 98 / 2, "Product" + 98, "URL", (double) 1 * 1000, "Ок");
        PRODUCT_GET_BY_ID = new Product(99, 99 / 2, "Product" + 99, "URL", (double) 2 * 1000, "Ок");
        PRODUCT_UPDATE = new Product(100, 100 / 2, "Product" + 100, "URL", (double) 3 * 1000, "Ок");
        PRODUCT_REMOVE = new Product(101, 101 / 2, "Product" + 101, "URL", (double) 4 * 1000, "Ок");
        PRODUCTS = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            PRODUCTS.add(new Product(i, i / 2, "Product" + i, "URL", (double) i * 1000, "Ок"));
        }
    }
}
