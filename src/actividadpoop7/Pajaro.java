/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoop7;

/**
 *
 * @author richa
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }
    /**
     * 
     * @param tipoPico el tipo de pico del animal
     * @param numeroAlas el numero de alas del animal
     * @param nombre el nombre del animal
     * @param lugarOrigen el lugar de origen del animal
     * @param color el color del animal
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    /**
     * Metodo que obtiene el tipo de pico
     * @return Regresa el tipo de pico
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * Metodo que setea el tipo de pico
     * @param tipoPico el tipo de pico del animal
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * Metodo que imprime en consola "Recolecta ramas"
     */
    public void recolectarRamas(){
        System.out.println("[Recolecta ramas]");
    }
    /**
     * Metodo que retorna el valor de los atributos de la clase
     * @return Una cadena que contiene el valor de los atributos de la clase
     */
    @Override
    public String toString() {
        return "Pajaro{" + super.toString() + "tipoPico=" + tipoPico + '}';
    }
    
    
}
