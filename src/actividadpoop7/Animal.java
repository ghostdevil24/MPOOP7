/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoop7;

/**
 *
 * @author richa
 */
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;

    public Animal() {
    }
    /**
     * 
     * @param nombre nombre del animal 
     * @param lugarOrigen Lugar de origen del animal
     * @param color color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * Metodo que obtiene el nombre
     * @return regresa el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que setea el nombre
     * @param nombre nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que obtiene Lugar de Origen
     * @return regresa el lugar de origen 
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * Metodo que setea el Lugar de Origen
     * @param lugarOrigen el lugar de origen del animal 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * Metodo que obtiene el color 
     * @return regresa el color del animal 
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo que setea el color
     * @param color el color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Imprime "Haciendo un sonido" en la consola
     */
    public void sonido(){
        System.out.println("[Haciendo un sonido]");
        
    }
    /**
     * Imprime "comiendo" en la consola 
     */
    public void comer(){
        System.out.println("[Comiendo]");
    }
    /**
     * Método que regresa los atributos de la clase
     * @return regresa todos los atributos 
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
}
