/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelolaToko.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
 
/**
 *
 * @author asus
 */
    public class Koneksi {
    public Connection conn;
    public Statement stm;
     public void login(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/kelolatoko", "root", "");
            stm = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
     }
     
}
