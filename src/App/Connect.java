/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Connect {
    
    public static Connection MySQl(){
    
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("root");        
            ds.setPassword("");
            ds.setServerName("localhost");
            ds.setDatabaseName("umkm");
            ds.setPortNumber(3306);
            Connection c = ds.getConnection();
            System.out.println("database connected!");
            return c;
            
        } catch (SQLException e) {
            
            System.err.println("database tidak ada " + e.getMessage());
            return null;
        }
        
    }
    
    public static void main(String[] args) {
        
        
        try {
            Connection conn = Connect.MySQl();
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            
        }
    }
}
