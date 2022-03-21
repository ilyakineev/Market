package com.Market.Market.Repository.iml;

import com.Market.Market.Model.Order;
import com.Market.Market.Repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryImp extends AbstractRepository implements OrderRepository {

    @Override
    public List<Order> getAllOrder() {
        return ORDERS;
    }

    @Override
    public long getValueOrder() {
        return ORDERS.size();
    }

    @Override
    public boolean updateOrder(int id, Order order) {
        ORDERS.set(id, order);
        return true;
    }

    @Override
    public Order getOrderById(int id) {
        return ORDERS.get(id);
    }

    @Override
    public boolean addOrder(Order order) {
        ORDERS.add(order);
        return true;
    }

    @Override
    public boolean removeOrder(Order order) {
        ORDERS.remove(order);
        return true;
    }
}