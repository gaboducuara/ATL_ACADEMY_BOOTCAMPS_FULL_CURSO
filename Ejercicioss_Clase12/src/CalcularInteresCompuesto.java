import java.util.Scanner;

public class CalcularInteresCompuesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el capital inicial");
        float inicial = teclado.nextFloat();
        System.out.println("ingrese la adicion anual");
        float adicionAnual = teclado.nextFloat();
        System.out.println("ingrese la cantidad de años");
        float cantidadAnos = teclado.nextFloat();
        System.out.println("ingrese la tasa de interes (%)");
        float interes = teclado.nextFloat();

        float cantidadFinal = inicial;

        for (int i = 0; i < cantidadAnos; i++) {
            cantidadFinal += adicionAnual;
             cantidadFinal += cantidadFinal * interes / 100;
        }
        System.out.println("Al finalizar vas a tener $" + cantidadFinal);
    }
}
