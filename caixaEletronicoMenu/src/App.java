import java.util.Scanner;

public class App 
{
    public static Scanner teclado = new Scanner(System.in);
    public static int mult = 10, conta;
    public static int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0;
    public static double depo = 0;
    public static double saldo = 0;
    public static int saque = 0;
    public static int opcao;

    public static void main(String[] args) throws Exception 
    {

        System.out.println("Bem vindo ao caixa eletrônico inteligente!");

        do {
            menu();
        } while (opcao != 4);
    }

    public static void menu()
    {
        System.out.println("1 - Depósito\n" +
                            "2 - Ver saldo\n" +
                            "3 - Efetuar Saque\n" +
                            "4 - Sair");
                            opcao = teclado.nextInt();
                            escolha();

                            //a-Depósito //atualiza Saldo
                            //b-Ver saldo; //iniciando em Zero
                            //c-Efetuar Saque //diminui saldo
                            //d-Sair
    }

    private static int escolha() 
    {
        switch (opcao) {
            case 1:
                deposito();
                break;

            case 2:
                saldo();
                break;

            case 3:
                saque();
                break;    

            case 4:
                System.out.println("Até a próxima!"); 
                break;

            default:
                System.out.println("Opção inválida! Tente novamente");
                break;
        }

        return opcao;
    }

    public static void deposito()
    {
        System.out.println("Quanto deseja depositar? ");
        depo = teclado.nextDouble();

        saldo += depo;
    }

    public static void saldo()
    {


        System.out.println("Saldo atual: R$" + saldo);

    }

    public static void saque()
    {
        /*System.out.println("Quanto deseja sacar? ");
        saque = teclado.nextInt();
        saldo--;*/

        System.out.println("Quanto deseja sacar? ");
            saque = teclado.nextInt();

        if(saque < 10 || saque > 500)
        {
            System.out.println("Saque fora do limite! Tente novamente");
        }
        else if(saque > saldo)
        {
            System.out.println("Saldo insuficiente!");
        }

        else if(saque >= 10 && saque <= 500 && saque % mult == 0)
        {

            saldo -= saque;

            System.out.println("Saque Autorizado!");

            nota100 = 0;
            nota50 = 0;
            nota20 = 0;
            nota10 = 0;

            conta = saque;

            nota100 = conta / 100;
            conta = conta % 100;

            nota50 = conta / 50;
            conta = conta % 50;

            nota20 = conta / 20;
            conta = conta % 20;

            nota10 = conta / 10;

            System.out.println("Notas entregues");

            if(nota100 > 0)
            {
                System.out.println("Notas de 100: " + nota100);
            }
                
            if(nota50 > 0)
            {
                System.out.println("Notas de 50: " + nota50);
            }
                
            if(nota20 > 0)
            {
                System.out.println("Notas de 20: " + nota20);
            }
                
            if(nota10 > 0)
            {
                System.out.println("Notas de 10: " + nota10);
            }
                
        }

        else
        {
            System.out.println("Saque não autorizado! Tente novamente");
        }

    }
}
