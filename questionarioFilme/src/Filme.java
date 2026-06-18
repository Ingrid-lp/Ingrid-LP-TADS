import java.util.Scanner;

public class Filme
{
    public static Scanner teclado = new Scanner(System.in);
    public static int idade;
    public static int opcao;
    public static int opniao;
    public static double somaM = 0;
    public static double somaBom = 0;
    public static int regular = 0;
    public static int bom = 0;
    public static int otimo = 0;

    public static void main(String[] args) throws Exception
    {
        System.out.println("Olá, ajude essa DEV, dê a sua opnião sobre o filme DeadPool X Wolverine");

            menu();
            System.out.println("Votos regular: " + regular);
            mediaIdade();
            porcentagemOtimo();
    }

    public static void menu()
    {
        for(opniao = 0; opniao < 15; opniao ++)
        {
            System.out.println("Pessoa: " + (opniao + 1));
            System.out.println("Antes de tudo qual a sua idade? ");
            idade = teclado.nextInt();
            somaM = somaM + idade;

            System.out.println("1 - Regular");
            System.out.println("2 - Bom");
            System.out.println("3 - Ótimo");
            System.out.println("Digite a sua opção: ");
            opcao = teclado.nextInt();
            calc();
        }
    }

    public static int calc()
    {
        switch (opcao) {
            case 1:
                regular ++;
                break;

            case 2:
                bom ++;
                somaBom += idade;
                break;

            case 3:
                otimo ++;
                break;    

            default:
                System.out.println("Opção inválida! Tente novamente");
                opniao --;
                break;
        }

        return opcao;
    }

    public static double mediaIdade()
    {
        double media = 0;

        media = somaBom / bom;

        System.out.println("A média das idades das pessoas que responderam bom: " + media);

        return media;
    }

    public static double porcentagemOtimo()
    {
        double porcento = 0;

        porcento = (otimo / 15.0) * 100;

        System.out.println("A porcentagem de pessoas que votaram em otimo: " + porcento);

        return porcento;
    }
}
