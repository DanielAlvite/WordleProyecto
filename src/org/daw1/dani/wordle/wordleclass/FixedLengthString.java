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
public class FixedLengthString
{
    private static final int LENGTH = 5;
    private String value;
    
    public FixedLengthString(final String value) {
        Objects.requireNonNull(value);
        if (value.length() != 5) {
            throw new IllegalArgumentException("Only 5 letter words are allowed");
        }
        if (!value.matches("[A-Za-z]{5}")) {
            throw new IllegalArgumentException("Only A-Z a-z are allowed");
        }
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
}
