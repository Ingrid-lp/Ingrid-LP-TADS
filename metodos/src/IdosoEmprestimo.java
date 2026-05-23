import java.util.Scanner;

public class IdosoEmprestimo 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        imprimeBanner();

        System.out.println("Bora ver se você pode emprestar dinheiro!!");
        System.out.println("Informe o valor do seu salário mensal e o valor da parcela do consignado: ");
        verifica(teclado.nextDouble(), teclado.nextDouble());
    }
    
    public static boolean verifica(double salario, double  parcelas)
    {

        if (parcelas <= (salario * 35 / 100)) {
            System.out.println("Você pode emprestar!!");
            return true;
        }

        else {
            System.out.println("Você não pode emprestar!");
            return false;
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
