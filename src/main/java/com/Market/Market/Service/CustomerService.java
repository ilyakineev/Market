package com.Market.Market.Service;

import com.Market.Market.Model.Customer;
import com.Market.Market.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public boolean addCustomer(Customer customer) {
        return customerRepository.addCustomer(customer);
    }

    public Customer getCustomerById(long id) {
        return customerRepository.getCustomerById((int) id);
    }

    public boolean updateCustomer(long id, Customer customer) {
        return customerRepository.updateCustomer((int) id, customer);
    }

    public boolean removeCustomerById(long id) {
        return customerRepository.removeCustomer(getCustomerById(id));
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

    public long getValueCustomer() {
        return customerRepository.getSize();
    }
}