package Tarea_8;

// Crear una función que sea un generador de
// contraseñas. Al llamarla debe devolver una
// contraseña (por ejemplo, puedes utilizar Math.random()
// para devolver un número aleatorio que podría ser una contraseña.
public class GeneradorContraseña {
    public static void main(String[] args) {
        //Generar contraseñas
        String newpassword = generarpassword();
        System.out.println(newpassword);
    }

    private static String generarpassword() {
        double aleatorio = Math.random() * 100000;
        long numeroAleatorio = Math.round(aleatorio);

        String password = "luciaMartinez" + numeroAleatorio;
        return password;
    }
}
