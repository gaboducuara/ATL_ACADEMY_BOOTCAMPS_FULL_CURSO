package Tarea_7;

import java.sql.SQLData;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        // Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

       // int contador = 0;

        //METODO PARA RESOLVER EL EJERCICIO CON BUCLE FOR
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println("Ingrese un numero");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
        }

        System.out.println("Los numeros que usted ingreso, son :");
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println(numeros[contador]);
        }

        // 2
        int mayor = 0;
        int menor = 0;
        for(int contador = 0; contador < numeros.length; contador++) {
            int num = numeros[contador];

            if (num >= mayor || contador == 0) {
                mayor = num;
            }
            if (num <= menor || contador == 0) {
                menor = num;
            }
        }
        System.out.println("Numero mayor:" + mayor);
        System.out.println("Numero menor:" + menor);

        // 3
        int sumatoria = 0;
        for (int contador = 0; contador < numeros.length; contador++) {
            int num = numeros[contador];
            sumatoria += num;
        }

        System.out.println("La sumatoria es: " + sumatoria);
        float promedio = (float) sumatoria / numeros.length;
        System.out.println("El promedio es:" + promedio);
        // METODO PARA RESOLVER EJERCICIO CON DO WHILE
        /*
        do {
            System.out.println("Ingrese un numero");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador ++;
        } while (contador < numeros.length);

        System.out.println("Los numeros que usted ingreso, son: ");
        contador = 0;
        do {
            System.out.print(numeros[contador]);
            contador++;
        } while (contador < numeros.length);
        */



        // METODO PARA RESOLVER EJERCICIO CON WHILE
        /*
        while (contador < numeros.length) {
            System.out.println("Ingrese un numero");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador ++;
        }
        */



        /*
        while (contador < numeros.length) {
            System.out.print(numeros[contador]);
            contador++;
        */
        }
    }

