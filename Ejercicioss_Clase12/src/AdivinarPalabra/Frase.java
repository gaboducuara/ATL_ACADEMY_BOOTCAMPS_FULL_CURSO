package AdivinarPalabra;

//es una clase en Java llamada Frase
public class Frase {
    //Esta clase tiene dos variables de instancia:
    //pista y palabraCorrecta
    private String pista;
    private String palabraCorrecta;

    public Frase(String pista, String palabraCorrecta){
        //La clase tiene un constructor que toma dos argumentos,
        //un String para pista y otro String para palabraCorrecta.
        this.pista = pista;
        this.palabraCorrecta = palabraCorrecta;
    }
    //La clase también tiene dos métodos públicos, getPista() y getPalabraCorrecta(),
    //que devuelven los valores de las variables de instancia.
    public String getPista() {
        return pista;
    }
    public String getPalabraCorrecta() {
        return palabraCorrecta;
    }

}
