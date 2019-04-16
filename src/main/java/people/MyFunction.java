/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rbs
 */
public class MyFunction {
    
    public static int countData(String tableName){
    
        int total = 0;
    Connection connection = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st = connection.createStatement();
            
            rs = st.executeQuery("SELECT COUNT(*) AS total FROM "+tableName);
            while(rs.next()){
                total = rs.getInt(1);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return total;
    }

}
