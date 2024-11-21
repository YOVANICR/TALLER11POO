/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejemplos.Correctos;

/**
 *
 * @author yoven
 */

public abstract class Empleado {
    protected String nombre;

    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que las clases derivadas deben implementar
    public abstract void calcularSalario();

    // Método concreto que muestra el nombre del empleado
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
