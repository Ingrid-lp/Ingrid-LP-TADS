import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double renda, mensalidade, valorF, desconto, conta;

        System.out.println("Qual o valor da sua mensalidade? ");
        mensalidade = teclado.nextDouble();

        System.out.println("Qual a sua renda mensal? ");
        renda = teclado.nextDouble();

        if (renda <= 1500) {
            desconto = 0.50;
            conta = mensalidade * desconto;
            valorF = mensalidade - conta;

            System.out.println(
                    "O valor do seu desconto é de: " + conta + " E o valor final da mensalidade é de: " + valorF);
        }

        else if (renda <= 3000) {
            desconto = 0.25;
            conta = mensalidade * desconto;
            valorF = mensalidade - conta;

            System.out.println(
                    "O valor do seu desconto é de: " + conta + " E o valor final da mensalidade é de: " + valorF);
        }

        else {
            System.out.println("O valor da sua mensalidade é de: " + mensalidade);
        }
    }
}
