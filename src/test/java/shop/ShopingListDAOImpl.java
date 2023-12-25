package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ShopingListDAOImpl {


    public static final String ERR = "fai";
    public static final String INSERT_SQL = "INSERT INTO item (name,quantity) VALUES (?,?)";
    public static final String SELECT_SQL = "select * from items";
    private String host;
    private String user;
    private String pass;


    @BeforeEach
    void setUp() {
        try (InputStream configFile = new FileInputStream("db_Configuration.properties")){
            final Properties properties = new Properties();
            properties.load(configFile);
            host = properties.get("host").toString();
            user = properties.get("username").toString();
            pass = properties.get("password").toString();
        }  catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    @Test
    void shoud_connect_database(){
        try(final Connection con = DriverManager.getConnection(host, user, pass) ) {
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
        try(final Connection con = DriverManager.getConnection(host, user, pass) ;
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
