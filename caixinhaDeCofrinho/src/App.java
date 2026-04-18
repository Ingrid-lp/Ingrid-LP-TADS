import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        double meta = 100;
        double total = 0;
        double deposito;

        System.out.println("Você tem uma meta de 100 reais");

        while(total < meta)
        {
            System.out.println("Quanto vai depositar? ");
            deposito = teclado.nextDouble();

            total = total + deposito;
        }

        System.out.println("Total acumulado: " + total);
        System.out.println("Meta Atingida!");
    }
}
