import java.util.Random;


public class Dado {
    private int valor;
    private Random gerador;

    public Dado() {
        gerador = new Random();
    }

    public int rolarDado(){

        valor = gerador.nextInt(6)+1;
        return valor;
    }
}
