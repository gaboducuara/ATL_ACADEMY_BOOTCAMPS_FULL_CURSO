package NotasDeAlumnos;

import java.util.ArrayList;
import java.util.List;

public class AtributosAlumnos {
    private String nombre;
    private String apellido;
    private List <Double> notas = new ArrayList<>();
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public List<Double> getNotas() {
        return notas;
    }
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
