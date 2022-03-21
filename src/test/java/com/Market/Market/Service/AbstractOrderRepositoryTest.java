package com.Market.Market.Service;


import com.Market.Market.Model.Customer;
import com.Market.Market.Model.Order;
import com.Market.Market.Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AbstractOrderRepositoryTest {
    public static final Order ORDER_ADD;
    public static final Order ORDER_GET_BY_ID;
    public static final Order ORDER_UPDATE;
    public static final Order ORDER_REMOVE;

    public static final List<Order> ORDERS;

    static {

        ORDER_ADD = new Order(98, new Customer(98, "Name" + 98, "+7(999)0000000" + 8, "email@email" + 98 + ".com", "Address" + 1), getRandomProduct());
        ORDER_GET_BY_ID = new Order(99, new Customer(99, "Name" + 99, "+7(999)0000000" + 99, "email@email" + 99 + ".com", "Address" + 2), getRandomProduct());
        ORDER_UPDATE = new Order(100, new Customer(100, "Name" + 100, "+7(999)0000000" + 100, "email@email" + 100 + ".com", "Address" + 3), getRandomProduct());
        ORDER_REMOVE = new Order(101, new Customer(101, "Name" + 101, "+7(999)0000000" + 101, "email@email" + 101 + ".com", "Address" + 4), getRandomProduct());
        ORDERS = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ORDERS.add(new Order(i,
                    new Customer(i, "Name" + i, "+7(999)0000000" + i, "email@email" + i + ".com", "Address" + 1),
                    getRandomProduct()
            ));
        }
    }

    private static List<Product> getRandomProduct() {
        Random random = new Random();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5); i++) {
            products.add(new Product(i, i / 2, "Product" + i, "URL", (double) i * 1000, "Ок"));
        }
        return products;
    }
}
