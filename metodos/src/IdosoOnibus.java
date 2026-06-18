import java.util.Scanner;

public class IdosoOnibus 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        imprimeBanner();

        System.out.println("Digite o seu ano de nascimento: ");
        verificaIdade(teclado.nextInt());

        imprimeOnibus();
    }

    public static void verificaIdade(int AnoNasc)
    {
        int calc;

        calc = 2026 - AnoNasc;

        if(calc >= 65)
        {
            System.out.println("Você é idoso, pode entrar pela porta de trás do ônibus!");
        }

        else
        {
            System.out.println("Você não é idoso, entre pela porta da frente!");
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

    public static void imprimeOnibus()
    {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      ________________________        ║");
        System.out.println("║  ___/|[][][][][][][][][][]|\\___      ║");
        System.out.println("║ | _   VEIO TRANSPORTES       _ |     ║");
        System.out.println("║ '=(_)----------------------(_)='     ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
}
