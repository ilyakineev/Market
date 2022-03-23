package com.Market.Market.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Что за аннотации @JsonProperty? Если это @Entity: @Column(name = "name")...
 * Метод toString можно аннтацией сделать, будет корректно. Если стандатрное переопределение.
 * Добавил геттеры, сеттеры и два конструктурра (один без id -> id будет сама БД генерировать)
 */

@Data
@NoArgsConstructor
@ToString
public class Customer {
    //ID - Уникальный идентификатор int(5)
    @JsonProperty("id")
    private long id;
    //Name - Фамилия пользователя varchar(50)
    @JsonProperty("name")
    private String name;
    //Phone Number - Номер телефона varchar(50)
    @JsonProperty("number")
    private String number;
    //Email - Электронная почта пользователя varchar(50)
    @JsonProperty("email")
    private String email;
    //Address - Адрес доставки varchar(256)
    @JsonProperty("address")
    private String address;

    public Customer(String name, String number, String email, String address) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
    }

//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", number='" + number + '\'' +
//                ", email='" + email + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
