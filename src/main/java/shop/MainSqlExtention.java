package shop;

import java.sql.SQLException;

public class MainSqlExtention extends RuntimeException {
    public MainSqlExtention(SQLException e){
        super(e);
    }

}
