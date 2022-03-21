package com.Market.Market.Service;

import com.Market.Market.Model.Order;
import com.Market.Market.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public boolean addOrder(Order order) {
        return orderRepository.addOrder(order);
    }

    public Order getOrderById(long id) {
        return orderRepository.getOrderById((int) id);
    }

    public boolean updateOrder(long id, Order order) {
        return orderRepository.updateOrder((int) id, order);
    }

    public boolean removeOrderById(long id) {
        return orderRepository.removeOrder(getOrderById(id));
    }

    public List<Order> getAllOrder() {
        return orderRepository.getAllOrder();
    }

    public long getValueOrder() {
        return orderRepository.getValueOrder();
    }
}