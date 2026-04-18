import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int anoNasc, idade, aposenta;
        double renda;
        boolean dev;
        char genero;
        String nome;

        Scanner teclado = new Scanner(System.in);
        PrintStream video = new PrintStream(System.out);

        video.println("Calculadora de idade!");
        video.println("Qual o seu nome? ");
        nome = teclado.next();

        video.println("Voce e programador?");
        dev = teclado.nextBoolean();

        video.println("Qual o seu genero (M/F/G)?");
        genero = teclado.next().charAt(0); // forma adequada de ler um char, charAt(0) pega a letra 0 da palavra

        video.println("Qual a sua renda mensal?");
        renda = teclado.nextDouble();

        video.println("Em que ano voce nasceu?");
        anoNasc = teclado.nextInt();

        idade = 2026 - anoNasc;
        renda = renda * 13;

        if (genero == 'f') // teste para ver se é feminino
        {
            aposenta = 70 - idade; // daqui quanto tempo aposenta se feminino
        }

        else {
            aposenta = 65 - idade; // previsão de aposentadoria
        }

        video.println("Nesse ano " + nome + " completara " + idade + " anos");
        video.println("Sua renda anual e de R$ " + renda);
        video.println("Faltam " + aposenta + " anos para se aposentar!");
    }
}
