import java.util.Scanner;

public class IdosoEntrada 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        imprimeBanner();

        System.out.println("Quantos anos você tem e qual o valor do ingresso? ");
        calculaEntrada(teclado.nextInt(), teclado.nextDouble());

    }
    
    public static void calculaEntrada(int idade, double ingresso)
    {
        double calc;

        if(idade >= 65)
        {
            System.out.println("Você é idoso, você tem direito a meia entrada!");

            calc = ingresso / 2;

            System.out.println("O valor da sua meia entrada é: " + calc);

            System.out.println("====================================");
            System.out.println("||          INGRESSO              ||");
            System.out.println("====================================");
            System.out.println("|| EVENTO : BAILE DO VEIO         ||");
            System.out.println("|| ENTRADA: MEIA                  ||");
            System.out.println("|| STATUS : É VEIO                ||");
            System.out.println("====================================");
        }

        else
        {
            System.out.println("Você não é idoso, a sua entrada é inteira!");
            System.out.println("O valor da sua entrada é: " + ingresso);

            System.out.println("====================================");
            System.out.println("||          INGRESSO              ||");
            System.out.println("====================================");
            System.out.println("|| EVENTO : BAILE DO VEIO         ||");
            System.out.println("|| ENTRADA: INTEIRA               ||");
            System.out.println("|| STATUS : NÃO É VEIO            ||");
            System.out.println("====================================");
        }
    }
    
    public static void imprimeBanner()
    {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║ ██    ██ ███████ ██  ████  ║");
        System.out.println("║ ██    ██ ██      ██ ██  ██ ║");
        System.out.println("║ ██    ██ █████   ██ ██  ██ ║");
        System.out.println("║  ██  ██  ██      ██ ██  ██ ║");
        System.out.println("║   ████   ███████ ██  ████  ║");
        System.out.println("╚════════════════════════════╝");
    }
}
