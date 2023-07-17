package Tarea_10;
import java.util.Scanner;

// java: package org.springframework.boot does not exist
public class POO {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la cantidad de dinero");
        float cantidadIntroducida = teclado.nextFloat();
        cuenta.ingresar(cantidadIntroducida);


        System.out.println("retire la cantidad de dinero");
        float cantidadRetirar = teclado.nextFloat();
        cuenta.retirar( cantidadRetirar );

        cuenta.mostrar();
        //Cliente cliente1 = cargarCliente();
        //Cliente cliente2 = cargarCliente();
        //Cliente cliente3 = cargarCliente();
        //Cliente cliente4 = cargarCliente();
        //cliente1.mostrarDatos();
    }

    private static Cliente cargarCliente() {
        Scanner teclado = new Scanner(System.in);
        Cliente cliente1 = new Cliente("oswaldo", "Martinez", 45 );

        System.out.print("Ingrese el nombre: ");
        //cliente1.setNombre(teclado.nextLine());

        //cliente.nombre = teclado.nextLine();
        //System.out.println(cliente1.getNombre());

        System.out.print("Ingrese el Apellido: ");
        //cliente1.setApellido(teclado.nextLine());
        System.out.print("Ingrese el Edad: ");
        //cliente1.setEdad(teclado.nextInt());
        return cliente1;
    }

}
