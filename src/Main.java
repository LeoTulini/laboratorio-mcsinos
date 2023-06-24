import Entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Menu menu;
    private static Queue queue = new Queue();

    public static void main(String[] args) {
        menu = createMenu();

        int chosenOption = 0;
        while (chosenOption != 4) {
            try {

                printMainMenuOptions();
                chosenOption = scanner.nextInt();

                if (chosenOption <= 0 || chosenOption > 4) {
                    throw new IllegalArgumentException("Opção inválida! Tente outra.");
                }

                printChosenOptionMenu(chosenOption);

            } catch (IllegalArgumentException ex) {
                System.out.printf(ex.getMessage());
            }
        }
    }

    private static Menu createMenu() {
        Item item1 = new Item(Type.BURGUER, "McSinos", true);
        Item item2 = new Item(Type.BURGUER, "FeeCheddar", true);
        Item item3 = new Item(Type.BURGUER, "BUFRGS", true);
        Item item4 = new Item(Type.BEVERAGE, "Coca Gelada", true);
        Item item5 = new Item(Type.BEVERAGE, "Cerveja velha", true);
        Item item6 = new Item(Type.BEVERAGE, "Sobra de Ketchup", true);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);

        return new Menu(items);
    }

    public static void printMainMenuOptions() {
        System.out.println("""
                \n
                Escolha o que deseja fazer:
                1 - Mostrar fila de pedidos
                2 - Fazer um pedido
                3 - Entregar o pedido mais antigo
                4 - Encerrar seu turno
                """);
    }

    public static void printChosenOptionMenu(int chosenOption) {
        switch (chosenOption) {
            case 1 -> System.out.println(queue.toString());
            case 2 -> printOrderingMenu();
            case 3 -> queue.deliverOldest();
        }
    }

    public static void printOrderingMenu() {
        int chosenOption = -1;
        ArrayList<Item> items = new ArrayList<>();

        while (chosenOption != 0) {
            if (items.size() == 0) {
                System.out.print("Escolha um item do cardápio para adicionar ao seu pedido:\n");
            }

            System.out.println(menu.toString());
            items.add(menu.getItems().get(scanner.nextInt() - 1));

            System.out.println("Quantos você gostaria de adicionar?");

            items.get(items.size() - 1).setQuantity(scanner.nextInt());

            System.out.println("Deseja adicionar mais um item ou sair?");
            System.out.println("Sair - Aperte 0");
            System.out.println("Fazer mais um pedido - Aperte qualquer outro número");

            chosenOption = scanner.nextInt();
        }

        Order order = new Order(items.toArray(new Item[0]));
        queue.add(order);
    }
}