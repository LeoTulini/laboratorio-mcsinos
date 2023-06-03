package Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Queue {
    protected List<Order> orders  = new ArrayList<>();

    public Queue() {
    }

    public void add(Order order){
        this.orders.add(order);
    }

    public void deliverOldest(){
        this.orders.remove(this.orders.size() - 1);
    }

    // ToString devolver a fila formatadinha com os pedidos
}
