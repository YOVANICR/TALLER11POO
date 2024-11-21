/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejemplos.Correctos;

/**
 *
 * @author yoven
 */

public class PruebaEmpleado {
    public static void main(String[] args) {
       
        Gerente gerente = new Gerente("Ana", 3000.0);

        // Mostrar el nombre y calcular el salario del gerente
        gerente.mostrarNombre();
        gerente.calcularSalario();
    }
}
