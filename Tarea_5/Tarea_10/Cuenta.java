package Tarea_10;

import java.util.Scanner;

public class Cuenta {
    //Cuenta con titular y cantidad
    private String titular;
    private float cantidad;

    //metodo constructor
    public Cuenta() {

    }
    //Mostrar los setters and getters
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public float getCantidad() {
        return cantidad;
    }
    public void setCantidad ( float cantidad) {
        this.cantidad = cantidad;
    }
    public void mostrar() {
        System.out.println("Titular de la cuenta:" + titular);
        System.out.println("Cantidad:  $" + cantidad);
    }
    public void ingresar( float cantidadIntroducida ) {
        if (cantidadIntroducida > 0) {
            cantidad += cantidadIntroducida;
        }
    }
    public void retirar( float valor) {
        cantidad -= valor;
    }
}
