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
import java.util.Iterator;
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
    File f = new File(ruta);
    
    public MotorArchivo(){
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
                String linea = br.readLine();
                while(linea != null){
                    palabra.add(linea);
                    linea = br.readLine(); 
                }
            } catch (IOException ex) {
                Logger.getLogger(MotorArchivo.class.getName()).log(Level.SEVERE, null, ex);
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
                wr.write("\n"+texto.toUpperCase());
                palabra.add(texto.toUpperCase());
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
        texto = texto.toUpperCase();
        if (!palabra.contains(texto.toUpperCase())) {
            return false;
        }
        
        Iterator<String> it = palabra.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (texto.equals(next)) {
                it.remove();
            }
        }
       
        String palabras = "";
        for (String palabra1 : palabra) {
            palabras += palabra1.toUpperCase() + "\n";
        }
        if (!f.exists()) {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MotorArchivo.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f));) {
            bw.append(palabras.toUpperCase());
            return true;
        } catch (IOException ex) {
            Logger.getLogger(MotorArchivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
    }
    
 
    

    
    @Override
    public String obtenerPalabraAleatoria(){
             int nr = rn.nextInt(palabra.size());
                String palabraAl = palabra.get(nr);
                return palabraAl;
        }
 
    @Override
    public boolean checkPalabra(String texto) {
        boolean exists = false;
        if(palabra.contains(texto.toUpperCase())){
          exists = true;
        } 
        return exists;  
    }
    
}
