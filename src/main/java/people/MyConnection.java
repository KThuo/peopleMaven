/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rbs
 */
public class MyConnection {
    public static Connection getConnection()
    {
    
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "kert2316");
            return con;
        } catch (Exception e){
            e.printStackTrace();
            return con;
        }
    }
}
