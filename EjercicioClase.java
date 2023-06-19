import java.util.Scanner;
public class EjercicioClase {
    public static void main(String[] args){

        //obtener un numero aleatorio entre 0 y , y si se multiplicapor 10, entonces
        // sera de 0 a 10; ---
        // - metodo --> Math.random(); ...  Math.random() * 10

        Scanner cargaDedatos = new Scanner(System.in);
        //peso en KLG / Altura en mtrs al cuadrado
        // variable de tipo doble sirve para guardar decimales
        System.out.println("ingrese su peso en KLG");
        double peso = cargaDedatos.nextDouble();

        System.out.println("ingrese su Altura en Metros");
        double altura = cargaDedatos.nextDouble();

        double indiceMasaCorporal = peso  / ( altura * altura);
        System.out.println("Tu indice de masa corportal es?"  + " " + indiceMasaCorporal);

        // Mayor a 30 es obesidad;
        if ( indiceMasaCorporal >= 30) {
            System.out.println("Tienes obesidad");
        }
        // entre 25 y 30 es sobrepeso;
        if ( indiceMasaCorporal >= 25 && indiceMasaCorporal < 30) {
            System.out.println("Tienes sobrepeso");
        }
        //entre 18,5 y 25 normal
        if ( indiceMasaCorporal >= 18 && indiceMasaCorporal < 25 ) {
            System.out.println("Tienes un peso normal");
        }
        // menor a 18,5 es debajo de lo normal;
        if ( indiceMasaCorporal < 18 ) {
            System.out.println("Su peso esta por debajo de lo normal");
        }
        /*
        System.out.println("que edad tienes?");
        // Scanner metodo para cargar datos
        Scanner cargaDedatos = new Scanner(System.in);
        Integer edad  = cargaDedatos.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
         */
    }
}
