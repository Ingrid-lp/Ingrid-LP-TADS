import java.util.Scanner;

public class Rendimento
{
    public static Scanner teclado = new Scanner(System.in);
    public static String aplicacao; // RDB, Cripto, CDB, Fundos, Poupança
    public static double meses;     // Prazo de aplicação
    public static double juros;     // Rendimento mensal
    public static double capital;   // zoValor inicial
    public static double montante; // Quando rendeu no prazo
    public static double jurosOpcao;
    public static char opcao;

    public static void main(String[] args)
    {

        System.out.println("Bem vindo(a) ao programa de cálculo de rendimento!");

        do {
            opcao = escolherAplicacao();

            if (aplicacao.equals("INVÁLIDA"))
            {
                continue;
            }

            if (opcao == 'g')
            {
                System.out.println("Obrigado, sigo à disposição!");
                break;
            }

            System.out.println("Você escolheu: " + aplicacao);
            System.out.println("O juros é de: " + juros + "%");

            capturaValores();

            getMontanteMensal();

        } while (true);
    }

    public static void capturaValores()
    {
        System.out.println("Qual o seu montante inicial? ");
        capital = teclado.nextDouble();

        System.out.println("Quantos meses o capital ficará aplicado? ");
        meses = teclado.nextDouble();
    }

    public static void getMontanteMensal()
    {
        int mesAmes;
        double resultado = capital;

        for (mesAmes = 1; mesAmes <= meses; mesAmes++)
        {
            resultado = resultado + (resultado * (juros / 100));

            System.out.print("Montante Mes " + mesAmes);
            System.out.printf(": R$ %.2f\n", resultado);
        }

        System.out.printf("\nMontante final: R$ %.2f\n", resultado);
    }

    public static char escolherAplicacao()
    {

        System.out.println("Qual aplicação deseja?");
        System.out.println(" a.CDB\n b.RDB \n c.Cripto\n d.Fundos \n e.Poupança \n f.Informar juros manualmente \n g.Sair");
        System.out.println("Informe sua opção: ");
        opcao = teclado.next().charAt(0);
        switch (opcao)
        {
            case 'a':
                aplicacao = "CDB"; // 1.2/100 ao mês
                juros = 1.2;
                break;

            case 'b':
                aplicacao = "RDB"; // 0.83/100 ao mês
                juros = 0.83;
                break;

            case 'c':
                aplicacao = "CRIPTO"; // aleatório entre 2 e 8% ao mês
                juros = (Math.random() * 6) + 2; // me inspirei em um video do tutube
                break;

            case 'd':
                aplicacao = "FUNDOS"; // 0.8/100 ao mês
                juros = 0.8;
                break;

            case 'e':
                aplicacao = "POUPANÇA"; // (0.5/100 ao mês)
                juros = 0.5;
                break;

            case 'f':
                aplicacao = "MANUAL";
                System.out.println("Informe o juros mensal em %: ");
                juros = teclado.nextDouble();
                break;

            case 'g': 
                aplicacao = "SAIR";
                break;

            default:
                System.out.println("Opção inválida!");
                aplicacao = "INVÁLIDA";
                break;
        }

        return opcao;
    }

}
