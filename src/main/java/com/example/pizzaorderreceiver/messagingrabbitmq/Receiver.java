package com.example.pizzaorderreceiver.messagingrabbitmq;

import com.example.pizzaorderreceiver.entities.PizzaOrder;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class Receiver {

    public void receiveMessage(String order) {
        Gson gson = new Gson();
        PizzaOrder pizzaOrder = gson.fromJson(order, PizzaOrder.class);
        pizzaOrder.setTimestamp(new Timestamp(System.currentTimeMillis()));

        System.out.println(pizzaOrder);
    }
}

