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
import java.util.List;
import java.util.Random;
import org.daw1.dani.wordle.gui.AdministrarMotor;
/**
 *
 * @author dani
 */
public class MotorArchivo implements IMotor{
    
    private String ruta = "." + File.separator + "Data" + File.separator + "palabra.txt";
    private List<String> palabra = new ArrayList<>();
    Random rn = new Random();
    
    public boolean crearArchivo(String texto){ 
       if(!existeArchivo() && existeCarpetaPadre()){ 
        try(Writer bw = new BufferedWriter(new FileWriter(ruta))){
                bw.write(texto);
                return true;
            } catch (IOException ex) {
                Logger.getLogger(MotorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
      
        }
       else{
           return false;
       }
    }
    
    
    
    private boolean existeArchivo() {
        File f = new File (ruta);
        return f.exists();
                }

    private boolean existeCarpetaPadre() {
        File f = new File (ruta);
        return f.getParentFile().exists();
                }
    
    
       public boolean addPalabra(String texto){
        if(existeArchivo() && !checkPalabra(texto) && existeCarpetaPadre()){
            try(Writer wr = new BufferedWriter(new FileWriter(ruta, true))){
                wr.write(texto.toUpperCase());
                return true;
            } catch (IOException ex) {
                Logger.getLogger(MotorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else{
            return false;
        }
    }

       
    
    @Override
    public boolean removePalabra(String texto){
        
    }
    
 
    
    @Override
    public FixedLengthString obtenerPalabraAleatoria(){
            try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
                StringBuilder sb = new StringBuilder();
                String linea = br.readLine();
                while(linea != null){
                    sb.append(linea).append("\n");
                    linea = br.readLine();
                   
                }
                  int nr = rn.nextInt(palabra.size());
                  System.out.println(palabra.get(nr));
                  return new FixedLengthString(palabra.get(nr));
            } catch (IOException ex) {
                Logger.getLogger(MotorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
 
    @Override
    public boolean checkPalabra(String texto) {
         boolean exists = false;
           
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
                String linea = br.readLine();
                while(linea != null && exists == false){
                    if(linea != null){
                        palabra.add(linea);
                    }
                   linea = br.readLine();
                   if(palabra.contains(texto)){
                       exists = true;
                   }
                   
                }
                return exists;
            } catch (IOException ex) {
                Logger.getLogger(MotorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
    
}
