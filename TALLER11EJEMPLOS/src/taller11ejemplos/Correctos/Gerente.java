/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejemplos.Correctos;

/**
 *
 * @author yoven
 */

public class Gerente extends Empleado {
    private double bono;

    
    public Gerente(String nombre, double bono) {
        super(nombre); // Llama al constructor de la clase base
        this.bono = bono;
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public void calcularSalario() {
        System.out.println("El salario del gerente incluye un bono de: " + bono);
    }
}
