package Tarea_8;


//Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
public class AreaCuadrado {

    public static void main (String[] args) {
    float sumatoria = 0;
    sumatoria += getAreaCuadrado(10 , 15);
    sumatoria += getAreaCuadrado(10 , 35);
    System.out.println("La sumatoria total es: " + sumatoria);
    }
    private static float getAreaCuadrado (float ancho, float alto) {
        return ancho * alto;
    }
}

