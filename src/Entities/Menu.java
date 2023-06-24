package Entities;

import java.util.List;

public class Menu {
    protected List<Item> items;

    public Menu(List<Item> items) {
        validateItems(items);
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    private void validateItems(List<Item> items) {
        if (items == null || items.size() == 0) {
            throw new IllegalArgumentException("A lista de itens não pode ser nula ou vazia.");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Item item : items) {
            builder.append(items.indexOf(item) + 1 + item.toString()).append("\n");
        }

        return builder.toString();
    }
}
