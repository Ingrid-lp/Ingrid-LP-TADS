import java.io.PrintStream;
import java.util.Scanner;

public class JuroComposto 
{
    public static Scanner teclado = new Scanner(System.in);
    public static PrintStream video = new PrintStream(System.out);
    public static String aplicacao; // RDB, Cripto, CDB, Fundos
    public static double meses;     // Prazo de aplicação
    public static double juros;     // Rendimento mensal
    public static double capital;   // Valor inicial
    public static double montante;  // Quando rendeu no prazo
    public static void main(String[] args) throws Exception 
    {
        // o programa deve rodar várias vezes até o usuário desejar sair!
        video.println("** Programa de Rendimentos");

        aplicacao = escolherAplicacao();

        video.println("Voce escolheu: " + aplicacao);
        setValoresRendimento();

        getMontanteMensal();

        video.println("Obrigado por escolher o banco Bola!");
    }

    public static void setValoresRendimento() // capital, meses, juros
    {
        video.println("Qual o capital inicial? ");
        capital = teclado.nextDouble();

        video.println("Qual o numero de meses? ");
        meses = teclado.nextDouble();

        video.println("Qual o juro? ");
        juros = teclado.nextDouble();
    }

    public static void getMontanteMensal() 
    {
        int mesAmes;
        double resultado = capital;

        for (mesAmes = 1; mesAmes <= meses; mesAmes++)
        {
            resultado = resultado + (resultado * (juros / 100));

            video.print("Montante Mes " + mesAmes);
            video.printf(": R$ %.2f\n", resultado);
        }
    }

    public static String escolherAplicacao() 
    {
        String minhaAplicacao;
        System.out.println("Qual aplicação deseja?");
        System.out.println(" a.CDB\n b.RDB \n c.Cripto\n d.Fundos");
        System.out.println("Informe sua opção: ");

        switch (teclado.next().charAt(0)) {
            case 'a':
                minhaAplicacao = "CDB"; // 1.2/100 ao mês
                break;

            case 'b':
                minhaAplicacao = "RDB"; // 0.83/100 ao mês
                break;

            case 'c':
                minhaAplicacao = "CRIPTO"; // aleatório entre 2 e 8% ao mês
                break;

            default:
                minhaAplicacao = "FUNDOS"; // 0.70/100 ao mês
                break;

            // inserir poupança (0.5/100 ao mês) e atualizar default para digitação do usuário
            // o programa deve rodar várias vezes até o usuário desejar sair!    
        }
        
        return minhaAplicacao;
    }
}
