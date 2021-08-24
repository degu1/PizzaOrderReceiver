package com.example.pizzaorderreceiver.entities;


import lombok.Data;

import java.sql.Timestamp;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
public class PizzaOrder {
    //  @Id
    //  @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    Integer[] pizzaIds;
    Timestamp timestamp;



}
