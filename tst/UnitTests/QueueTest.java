package UnitTests;

import Entities.Item;
import Entities.Order;
import Entities.Queue;
import Entities.Type;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    @Test
    public void instantiateQueue_AddOrder_OrderAdded(){
        Item item = new Item(Type.BURGUER, 2, "Hamburgão");
        Item[] orderedItems = {item};
        Order order = new Order(orderedItems);
        Queue queue = new Queue();
        Assert.assertNotNull(queue);
        queue.add(order);
        Assert.assertEquals(order, queue.getOrders().get(0));
    }

    @Test
    public void instantiateQueue_DeliverOldest_OrderRemoved(){
        Item item = new Item(Type.BURGUER, 2, "Hamburgão");
        Item[] orderedItems = {item};
        Order order1 = new Order(orderedItems);
        Order order2 = new Order(orderedItems);
        Queue queue = new Queue();
        queue.add(order1);
        queue.add(order2);
        queue.deliverOldest();
        Assert.assertFalse(queue.getOrders().contains(order1));
        Assert.assertTrue(queue.getOrders().contains(order2));
    }
}