/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.dani.wordle.wordleclass;
import java.sql.SQLException;
/**
 *
 * @author dani
 */
public interface IMotor {
    
    public boolean checkPalabra(String palabra);
    
    public boolean addPalabra(String palabra);
    
    public boolean removePalabra(String palabra);
    
    public String obtenerPalabraAleatoria()throws SQLException;
    
}
