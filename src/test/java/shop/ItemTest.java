package shop;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;




public class ItemTest {

    @Test
    public void shoud_chech_item(){
        ShoppingListService shoppingList = new ShopinigListServisImp();

        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item(null, 2));
        shoppingList.saveItems(itemList);

        Assertions.assertDoseNot.


    }


    @Test
    public void shoud_null(){
        ShoppingListService shoppingList = new ShopinigListServisImp();

        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item("Orange", 2));
        shoppingList.saveItems(itemList);

        assertThrows(ItemNameException.class, () -> shoppingList.saveItems(itemList));
    }
}
