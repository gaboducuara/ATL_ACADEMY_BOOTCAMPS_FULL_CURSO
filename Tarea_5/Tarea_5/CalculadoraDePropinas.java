package Tarea_5;

import java.util.Scanner;
public class CalculadoraDePropinas {
    public static void main(String[] args) {

        Scanner CargarDatosDePropinas = new Scanner(System.in);

        //Total cuenta del restaurante
        System.out.println("Cual es el precio del producto");
        double TotalCuenta = CargarDatosDePropinas.nextDouble();

        //porcentaje de propina que desea dejar
        System.out.println("Cuanta propina deseas deja? : ");
        double porcentajePropina = CargarDatosDePropinas.nextDouble();

        double cien = 100;

        double Propina = TotalCuenta * (porcentajePropina / cien);

        System.out.println("La propina es :" + Propina);
    }
}