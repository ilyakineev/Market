package com.Market.Market.Controller;

import com.Market.Market.Model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/order")
public interface OrderController {
    //Добавить Order
    @PostMapping("/add")
    boolean addOrder(Order order);

    //Найти Order
    @GetMapping("/get/{id}")
    Order getOrderById(long id);

    //Изменить Order
    @PostMapping("/update/{id}")
    boolean updateOrder(long id, Order order);

    //Удалить Order
    @GetMapping("/remove/{id}")
    boolean removeOrderById(long id);

    //Получить все Order
    @GetMapping("/getall")
    List<Order> getAllOrder();

    //Получить число Order
    @GetMapping("/value")
    long getValueOrder();
}
