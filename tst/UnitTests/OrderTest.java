package UnitTests;

import Entities.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    @Test
    public void instantiateOrder_ValidArguments_NewOrder(){
        Item item = new Item(Type.BURGUER, 2, "Hamburgão");
        Item[] orderedItems = {item};
        Order order = new Order(orderedItems);
        Assert.assertNotNull(order);
        Assert.assertArrayEquals(orderedItems, order.getOrdered());
    }














}
