/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.daw1.dani.wordle.wordleclass;

import java.util.List;

/**
 *
 * @author dani
 */
    
public class MotorTest implements IMotor{
    @Override
    public boolean checkPalabra(final String palabra) {
        return true;
    }
    
    @Override
    public String obtenerPalabraAleatoria() {
        return new String("CICLO");
    }

    @Override
    public boolean addPalabra(String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean removePalabra(String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
} 
    
