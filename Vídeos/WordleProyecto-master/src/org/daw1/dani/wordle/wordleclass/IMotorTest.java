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
public class IMotorTest {
    
    private final List<String> nombre;
    
    public IMotorTest(){
        String[] palabra ={"CLASE"};
        this.nombre = new java.util.ArrayList<>();
        for(String p : palabra){
            this.nombre.add(p);
        }          
    }

    public boolean checkPalabra(String p) {
       if(p.matches("[A-Za-z]{5}")){
           return nombre.contains (p);
       }
       else{
           return false;
       }
    }  

    public FixedLengthString obtenerPalabraAleatoria() {
        return new FixedLengthString("CICLO"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
