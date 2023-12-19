package shop;

import java.util.List;

public interface ShoppingListService {
    List<Item> findAllItems();

    public void saveItems(List<Item> items);

}
