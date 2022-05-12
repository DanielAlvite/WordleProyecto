/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.dani.wordle.wordleclass;

import java.util.Objects;

/**
 *
 * @author dani
 */
public enum Resultado
{
    MAL, 
    EXISTE, 
    OK;
    
    public static Resultado of(final int eleccion) {
        Objects.checkIndex(eleccion - 1, values().length);
        return values()[eleccion - 1];
    }
}