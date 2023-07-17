package Tarea_5;

import java.util.Scanner;
public class Canino {
    public static void main(String[] args) {

        Scanner CargaEdadPerro = new Scanner(System.in);

        System.out.println("Cual es tu edad?");
        double EdadHumano = CargaEdadPerro.nextDouble();
        double Edadperro = 7;
        double CalculandoEdadperro =  Edadperro * EdadHumano;

        System.out.println("La edad del perro es : " + CalculandoEdadperro );
    }
}