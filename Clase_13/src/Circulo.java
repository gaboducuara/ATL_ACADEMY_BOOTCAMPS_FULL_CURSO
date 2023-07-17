import java.util.Scanner;

public class Circulo extends FIgura {
    private double radio;

    //los getters and setters es un proceso de encapsulamiento
    //del string colorfondo y float radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {this.radio = radio;}

    public double calcularArea() {
        double area = Math.PI * (radio * radio);
        return area;
    }

    public void cargarDatos() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa el radio en centimetros:");
        radio = teclado.nextDouble();
    }
};
