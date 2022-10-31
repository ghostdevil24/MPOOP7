/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoop7;

/**
 *
 * @author richa
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro() {
    }
    /**
     * 
     * @param colorCollar color del collar del animal
     * @param numeroPatas el numero de patas del animal
     * @param nombre el nombre del animal
     * @param lugarOrigen el lugar de origen del animal
     * @param color el color del animal
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo obtiene el color del collar
     * @return Regresa el color del collar
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * Metodo que setea el color del collar
     * @param colorCollar el color del collar
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo que imprime en consola "Hace truco"
     */
    public void hacerTrucos() {
        System.out.println("[Hace truco]");
    }
    /**
     * Metodo que retorna el valor de los atributos de la clase
     * @return Una cadena que contiene el valor de los atributos de la clase
     */
    @Override
    public String toString() {
        return "Perro{" + super.toString() + "colorCollar=" + colorCollar + '}';
    }
    
}
