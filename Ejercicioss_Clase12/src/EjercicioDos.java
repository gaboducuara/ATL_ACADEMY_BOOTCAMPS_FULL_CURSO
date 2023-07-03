import java.util.Scanner;

public class EjercicioDos {
    public static void main (String[] args) {
        System.out.println("ingrese el costo del producto");
        Scanner teclado = new Scanner(System.in);
        float costoDelProducto = teclado.nextFloat();

        System.out.println("ingrese la cantidad pagada");
        float cantidadPagada = teclado.nextFloat();

        if ( cantidadPagada < costoDelProducto ) {
            float cantidadFaltante = costoDelProducto - cantidadPagada;
            System.out.println("Falta abonar:  " + cantidadFaltante + "$ pesos");
        } else {
            float cambioTotal = cantidadPagada - costoDelProducto;
            System.out.println("El cambio total es: $" + cambioTotal);
        }
    }
}
