package figuras.logica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Estudiantes
 */
public class Cuadrado extends figura {

    private int lado;

    public void calcularArea() {
        int lado = origen.calcularDistancia(fin);
        area = lado * lado;
    }

    public void calcularPerimetro() {
        int lado = origen.calcularDistancia(fin);
        perimetro = 4 * lado;
    }
}
