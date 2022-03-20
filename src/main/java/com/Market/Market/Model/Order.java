package com.Market.Market.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Order {
    //ID - Уникальный идентификатор int(5)
    @JsonProperty("id")
    private long id;
    //Customer - Заказчик
    @JsonProperty("costumer")
    private Customer costumer;
    //List <Product> - Список продуктов
    @JsonProperty("productList")
    private List<Product> productList;


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", costumer=" + costumer +
                ", productList=" + productList +
                '}';
    }
}
