package shop;

import java.util.List;

public interface ShoppingListDAo {
    List<Item> findAllItems();

    void saveItems(List<Item> items);
}
