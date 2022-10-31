/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoop7;

/**
 *
 * @author richa
 */
public class AnimalAcuatico extends Animal {
    private int numeroAletas;

    public AnimalAcuatico() {
    }
    /**
     * 
     * @param numeroAletas el numero de aletas
     * @param nombre el nombre del animal
     * @param lugarOrigen origen del animal 
     * @param color color del animal
     */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    /**
     * Metodo que regresa el numero de aletas
     * @return Regresa el numero de aletas 
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }
    /**
     * Metodo que setea el numero de aletas
     * @param numeroAletas el numero de aletas
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Metodo que imprime en consola "Nadando"]
     */
    public void nadar(){
        System.out.println("[Nadando]");
    }
    /**
     * Metodo que imprime los atributos de la clase
     * @return Los atributos de la clase 
     */
    @Override
    public String toString() {
        return "AnimalAcuatico{"+ super.toString() + "numeroAletas=" + numeroAletas + '}';
    }
    
}
