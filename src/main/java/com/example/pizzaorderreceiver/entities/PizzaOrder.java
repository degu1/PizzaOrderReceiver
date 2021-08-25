package com.example.pizzaorderreceiver.entities;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PizzaOrder {

    Long id;
    String name;
    Integer[] pizzaIds;
    Timestamp timestamp;


}
