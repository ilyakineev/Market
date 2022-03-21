package com.Market.Market.Controller.imp;

import com.Market.Market.Controller.OrderController;
import com.Market.Market.Model.Order;
import com.Market.Market.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderControllerImp implements OrderController {

    OrderService orderService;

    @Autowired
    public OrderControllerImp(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public boolean addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @Override
    public Order getOrderById(@PathVariable(value = "id") long id) {
        return orderService.getOrderById(id);
    }

    @Override
    public boolean updateOrder(@PathVariable(value = "id") long id, @RequestBody Order order) {
        return orderService.updateOrder(id,order);
    }

    @Override
    public boolean removeOrderById(@PathVariable(value = "id") long id) {
        return orderService.removeOrderById(id);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderService.getAllOrder();
    }

    @Override
    public long getValueOrder() {
        return orderService.getValueOrder();
    }
}
