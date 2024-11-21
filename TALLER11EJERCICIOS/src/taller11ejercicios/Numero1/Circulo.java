/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejercicios.Numero1;

/**
 *
 * @author yoven
 */



public class Circulo extends Figura {
    private double radio;

    
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método abstracto calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
