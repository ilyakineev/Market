package com.Market.Market.Controller.imp;

import com.Market.Market.Controller.OrderController;
import com.Market.Market.Model.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderControllerImp implements OrderController {
    @Override
    public boolean addOrder(@RequestBody Order order) {
        System.out.println(order.toString());
        return false;
    }

    @Override
    public Order getOrderById(@PathVariable(value = "id") long id) {
        return null;
    }

    @Override
    public boolean updateOrder(@PathVariable(value = "id") long id, @RequestBody Order order) {
        System.out.println(order.toString());
        return false;
    }

    @Override
    public boolean removeOrderById(@PathVariable(value = "id") long id) {
        return false;
    }

    @Override
    public List<Order> getAllOrder() {
        return null;
    }

    @Override
    public long getValueOrder() {
        return 0;
    }
}
