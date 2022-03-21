package com.Market.Market.Repository;

import com.Market.Market.Model.Customer;

import java.util.List;

public interface CustomerRepository {
    boolean addCustomer(Customer customer);
    Customer getCustomerById(int id);
    boolean updateCustomer(int id, Customer customer);
    boolean removeCustomer(Customer customer);
    List<Customer> getAllCustomer();
    long getSize();
}
