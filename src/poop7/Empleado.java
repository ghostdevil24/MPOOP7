/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu03
 */
public class Empleado extends Object{
    private String nombre;
    private int numEmpleado,sueldo;

    public Empleado() {
        this.sueldo =10_000;
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
/**
 * 
 * @return Regresa el nombre del empleado 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @return Regresa el numero de empleado
 */
    public int getNumEmpleado() {
        return numEmpleado;
    }
/**
 * 
 * @return Regresaa el sueldo del empleado
 */
    public int getSueldo() {
        return sueldo;
    }
/**
 * Metodo que modifica el valor del nombre
 * @param nombre El nombre de un empleado
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @param numEmpleado el numero del empleado
 */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
/**
 * 
 * @param porcentaje Aumenta el sueldo según el porcentaje
 */
    public void setSueldo(int porcentaje) {
        this.sueldo +=(int)(this.sueldo*porcentaje/100);
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString()  + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}
