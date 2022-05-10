/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.dani.wordle.wordleclass;

/**
 *
 * @author dani
 */
public class FixedLengthString {
    private final static int LENGTH = 5 ;
    private String value;
    
    
    public FixedLengthString (String value) {
        java.util.Objects.requireNonNull(value);
        if(value.length() !=LENGTH ){
            throw new IllegalArgumentException("solo valen palabras con un tamaño de " + LENGTH + " letras");
        }
        else if(!value.matches("[A-Za-z]{5}")){
            throw new IllegalArgumentException("solo se permiten letras de A-Z");
        }
        this.value=value;
    
    }
    public String getValue(){
        return value;
    }
    
}
