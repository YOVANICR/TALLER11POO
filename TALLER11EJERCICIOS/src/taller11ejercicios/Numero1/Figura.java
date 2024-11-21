/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejercicios.Numero1;

/**
 *
 * @author yoven
 */



public abstract class Figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método concreto para mostrar el área
    public void mostrarArea() {
        System.out.println("El area es: " + calcularArea());
    }
}
