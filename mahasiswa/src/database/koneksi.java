/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.io.*;
import java.sql.*;

/**
 *
 * @author msi
 */
public class koneksi {
    public Connection conn;
    public Statement stat;
    public ResultSet res;
    
     public koneksi(){
    if (conn==null){           
            try {                
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/db_mahasiswa","root","");
                stat = conn.createStatement();
                System.out.println("sukses");
            } catch (Exception e) {                
                System.out.println("koneksi gagal ");
            }
        }
    }
}
