/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejercicios.Numero1;

/**
 *
 * @author yoven
 */

public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método abstracto calcularArea
    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}

