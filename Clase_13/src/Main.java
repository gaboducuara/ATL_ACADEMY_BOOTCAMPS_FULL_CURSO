import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<FIgura> figuras = new ArrayList<>();
    public static void main(String[] args) {

        boolean mostrarMenu = true;

        do {
            //mostrar menu para inicar el programa
            System.out.println(" *****************  Menu  *****************");
            System.out.println("1) Crear una figura");
            System.out.println("2) Mostrar la sumatoria de areas de las figuras");
            System.out.println("0) salir del programa");

            Scanner teclado = new Scanner(System.in);
            int respuestaUsuario = teclado.nextInt();

            switch (respuestaUsuario) {
                case 1:
                    crearFigura();
                    break;

                case 2:
                    mostrarSumatoriaDeFiguras();
                    break;

                case 0:
                    mostrarMenu = false;
                    break;
            }
        } while (mostrarMenu);
    }

    private static void mostrarSumatoriaDeFiguras() {
        double sumatoriaAreas = 0;
        for(FIgura figura : figuras ) {
            sumatoriaAreas += figura.calcularArea();
        }
        System.out.println("La sumatoria de areas de todas las figuras es:" + sumatoriaAreas + "600 cm");
    }


    /// toda esta logica de if es igual a un switch
            /*
            if ( respuestaUsuario == 1) {
                crearFigura();
            }
            if ( respuestaUsuario == 2 ) {
                System.out.println("La sumatoria de areas de todas las figuras es de : 600 cm");
            }
            if( respuestaUsuario == 0 ) {
                mostrarMenu = false;
            }
        } while(mostrarMenu);
             */


    //crearFigura();
    private static void crearFigura() {

        System.out.println("Digita la opcion 1, 2 o 3 dependiendo de la figura");
        System.out.println("Que figura desea crear ?");

        System.out.println("1) Circulo");
        System.out.println("2) Cuadrado");
        System.out.println("3) Triangulo");

        Scanner teclado = new Scanner(System.in);
        int respuestaUsuario = teclado.nextInt();

        if (respuestaUsuario == 1) {
            Circulo circulo = new Circulo();
            circulo.cargarDatos();
            System.out.println("El area total del circulo es de:" + " " + circulo.calcularArea());
            figuras.add(circulo);
        }

        if (respuestaUsuario == 2) {
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.cargarDatos();
            System.out.println("El area total del cuadrado es de :" + " " + cuadrado.calcularArea());
            figuras.add(cuadrado);
        }

        if (respuestaUsuario == 3) {
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            System.out.println("El area total del triangulo es de :" + " " + triangulo.calcularArea());
            figuras.add(triangulo);
        }
    }
}
