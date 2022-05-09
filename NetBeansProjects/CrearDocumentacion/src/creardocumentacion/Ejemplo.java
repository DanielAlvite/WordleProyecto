/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creardocumentacion;

/**
 *
 * @author alumno
 */
public class Ejemplo {

    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * Edad del empleado
     */
    private int edad;
    /**
     * Salario del empleado
     */
    private double salario;

    /**
     * Suma un plus al salario del empleado si el empleado tiene mas de 40 años
     *
     * @param sueldoPlus
     * @return <ul>
     * <li>true: se suma el plus al sueldo</li>
     * <li>false: no se suma el plus al sueldo</li>
     * </ul>
     */
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    /**
     * Comprueba que el nombre no este vacio
     *
     * @return <ul>
     * <li>true: el nombre es una cadena vacia</li>
     * <li>false: el nombre no es una cadena vacia</li>
     * </ul>
     */
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }

    /**
     * Constructor por defecto
     */
    public Ejemplo() {
        this("", "", 0, 0);
    }

    /**
     * Constructor con 4 parametros
     *
     * @param nombre del empleado
     * @param apellido nombre del empleado
     * @param edad del empleado
     * @param salario del empleado
     */
    public Ejemplo(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
