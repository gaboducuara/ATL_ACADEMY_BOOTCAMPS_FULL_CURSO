import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAdivinar = rand.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 0;
        int numeroAdivinado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Adivina el número entre 1 y 100!");

        while (numeroAdivinado != numeroAdivinar) {
            System.out.print("Ingresa tu número: ");
            numeroAdivinado = scanner.nextInt();
            intentos++;

            if (numeroAdivinado < numeroAdivinar) {
                System.out.println("El número es mayor. Intenta nuevamente.");
            } else if (numeroAdivinado > numeroAdivinar) {
                System.out.println("El número es menor. Intenta nuevamente.");
            } else {
                System.out.println("¡Felicitaciones! Adivinaste el número en " + intentos + " intentos.");
            }
        }
    }
}