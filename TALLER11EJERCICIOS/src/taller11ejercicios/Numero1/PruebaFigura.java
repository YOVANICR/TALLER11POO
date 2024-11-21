/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11ejercicios.Numero1;

/**
 *
 * @author yoven
 */

public class PruebaFigura {
    public static void main(String[] args) {
        
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        // Mostrar el área de cada figura
        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}

