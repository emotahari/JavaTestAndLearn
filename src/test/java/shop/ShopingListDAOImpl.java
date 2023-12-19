package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class ShopingListDAOImpl {

    public static final String HOST = "jdbc:mysql://localhost:3306/shop";
    public static final String USER = "ehsan";
    public static final String PASS = "Eh$@n1364";
    public static final String ERR = "fai";
    public static final String INSERT_SQL = "INSERT INTO item (name,quantity) VALUES (?,?)";
    public static final String SELECT_SQL = "select * from items";

    @Test
    void shoud_connect_database(){
        try(final Connection con = DriverManager.getConnection(HOST, USER, PASS) ) {
            if(con == null){
                Assertions.fail(ERR);
            }
        } catch (SQLException e){
            e.printStackTrace();
            Assertions.fail(ERR);
        }

    }
    @Test
    void should_crud_an_item_to_dabase(){
        try(final Connection con = DriverManager.getConnection(HOST, USER, PASS) ;
           final PreparedStatement insert =  con.prepareStatement(INSERT_SQL);
            final PreparedStatement select =  con.prepareStatement(SELECT_SQL)){
           insert.setString(1, "sib");
           insert.setInt(2,5);
           insert.executeUpdate();
            final ResultSet resultSet = select.executeQuery();
        } catch (SQLException e){
            e.printStackTrace();
            Assertions.fail(ERR);
        }
    }
}
