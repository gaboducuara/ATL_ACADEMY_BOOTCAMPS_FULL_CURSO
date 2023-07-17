package Tarea_10;
public class Cliente {
    public String nombre;
    public String apellido;
    public Integer edad;

    public Cliente (String parametroNombre , String parametroApellido , Integer parametroEdad) {
        nombre = parametroNombre ;
        apellido = parametroApellido;
        edad = parametroEdad;
    }
    public void mostrarDatos() {
        System.out.println("Nombre Completo" + " " + nombre + " " + apellido);
        System.out.println("Edad:" + edad);
    }

    public String getNombre () { return nombre;} 
    //public void setNombre(String value) { nombre = value; }
    public String getApellido() { return apellido;}
    //public void setApellido(String value) { apellido = value;}
    public Integer getEdad() { return edad; }
    //public void setEdad(Integer value ) { edad = value; }
}
