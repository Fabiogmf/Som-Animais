import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome para o cão: ");
        String nomeCao = scanner.nextLine();

        System.out.println("Insira o nome para o gato: ");
        String nomeGato = scanner.nextLine();

        Cao cao = new Cao(nomeCao);
        Gato gato = new Gato(nomeGato);

        cao.emitirSom();
        cao.latir();

        gato.emitirSom();
        gato.miar();
    }
}

