package shop;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ShoppingListDAOImp implements ShoppingListDAo {
    public static final String HOST = "jdbc:mysql://localhost:3306/shop";
    public static final String USER = "ehsan";
    public static final String PASS = "Eh$@n1364";
    public static final String INSERT_SQL = "INSERT INTO item (name,quantity) VALUES (?,?)";
    public static final String SELECT_SQL = "select * from items";
    @Override
    public List<Item> findAllItems() {

        List<Item> items = new LinkedList<>();
        try(final Connection con = DriverManager.getConnection(HOST, USER, PASS);
            final PreparedStatement select =  con.prepareStatement(SELECT_SQL)){
            final ResultSet resultSet = select.executeQuery();
            while (resultSet.next()){
                final String name = resultSet.getString("name");
                final int quantity = resultSet.getInt("quantity");
                items.add(new Item(name, quantity));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public void saveItems(List<Item> items) {
        try(final Connection con = DriverManager.getConnection(HOST, USER, PASS) ;
            final PreparedStatement insert =  con.prepareStatement(INSERT_SQL)){
            insert.setString(1, "sib");
            insert.setInt(2,5);
            insert.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
