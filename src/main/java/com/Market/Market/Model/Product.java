package com.Market.Market.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * см. класс Customer
 */

@Data
@NoArgsConstructor
@ToString
public class Product {
    //ID - Уникальный идентификатор int(5)
    @JsonProperty("id")
    private long id;
    //CatID - Идентификатор категории int(5)
    @JsonProperty("CatId")
    private int CatId;
    //Name - Название товара varchar(50)
    @JsonProperty("name")
    private String name;
    //Link - Ссылка на изображения товара varchar(200)
    @JsonProperty("link")
    private String link;
    //Price - Цена товара int(5)
    @JsonProperty("price")
    private double price;
    //Description - Описание товара tinytext(200)
    @JsonProperty("description")
    private String description;

    public Product(int catId, String name, String link, double price, String description) {
        CatId = catId;
        this.name = name;
        this.link = link;
        this.price = price;
        this.description = description;
    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", CatId=" + CatId +
//                ", name='" + name + '\'' +
//                ", link='" + link + '\'' +
//                ", price=" + price +
//                ", description='" + description + '\'' +
//                '}';
//    }
}
