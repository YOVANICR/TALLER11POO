/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejercicios.Numero2;

/**
 *
 * @author yoven
 */

public class Vendedor extends Empleado {
    private double comision;

    // Constructor para inicializar el nombre y la comisión
    public Vendedor(String nombre, double comision) {
        super(nombre);
        this.comision = comision;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return 2000 + comision; // Salario base + comisión
    }
}
