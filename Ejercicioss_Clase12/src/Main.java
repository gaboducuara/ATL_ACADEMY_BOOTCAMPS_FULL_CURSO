import com.sun.nio.sctp.AbstractNotificationHandler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JugarAmigoSecreto();
    }

    private static void JugarAmigoSecreto() {
        System.out.println("?cuantas personas van a jugar al amigo secreto");
        Scanner teclado = new Scanner(System.in);
        int cantidadPersonas = teclado.nextInt();
        String[] listaDeNombres = new String[cantidadPersonas];

        IngresarNombreDeJugadores(teclado, cantidadPersonas, listaDeNombres);
        String[] elegidos = new String[cantidadPersonas];
        AsignarElegidosApersonas(cantidadPersonas, listaDeNombres, elegidos);
        MostrarElegidos(teclado, cantidadPersonas, listaDeNombres, elegidos);
    }

    private static void MostrarElegidos(Scanner teclado, int cantidadPersonas, String[] listaDeNombres, String[] elegidos) {
        for (int i = 0; i < cantidadPersonas; i++) {
            String nombreDelaPersona = listaDeNombres[i];
            System.out.println("Que " + nombreDelaPersona + " se acerque a la computadora y escriba listo para continuar");
            teclado.next();
            String nombreElegido = elegidos[i];
            System.out.println("Le tienes que hacer un regalo a " + nombreElegido + ". presiona listo para continuar");
            teclado.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }
    private static void AsignarElegidosApersonas(int cantidadPersonas, String[] listaDeNombres, String[] elegidos) {
        for (int i = 0; i < cantidadPersonas; i++) {
            int indice = i + 1;
            if (indice >= cantidadPersonas) {
                indice = 0;
            }
            elegidos[i] = listaDeNombres[ indice ];
        }
    }

    private static void IngresarNombreDeJugadores(Scanner teclado, int cantidadPersonas, String[] listaDeNombres) {
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("ingrese el nombre de una persona");
            String nombreDelaPersona = teclado.next();
            listaDeNombres[i] = nombreDelaPersona;
        }
    }
}