package com.Market.Market.Repository.iml;

import com.Market.Market.Model.Customer;
import com.Market.Market.Repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImp extends AbstractRepository implements CustomerRepository {

    @Override
    public boolean addCustomer(Customer customer) {
        CUSTOMERS.add(customer);
        return true;
    }

    @Override
    public Customer getCustomerById(int id) {
        return CUSTOMERS.get(id);
    }

    @Override
    public boolean updateCustomer(int id, Customer customer) {
        CUSTOMERS.set(id, customer);
        return true;
    }

    @Override
    public boolean removeCustomer(Customer customer) {
        return CUSTOMERS.remove(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return CUSTOMERS;
    }

    @Override
    public long getSize() {
        return CUSTOMERS.size();
    }
}