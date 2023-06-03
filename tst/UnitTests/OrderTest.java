package UnitTests;

import Entities.Item;
import Entities.Menu;
import Entities.Order;
import Entities.Queue;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {
    private static Queue createQueue(Menu menu){
        Queue queue = new Queue();

        List<Item> items1 = new ArrayList<>();
        items1.add(menu.getItems().get(0));
        items1.add(menu.getItems().get(5));

        List<Item> items2 = new ArrayList<>();
        items1.add(menu.getItems().get(1));
        items1.add(menu.getItems().get(4));

        List<Item> items3 = new ArrayList<>();
        items1.add(menu.getItems().get(2));
        items1.add(menu.getItems().get(3));

        Order order1 = new Order(items1.toArray(new Item[2]));
        Order order2 = new Order(items2.toArray(new Item[2]));
        Order order3 = new Order(items3.toArray(new Item[2]));

        queue.add(order1);
        queue.add(order2);
        queue.add(order3);

        return queue;
    }
}
