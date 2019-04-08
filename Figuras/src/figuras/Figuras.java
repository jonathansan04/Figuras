/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.logica.*;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Seleccione la figura   ");
        System.out.println(" 1.Cuadrado   ");
        System.out.println(" 2.Rectangulo   ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        figura f;
        Punto origen = new Punto();
        Punto fin = new Punto();
        switch (num) {

            case 1:
                f = new Cuadrado();
                origen.setX(0);
                origen.setY(0);
                
                fin.setX(5);
                fin.setY(0);
               mostrar(f, origen, fin);
                break;
            case 2:
                f = new rectangulo();
                origen.setX(0);
                origen.setY(5);
            
                fin.setX(10);
                fin.setY(0);
               mostrar(f, origen, fin);
                break;
            default:
                System.out.println("Opcion no valida ");
        }

    }

    public static void mostrar(figura f, Punto origen, Punto fin) {
        f.setOrigen(origen);
        f.setFin(fin);
        f.calcularArea();
        f.calcularPerimetro();
        System.out.println("El area es " + f.getArea());
        System.out.println("El perimetro es " + f.getPerimetro());

    }
}
