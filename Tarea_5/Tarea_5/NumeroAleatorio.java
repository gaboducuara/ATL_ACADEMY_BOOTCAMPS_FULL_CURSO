package Tarea_5;

import java.util.Scanner;
public class NumeroAleatorio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroUsuario = 0;
        int numeroAleatorio = (int) Math.floor(Math.random() * 100);

        System.out.println("?Cual es el numero aleatorio: ");
        numeroUsuario = teclado.nextInt();
        if(numeroUsuario == numeroAleatorio) {
            System.out.println("Adivinaste el numero!!");
        } else {
            System.out.println("Numero equivocado");
        }
    }
}
