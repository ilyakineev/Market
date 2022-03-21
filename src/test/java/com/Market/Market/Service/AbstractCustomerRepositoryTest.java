package com.Market.Market.Service;


import com.Market.Market.Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AbstractCustomerRepositoryTest {

    public static final Customer CUSTOMER_ADD;
    public static final Customer CUSTOMER_GET_BY_ID;
    public static final Customer CUSTOMER_UPDATE;
    public static final Customer CUSTOMER_REMOVE;

    public static final List<Customer> CUSTOMERS;

    static {
        CUSTOMER_ADD = new Customer(99, "Name" + 99, "+7(999)0000000" + 9, "email@email" + 99 + ".com", "Примечание");
        CUSTOMER_GET_BY_ID = new Customer(100, "Name" + 100, "+7(999)0000000" + 0, "email@email" + 100 + ".com", "Примечание");
        CUSTOMER_UPDATE = new Customer(98, "Name" + 98, "+7(999)0000000" + 0, "email@email" + 98 + ".com", "Примечание");
        CUSTOMER_REMOVE = new Customer(101, "Name" + 101, "+7(999)0000000" + 0, "email@email" + 101 + ".com", "Примечание");
        CUSTOMERS = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CUSTOMERS.add(new Customer(i, "Name" + i, "+7(999)0000000" + i, "email@email" + i + ".com", "Примечание"));
        }
    }
}
