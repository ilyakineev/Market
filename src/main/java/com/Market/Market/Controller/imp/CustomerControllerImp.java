package com.Market.Market.Controller.imp;

import com.Market.Market.Controller.CustomerController;
import com.Market.Market.Model.Customer;
import com.Market.Market.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerControllerImp implements CustomerController {

    CustomerService customerService;

    @Autowired
    public CustomerControllerImp(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public boolean addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @Override
    public Customer getCustomerById(@PathVariable(value = "id") long id) {
        return customerService.getCustomerById(id);
    }

    @Override
    public boolean updateCustomer(@PathVariable(value = "id") long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @Override
    public boolean removeCustomerById(@PathVariable(value = "id") long id) {
        return customerService.removeCustomerById(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @Override
    public long getValueCustomer() {
        return customerService.getValueCustomer();
    }
}
