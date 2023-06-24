package Entities;

public class Order {
    protected Item[] orderedItems;

    public Order(Item[] ordered) {
        this.orderedItems = ordered;
    }

    public Item[] getOrderedItems() {
        return orderedItems;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Item ordered: orderedItems) {
            builder.append(ordered.toString());
        }

        return builder.toString();
    }
}
