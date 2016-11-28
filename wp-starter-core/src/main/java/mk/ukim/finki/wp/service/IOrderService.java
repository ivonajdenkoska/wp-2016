package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Order;

public interface IOrderService {

    public Order placeOrder(String pizzaType, String clientName, String address);

}