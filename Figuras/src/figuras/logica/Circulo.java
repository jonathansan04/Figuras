/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.logica;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura {

    private int lado;
    private double pi = 3.14;

    public void calcularArea() {
        int lado = origen.calcularDistancia(fin);
        area = (int) (Math.PI * (int) Math.pow(lado, 2));
    }

    public void calcularPerimetro() {
        int lado = origen.calcularDistancia(fin);
        perimetro = (int) (Math.PI * 2 * lado);
    }
}
