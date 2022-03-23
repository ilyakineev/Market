package com.Market.Market.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * см. класс Customer
 */

@Data
@NoArgsConstructor
@ToString
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

    public Order(Customer costumer, List<Product> productList) {
        this.costumer = costumer;
        this.productList = productList;
    }


//    @Override
//    public String toString() {
//        return "Order{" +
//                "id=" + id +
//                ", costumer=" + costumer +
//                ", productList=" + productList +
//                '}';
//    }
}
