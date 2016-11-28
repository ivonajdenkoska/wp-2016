package mk.ukim.finki.wp.model;

public class Order {
    private String pizzaType;
    private String clientName;
    private String clientAddress;
    private Long orderId;

    public Order(String pizzaType, String clientName, String clientAddress, Long orderId){
        this.pizzaType = pizzaType;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.orderId = orderId;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public Long getOrderId() {
        return orderId;
    }
}