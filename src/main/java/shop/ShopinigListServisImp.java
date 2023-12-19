package shop;

import java.util.List;

public class ShopinigListServisImp implements ShoppingListService{
    @Override
    public List<Item> findAllItems() {
        // Get all items from  database
        return null;
    }

    @Override
    public void saveItems(List<Item> items) {
        // Check items & quantity
        for (Item item : items){
            item.check();
        }


    }
}
