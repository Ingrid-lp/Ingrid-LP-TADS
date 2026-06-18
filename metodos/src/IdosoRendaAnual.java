import java.util.Scanner;

public class IdosoRendaAnual 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        imprimeBanner();

        System.out.println("Qual o valor do seu salário mensal?");
        calculaRenda(teclado.nextDouble());
    }
    
    public static double calculaRenda(double salario) 
    {
        double calc;

        calc = salario * 12 + salario;

        System.out.println("Sua renda anual contando com o 13º é de: " + calc);

        return calc;
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
