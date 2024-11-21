/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejercicios.Numero2;

/**
 *
 * @author yoven
 */

public class Gerente extends Empleado {
    private double bono;

   
    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return 5000 + bono; // Salario base + bono
    }
}
