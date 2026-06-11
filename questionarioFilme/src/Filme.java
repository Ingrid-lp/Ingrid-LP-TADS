import java.util.Scanner;

public class Filme
{
    public static Scanner teclado = new Scanner(System.in);
    public static int idade;
    public static int opcao;
    public static int opniao;
    public static int regular = 0;
    public static int bom = 0;
    public static int otimo = 0;

    public static void main(String[] args) throws Exception
    {
        System.out.println("Olá, ajude essa DEV, dê a sua opnião sobre o filme DeadPool X Wolverine");

        do
        {
            menu();
            calc();
        } while (opniao < 15);
    }

    public static void menu()
    {
        for(opniao = 0; opniao < 15; opniao ++)
        {
            System.out.println("Pessoa: " + (opniao + 1));
            System.out.println("Antes de tudo qual a sua idade? ");
            idade = teclado.nextInt();

            System.out.println("1 - Regular");
            System.out.println("2 - Bom");
            System.out.println("3 - Ótimo");
            System.out.println("Digite a sua opção: ");
            opcao = teclado.nextInt();
        }
    }

    public static int calc()
    {
        switch (opcao) {
            case 1:
                regular ++;
                System.out.println(regular);
                break;

            default:
                break;
        }

        return opcao;
    }
}
