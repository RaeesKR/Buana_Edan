/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;

import java.sql.PreparedStatement;
import java.sql.Connection;
import kyojin_gemu.utils.DatabaseConection;

/**
 *
 * @author tdyir
 */
public class AuthControllers {
    private Connection conn = DatabaseConection.getConnection();
    
    public boolean register(String username, String pwd){
        try {
            String query = "INSERT INTO users (username,password), values (?,?)";
            PreparedStatement  ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pwd);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Register Gagal : "+ e.getMessage());
            return false;
        }
    }
    
    
    public  boolean  login(String username, String pwd){
        try {
            String query = "INSERT INTO users (username,password), values (?,?)";
            PreparedStatement  ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            System.err.println("Login gagal : " + e.getMessage());
            return false;
        }
    }
    
}
