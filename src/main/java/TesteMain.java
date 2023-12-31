import java.util.Scanner;

public class TesteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int dadoUm;
        int dadoDois;

        System.out.println("Digite o nome do 1º Jogador:");
        nome = scanner.nextLine();
        Jogador primeiroJogador = new Jogador(nome);

        System.out.println("Digite o nome do 2º Jogador:");
        nome = scanner.nextLine();
        Jogador segundoJogador = new Jogador(nome);

        dadoUm = primeiroJogador.dado.rolarDado();
        dadoDois = segundoJogador.dado.rolarDado();

        System.out.println("Primeiro jogador: " +dadoUm);
        System.out.println("Segundo jogador: "+dadoDois);

        if (dadoUm == dadoDois){
            System.out.println("Jogo empatou, jogue novamente.");
        }
        else if (dadoUm > dadoDois){
            System.out.println(primeiroJogador.getNome() + "Jogador ganhou.");

        }
        else {
            System.out.println(segundoJogador.getNome() + "Segundo jogador ganhou.");
        }

        scanner.close();

    }
}
