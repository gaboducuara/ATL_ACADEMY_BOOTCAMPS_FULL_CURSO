package Tarea_5;

import java.util.Scanner;
public class ConversorMillas {
    public static void main(String[] args) {

        Scanner CargaDatosRecorrido = new Scanner(System.in);
        System.out.println("Cual es la cantidad de millas que recorriste?");

        double CantidadMillas = CargaDatosRecorrido.nextDouble();
        double MillaEnKilometros = 1.609344;
        double CalculandoKilometros = CantidadMillas * MillaEnKilometros;

        System.out.println("La Cantidad de kilometros que el usuario recorrio es de : " + CalculandoKilometros);
    }
}
