package com.Market.Market.Repository;

import com.Market.Market.Model.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> getAllOrder();
    long getValueOrder();
    boolean updateOrder(int id, Order order);
    Order getOrderById(int id);
    boolean addOrder(Order order);
    boolean removeOrder(Order order);
}
