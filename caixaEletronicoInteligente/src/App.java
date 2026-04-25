import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        int mult = 10, saque, conta;
        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;

        System.out.println("Bem vindo ao caixa eletrônico inteligente!");

        do {
            
            System.out.println("Quanto deseja sacar? ");
            saque = teclado.nextInt();

            if(saque >= 10 && saque <= 500 && saque % mult == 0)
            {
                System.out.println("Saque Autorizado!");

                conta = saque;

                nota100 = conta / 100;
                conta = conta % 100;

                nota50 = conta / 50;
                conta = conta % 50;

                nota20 = conta / 20;
                conta = conta % 20;

                nota10 = conta / 10;

                System.out.println("Notas entregues:");
                System.out.println("Notas de 100: " + nota100);
                System.out.println("Notas de 50: " + nota50);
                System.out.println("Notas de 20: " + nota20);
                System.out.println("Notas de 10: " + nota10);
            }

            else if(saque < 10 || saque > 500)
            {
                System.out.println("Saque fora do limite! Tente novamente");
            }

            else {
                System.out.println("Saque não autorizado! Tente novamente");
            }
            
        } while (true);
    }
}
