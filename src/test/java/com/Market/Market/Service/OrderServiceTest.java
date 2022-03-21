package com.Market.Market.Service;

import com.Market.Market.Repository.OrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderServiceTest extends AbstractOrderRepositoryTest {

    OrderService orderService;

    OrderRepository orderRepositoryMock;

    public OrderServiceTest() {
        orderRepositoryMock = mock(OrderRepository.class);
        this.orderService = new OrderService(orderRepositoryMock);
    }

    @Test
    void addOrder() {
        when(orderRepositoryMock.addOrder(ORDER_ADD)).thenReturn(true);
        Assertions.assertEquals(orderService.addOrder(ORDER_ADD), true);
    }

    @Test
    void getOrderById() {
        when(orderRepositoryMock.getOrderById(100)).thenReturn(ORDER_GET_BY_ID);
        Assertions.assertEquals(orderService.getOrderById(100), ORDER_GET_BY_ID);
    }

    @Test
    void updateOrder() {
        when(orderRepositoryMock.updateOrder(100,ORDER_UPDATE)).thenReturn(true);
        Assertions.assertEquals(orderService.updateOrder(100,ORDER_UPDATE),true);
    }

    @Test
    void removeOrderById() {
        when(orderRepositoryMock.getOrderById(101)).thenReturn(ORDER_REMOVE);
        when(orderRepositoryMock.removeOrder(ORDER_REMOVE)).thenReturn(true);
        Assertions.assertEquals(orderService.removeOrderById(101), true);
    }

    @Test
    void getAllOrder() {
        when(orderRepositoryMock.getAllOrder()).thenReturn(ORDERS);
        Assertions.assertEquals(orderService.getAllOrder(), ORDERS);
    }

    @Test
    void getValueOrder() {
        when(orderService.getValueOrder()).thenReturn((long) ORDERS.size());
        Assertions.assertEquals(orderService.getValueOrder(), ORDERS.size());
    }
}