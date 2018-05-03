/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Component;
import java.sql.*;

/**
 *
 * @author kielquitain
 */
public class OracleConnection {
    public static void main (String [] args){
        
        
       Connection con = null;
       
      try {
          String drivername = "oracle.jdbc.driver.OracleDriver";
          Class.forName(drivername);
          
          String url = "jdbc:oracle:thin:@kielquitain:1521:XE";
          String username = "kiel";
          String password = "oracle";
          con = DriverManager.getConnection(url, username, password);
          System.out.println("Success! "); 
      
      }catch(Exception e) {
          e.printStackTrace();
      }
      
      try {
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery("Select * FROM COUNTRIES");
          while(rs.next()){
//           int countryID, regionID;
//           String countryName;
//           countryID = rs.getInt("COUNTRY_ID");
//           countryName = rs.getString("COUNTRY_NAME");
//           regionID = rs.getInt("REGION_ID");
////           
//              System.out.println(countryID + "\t" + countryName + "\t" + regionID);
              System.out.println(rs.getString(1) + "\t" +rs.getString(2) + "\t" + rs.getString(3) );
           
          }
          rs.close();
      }catch(Exception e){
          e.printStackTrace();
      }
    }
}
