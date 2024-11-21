/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejercicios.Numero2;

/**
 *
 * @author yoven
 */

public class PruebaEmpleado {
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Juan", 2000);
        Empleado vendedor = new Vendedor("Ana", 500);

        // Mostrar detalles de cada empleado
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
