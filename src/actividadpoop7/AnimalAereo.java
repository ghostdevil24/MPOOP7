/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoop7;

/**
 *
 * @author richa
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;

    public AnimalAereo() {
    }
    /**
     * 
     * @param numeroAlas el numero de alas
     * @param nombre el nombre del animal
     * @param lugarOrigen el lugar de origen
     * @param color el color del animal
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodo que obtiene el numero de alas
     * @return Regresa el numero de alas
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Metodo que setea el numero de alas
     * @param numeroAlas el numero de alas
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metdodo que imprime en la consola "Volando"
     */
    public void volar(){
        System.out.println("[volando]");
    }
    /**
     * Metodo que retorna el valor de los atributos de la clase
     * @return Una cadena que contiene el valor de los atributos de la clase
     */
    @Override
    public String toString() {
        return "AnimalAereo{"+ super.toString() + "numeroAlas=" + numeroAlas + '}';
    }
    
    
}
