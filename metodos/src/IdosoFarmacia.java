import java.util.Scanner;

public class IdosoFarmacia {
    
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        imprimeBanner();

        System.out.println("Bora calcular o desconto do idoso na farmácia!!");
        System.out.println("Qual a sua idade, valor da compra e a porcentagem de desconto? ");
        calcFarmacia(teclado.nextInt(), teclado.nextDouble(), teclado.nextDouble());
    }
    
    public static double calcFarmacia(int idade, double valor, double desconto)
    {
        double calc;

        if (idade >= 65) {
            calc = valor - (valor * desconto / 100);

            System.out.println("Você é idoso! O valor final com o desconto final foi de: " + calc);
        }

        else {
            calc = valor;

            System.out.println("Você não é idoso! O valor final sem desconto é de: " + valor);
        }

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
