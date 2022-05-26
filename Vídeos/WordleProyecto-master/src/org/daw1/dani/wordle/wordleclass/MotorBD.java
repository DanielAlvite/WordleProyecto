/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.dani.wordle.wordleclass;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.Random;
/**
 *
 * @author dani
 */
public class MotorBD implements IMotor {
    
    public MotorBD(String lang){
       this.lang = lang;
    }
    
    Random rn = new Random();
    private final String lang;
    
    private final String URL = "jdbc:sqlite:Data/dbwordle.db";
    
    
    
    @Override
    public boolean checkPalabra(String texto){
        
        try(Connection conn = DriverManager.getConnection(URL);
                PreparedStatement ps = conn.prepareStatement("SELECT palabra from palabras where lang = ? and palabra = ?")){
                ps.setString(2, texto.toUpperCase());
                ps.setString(1, lang);
                try(ResultSet rs = ps.executeQuery()){
                    if(rs.next()){
                        return true;
                    }
                }
        } catch (SQLException ex) {
            Logger.getLogger(MotorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }   
    
    @Override
    public boolean addPalabra(String texto){
        
         try(Connection conn = DriverManager.getConnection(URL);
          PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras (palabra, lang) VALUES (?, ?)")){
           ps.setString(1, texto.toUpperCase());
           ps.setString(2, lang);
           int insertadas = ps.executeUpdate();
           return insertadas > 0;
       } catch (SQLException ex) {
            Logger.getLogger(MotorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    @Override
    public boolean removePalabra(String texto){
        
        try(Connection conn = DriverManager.getConnection(URL);
          PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE palabra = ? AND lang= ?")){
           ps.setString(1, texto.toUpperCase());
           ps.setString(2, lang);
           int borradas = ps.executeUpdate();
           return borradas > 0;
       } catch (SQLException ex) {
            Logger.getLogger(MotorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
    }
    
    @Override
    public String obtenerPalabraAleatoria() throws SQLException{
        int total;
        try(Connection conn = DriverManager.getConnection(URL);
          PreparedStatement ps = conn.prepareStatement("SELECT count(palabra) as total FROM palabras WHERE lang= ?")){
           ps.setString(1, lang);
           try(ResultSet rs = ps.executeQuery()){
               rs.next();
               total = rs.getInt("total");
           }
           PreparedStatement sp = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang= ? limit ?, 1");
           int nR = rn.nextInt(total);
           sp.setString(1, lang);
           sp.setInt(2, nR);
           try(ResultSet rs = sp.executeQuery()){
              return rs.getString("palabra");
            }
        }
    }
}
