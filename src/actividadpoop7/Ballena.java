/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoop7;

/**
 *
 * @author richa
 */
public class Ballena extends AnimalAcuatico{
    private int largo;

    public Ballena() {
    }
    /**
     * 
     * @param largo largo del animal 
     * @param numeroAletas numero de aletas del animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    /**
     * Metodo que obtiene el largo del animal
     * @return Regresa el largo del animal
     */
    public int getLargo() {
        return largo;
    }
    /**
     * Metodo que setea el largo del animal
     * @param largo el largo del animal
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * Metodo que imprime en consola "Se traga a pinocho"
     */
    public void PelearConPinocho(){
        System.out.println("[Se traga a pinocho]");
    }
    /**
     * Metodo que retorna el valor de los atributos de la clase
     * @return Una cadena que contiene el valor de los atributos de la clase
     */
    @Override
    public String toString() {
        return "Ballena{"+ super.toString() + "largo=" + largo + '}';
    }
    
}
