package com.jainesantos.desafio1.services;

import com.jainesantos.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double amount = 0;
        if (order.getBasic() < 100) {
            amount = 20;
        } else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
            amount = 12;
        }
        return amount;
    }
}