/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpoop7;

/**
 *
 * @author richa
 */
public class ActividadPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("#####Ballena####");
        Ballena ball = new Ballena();
        ball.setNombre("Ballena");
        ball.setColor("Gris");
        ball.setLugarOrigen("Bajo del mar");
        ball.setNumeroAletas(2);
        ball.setLargo(6);
        ball.nadar();
        ball.PelearConPinocho();
        ball.comer();
        ball.sonido();
        System.out.println(ball);
        System.out.println("#####Perro####");
        Perro perr = new Perro();
        perr.setNombre("Perro");
        perr.setColor("Negro");
        perr.setLugarOrigen("Casa de humanos");
        perr.setNumeroPatas(4);
        perr.setColorCollar("Rojo");
        perr.correr();
        perr.comer();
        perr.hacerTrucos();
        perr.sonido();
        System.out.println(perr);
        System.out.println("#####Pajaro####");
        Pajaro paj = new Pajaro();
        paj.setColor("Azul");
        paj.setLugarOrigen("Bosque");
        paj.setNombre("Pajaro");
        paj.setNumeroAlas(2);
        paj.setTipoPico("Curveado");
        paj.volar();
        paj.comer();
        paj.recolectarRamas();
        paj.sonido();
        System.out.println(paj);
    }
    
}
