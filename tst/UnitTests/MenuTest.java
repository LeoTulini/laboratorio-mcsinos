package UnitTests;

import Entities.Item;
import Entities.Menu;
import Entities.Type;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MenuTest {

    @Test
    public void instantiateMenu_ValidArguments_NewMenu() {
        Item item = new Item(Type.BURGUER, 2, "Hamburgão");
        List<Item> items = Arrays.asList(item);
        Menu menu = new Menu(items);
        Assert.assertNotNull(menu);
        Assert.assertEquals(items, menu.getItems());
    }

    @Test
    public void instantiateMenu_InvalidArguments_IllegalArgumentException(){
        try {
            Menu menu = new Menu(null);
            Assert.fail();
        } catch (IllegalArgumentException ex){
            Assert.assertEquals("A lista de itens não pode ser nula ou vazia.", ex.getMessage());
        }
    }
}
