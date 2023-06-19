package Tarea_5;

import java.util.Scanner;
public class CalculadoraDeDescuento {
    public static void main(String[] args) {

        Scanner CargarDatosDeProducto = new Scanner(System.in);

        //precio del producto
        System.out.println("Cual es el precio del producto");
        double PrecioProducto = CargarDatosDeProducto.nextDouble();

        //porcentaje de descuento del producto
        System.out.println("Ingrese porcentaje de descuento");
        double DescuentoProducto = CargarDatosDeProducto.nextDouble();

        double cien = 100;

        double PrecioFinal = PrecioProducto - (PrecioProducto * DescuentoProducto / cien);

        System.out.println("El precio final despues del descuento es: " + PrecioFinal);

    }
}