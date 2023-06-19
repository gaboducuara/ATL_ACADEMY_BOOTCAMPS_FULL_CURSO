package Tarea_5;

public class Tarea5 {
    public static void main(String[] args) {
        double peso = 78;
        double altura = 1.73;
        double indiceMasaCorporal = peso / altura;

        System.out.println("Tu indice de masa corporal es:" + indiceMasaCorporal);

        //Mayor a 30 -> obesidad
        if (indiceMasaCorporal >= 30 ) {
            System.out.println("Estas en estado de Obesidad");
        }
        //Entre 25 y 30 sobrepeso
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal <= 30 ) {
            System.out.println("Estas en estado de SobrePeso");
        }
        //Entre 18.5 y 25 normal
        if ( indiceMasaCorporal >= 18.5 && indiceMasaCorporal <= 25) {
            System.out.println("Tu peso es normal");
        }
        // Menor a 18.6 debajo de lo normal
        if (indiceMasaCorporal <= 18.4 ) {
            System.out.println("Tu peso esta debajo de lo normal");
        }

    }
}
