package Entities;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    protected List<Order> orders  = new ArrayList<>();

    public Queue() {
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void add(Order order){
        this.orders.add(order);
    }

    public void deliverOldest(){
        this.orders.remove(0);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Fila:\n");

        for (int i = 0; i < orders.size(); i++) {
            builder.append("Pedido ").append(i+1).append(": ").append(orders.get(i).toString()).append("\n");
        }

        return builder.toString();
    }
}
