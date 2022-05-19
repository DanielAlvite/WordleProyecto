/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.dani.wordle.wordleclass;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.Math;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
/**
 *
 * @author dani
 */
public class MotorArchivo implements IMotor{
    
    
    public boolean crearFicheroTexto(String ruta, String texto){ 
            try(Writer bw = new BufferedWriter(new FileWriter(ruta))){
                bw.write(texto);
                return true;
            } catch (IOException ex) {
                Logger.getLogger(MotorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
      
        }        

    
    @Override
    public boolean checkPalabra(String palabra){
        throw new UnsupportedOperationException("");
                }
    
    @Override
    public boolean addPalabra(String palabra){
        
    }
    
    @Override
    public boolean removePalabra(String palabra){
        if(file.exists()){
            return false;
        }
        
    }
    
    @Override
    public FixedLengthString obtenerPalabraAleatoria(){
        int random = (int) Math.random()*palabra.size();
        return palabra.get(random);
    }
    
}
