package com.Market.Market.Repository.iml;

import com.Market.Market.Model.Customer;
import com.Market.Market.Model.Order;
import com.Market.Market.Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AbstractRepository {

    // Временное хранилище Клиентов
    public static final List<Customer> CUSTOMERS;

    static {
        CUSTOMERS = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CUSTOMERS.add(new Customer(i, "Name" + i, "+7(999)0000000" + i, "email@email" + i + ".com", "Примечание"));
        }
    }

    // Временное хранилище товаров

    public static final List<Product> PRODUCTS;

    static {
        PRODUCTS = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            PRODUCTS.add(new Product(i, i / 2, "Product" + i, "URL", (double) i * 1000, "Ок"));
        }
    }

    // Временное хранилище Заказов

    public static final List<Order> ORDERS;

    static {
        ORDERS = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ORDERS.add(new Order(i,
                    new Customer(i, "Name" + i, "+7(999)0000000" + i, "email@email" + i + ".com", "Address" + 1),
                    getRandomProduct()
            ));
        }
    }

    private static List<Product> getRandomProduct(){
        Random random = new Random();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5); i++) {
            products.add(new Product(i, i / 2, "Product" + i, "URL", (double) i * 1000, "Ок"));
        }
        return products;
    }
}
