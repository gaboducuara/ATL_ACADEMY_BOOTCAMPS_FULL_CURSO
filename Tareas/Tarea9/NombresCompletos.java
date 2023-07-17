package Tarea_9_Ejercicios_Practicos;

import java.util.Scanner;
// App para buscar nombres
public class NombresCompletos {
    public static void main (String[] args) {
    String[] personas = { "Gabriel", "Martinez" , "Esperanza" , "Ricardo", "Jose luis",
            "Alvaro", "Marquez", "Kary" , "Lucas" , "Lukaku" , "Verrati"};

        System.out.println("Ingrese su busqueda: ");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();

        // forma 1

        /*
        for( int i = 0; i < personas.length; i++) {
            String personasEncontradas = personas[i];
            // equalsIgnoreCase nos ayuda a ignorar en la busqueda si son mayusculas o minusculas.
            if (busqueda.equalsIgnoreCase(personasEncontradas)) {
                System.out.println("La persona es "  + personasEncontradas);
            }
        }
         */

        //forma 2
        for(String nombrePersona : personas) {
            if(nombrePersona.contains(busqueda)) {
                System.out.println("La persona es: " + nombrePersona);
            }
        }
    }
}
