package shop;

import java.util.List;

public class ShopinigListServisImp implements ShoppingListService{

    final ShoppingListDAo shoppingListDAO;

    public ShopinigListServisImp(ShoppingListDAo shoppingListDAO) {
        this.shoppingListDAO = shoppingListDAO;
    }


    @Override
    public List<Item> findAllItems() {
        // Get all items from  database
        final ShoppingListDAo shoppingListDAO = new ShoppingListDAOImp();
        return shoppingListDAO.findAllItems();
    }

    @Override
    public void saveItems(List<Item> items) {
        // Check items & quantity
        for (Item item : items){
            item.check();
        }
        final ShoppingListDAo shoppingListDAO = new ShoppingListDAOImp();
        shoppingListDAO.saveItems(items);

    }
}
