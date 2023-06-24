package Entities;

public class Item {
    protected Type type;
    protected int quantity;
    protected String name;
    protected boolean isForMenu;

    public Item(Type type, String name, boolean isForMenu) {
        if (!isForMenu) {
            validate(quantity);
        }
        this.type = type;
        this.name = name;
        quantity = 0;
    }

    public Item(Type type, int quantity, String name) {
        validate(quantity);
        this.type = type;
        this.quantity = quantity;
        this.name = name;
    }

    @Override
    public String toString() {
        String result = "\nTipo: {" + this.type + "}\n" +
                        "Nome: {" + this.name + "}\n";

        if (this.quantity > 0) {
            result = result.concat("Quantidade:{" + this.quantity + "}\n");
        }

        return result;
    }

    public void setQuantity(int quantity) {
        validate(quantity);
        this.quantity = quantity;
    }

    private void validate(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("A quantidade de itens não pode ser zero ou negativa.");
        }
    }
}
