package com.Market.Market.Controller.imp;

import com.Market.Market.Controller.CustomerController;
import com.Market.Market.Model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerControllerImp implements CustomerController {
    @Override
    public boolean addCustomer(@RequestBody Customer customer) {
        System.out.println(customer.toString());
        return true;
    }

    @Override
    public Customer getCustomerById(@PathVariable(value = "id") long id) {
        return null;
    }

    @Override
    public boolean updateCustomer(@PathVariable(value = "id") long id, @RequestBody Customer customer) {
        System.out.println(customer.toString());
        return true;
    }

    @Override
    public boolean removeCustomerById(@PathVariable(value = "id") long id) {
        return false;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return null;
    }

    @Override
    public long getValueCustomer() {
        return 0;
    }
}
