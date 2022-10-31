/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoop7;

/**
 *
 * @author richa
 */
public class AnimalTerrestre extends Animal{
    private int numeroPatas;
    public AnimalTerrestre() {
    }
    /**
     * 
     * @param numeroPatas el numero de patas del animal
     * @param nombre el nombre del animal 
     * @param lugarOrigen el lugar de origen del animal
     * @param color el color del animal
     */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo que obtiene el numero de patas 
     * @return el numero de patas
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    /**
     * Metodo que setea el numero de patas
     * @param numeroPatas el numero de patas 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo que imprime en consola "corriendo"
     */
    public void correr(){
        System.out.println("[corriendo]");
    }
    /**
     * Metodo que retorna el valor de los atributos de la clase
     * @return Una cadena que contiene el valor de los atributos de la clase
     */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + super.toString() + "numeroPatas=" + numeroPatas + '}';
    }

   

    
    
}
