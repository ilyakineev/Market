package com.Market.Market.Controller;

import com.Market.Market.Model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/customer")
public interface CustomerController {
    //Добавить Customer
    @PostMapping("/add")
    boolean addCustomer(Customer customer);

    //Найти Customer
    @GetMapping("/get/{id}")
    Customer getCustomerById(long id);

    //Изменить Customer
    @PostMapping("/update/{id}")
    boolean updateCustomer(long id, Customer customer);

    //Удалить Customer
    @GetMapping("/remove/{id}")
    boolean removeCustomerById(long id);

    //Получить все Customers
    @GetMapping("/getall")
    List<Customer> getAllCustomer();

    //Получить число Customers
    @GetMapping("/value")
    long getValueCustomer();
}
