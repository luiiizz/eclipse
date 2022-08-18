import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void limparTela() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void main(String[] args) throws Exception {
        try (Scanner inputReader = new Scanner(System.in)) {
            limparTela();
            Pessoa p1 = new Pessoa();
            p1.nome = "Luiz";
            p1.idade = 22;
            System.out.printf("Oi eu sou o %s e tenho %d anos de idade\n\n", p1.nome, p1.idade);

            Pessoa p2 = new Pessoa();
            
            System.out.printf("Digite um nome para a Pessoa 2:");
            p2.nome = inputReader.next();
            System.out.printf("Digite um nome para a Pessoa 2:");
            p2.idade = inputReader.nextInt();
            System.out.printf("\n\nOi eu sou %s e tenho %d anos de idade\n", p2.nome, p2.idade);
        }
    }
}
