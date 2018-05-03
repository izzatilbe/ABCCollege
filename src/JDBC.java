
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IJTilbe
 */
public class JDBC {
    public final static String DRIVER="org.apache.derby.jdbc.ClientDriver";
    public final static String URL="jdbc:derby://localhost:1527/InventoryRecord";
    public final static String USERNAME="administrator";
    public final static String PASSWORD="password";
    
    static Statement query;
    static PreparedStatement ps;
    static CallableStatement cs;
    static Connection conn;
    
    public boolean login(String username, String password){
        return (username.equals(JDBC.USERNAME) && password.equals(JDBC.PASSWORD));
    }
    
    public static boolean add(String id, String name, String price, int qty){
        
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query = conn.createStatement();
            query.executeUpdate("INSERT INTO prodcut VALUES("
                    + id + " " + name + " " + price + " " + qty + ")");
            return true;
        } catch (Exception ex) {
            return false;
        }        
    }
}
