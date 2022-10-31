/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu03
 */
public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente() {
    }
    public Gerente(String nombre, int numEmpleado, int sueldo,int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        if(presupuesto < 0)
            presupuesto = 0;
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString() + "presupuesto=" + presupuesto + '}';
    }
    
    
}
