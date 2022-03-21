package com.Market.Market.Service;

import com.Market.Market.Repository.CustomerRepository;
import com.Market.Market.Repository.iml.CustomerRepositoryImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CustomerServiceTest extends AbstractCustomerRepositoryTest {

    CustomerService customerService;

    CustomerRepository customerRepositoryMock;

    public CustomerServiceTest() {
        customerRepositoryMock = mock(CustomerRepositoryImp.class);
        this.customerService = new CustomerService(customerRepositoryMock);
    }

    @Test
    void addCustomer() {
        when(customerRepositoryMock.addCustomer(CUSTOMER_ADD)).thenReturn(true);
        Assertions.assertEquals(customerService.addCustomer(CUSTOMER_ADD), true);
    }

    @Test
    void getCustomerById() {
        when(customerRepositoryMock.getCustomerById(100)).thenReturn(CUSTOMER_GET_BY_ID);
        Assertions.assertEquals(customerService.getCustomerById(100), CUSTOMER_GET_BY_ID);
    }

    @Test
    void updateCustomer() {
        when(customerRepositoryMock.updateCustomer(98,CUSTOMER_UPDATE)).thenReturn(true);
        Assertions.assertEquals(customerService.updateCustomer(98,CUSTOMER_UPDATE),true);
    }

    @Test
    void removeCustomerById() {
        when(customerRepositoryMock.getCustomerById(101)).thenReturn(CUSTOMER_REMOVE);
        when(customerRepositoryMock.removeCustomer(CUSTOMER_REMOVE)).thenReturn(true);
        Assertions.assertEquals(customerService.removeCustomerById(101),true);
    }

    @Test
    void getAllCustomer() {
        when(customerRepositoryMock.getAllCustomer()).thenReturn(CUSTOMERS);
        Assertions.assertEquals(customerService.getAllCustomer(), CUSTOMERS);
    }

    @Test
    void getValueCustomer() {
        when(customerRepositoryMock.getSize()).thenReturn((long) CUSTOMERS.size());
        Assertions.assertEquals(customerService.getValueCustomer(), CUSTOMERS.size());
    }
}