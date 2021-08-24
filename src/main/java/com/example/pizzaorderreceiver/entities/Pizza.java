package com.example.pizzaorderreceiver.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class Pizza {
    public Long id;
    public String name;
    public Integer price;
    public String ingridients;
}
