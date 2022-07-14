/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vrs.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author @Aldrin
 */
public class DBConnection {

    private  Connection con;

    public void getDBConn() {
        synchronized ("") {
            try {
                if (this.getCon() == null || this.getCon().isClosed()) {
                    try {
                        String url = "jdbc:mysql://localhost/vrs";      
//                        Class.forName("com.mysql.jdbc.Driver"); 
                        Class.forName("com.mysql.cj.jdbc.Driver"); 
                        setCon(DriverManager.getConnection(url, "root", "aldrin"));
                    } catch (ClassNotFoundException | SQLException e) {
                    }
                } else {
                }
            } catch (SQLException ex) {
            }
        }
    }
    
        /**
     * @return the con
     */
    public  Connection getCon() {
        return con;
    }

    /**
     * @param aCon the con to set
     */
    public  void setCon(Connection aCon) {
        con = aCon;
    }
    public void closeConnection(){
        try{
            con.close();
        }catch(SQLException e){
        }
    }

}
