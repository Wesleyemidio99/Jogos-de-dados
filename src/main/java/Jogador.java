public class Jogador {
    private String nome;
    Dado dado;

    public Jogador(String nome) {
        this.nome = nome;
        dado = new Dado();
    }

    public String getNome() {
        return nome;
    }
}
