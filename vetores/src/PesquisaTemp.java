import java.util.Scanner;

/*Enunciado
Crie um programa em Java que:
•declare um vetor com 12 posições, representando temperaturas médias dos meses do
ano;
•receba os valores pelo teclado;
•calcule:
•temperatura média anual;
•mês mais quente;
•mês mais frio;
•quantos meses ficaram acima da média.
Exemplo de entrada:
25 26 28 22 20 18 17 19 21 23 24 27
Saída esperada:
Temperatura média: 22.5
Mês mais quente: 3
Mês mais frio: 7
Meses acima da média: 6 
Desafio extra
Mostrar o nome do mês ao invés do número:
Mês mais quente: Março */

public class PesquisaTemp 
{
    public static Scanner teclado = new Scanner(System.in);
    static double [] temperatura;
    public static double media, soma;
    public static int mesQuente = 0, mesFrio = 0, acimaMedia = 0;
    static String[] meses = {
    "Janeiro", "Fevereiro", "Março",
    "Abril", "Maio", "Junho",
    "Julho", "Agosto", "Setembro",
    "Outubro", "Novembro", "Dezembro"};

    public static void main(String[] args) 
    {
        temperatura = new double[12];

        getTemperatura();
        calcTemperatura();
    }

    private static void getTemperatura() 
    {
        System.out.println("Digite as temperaturas médias de cada mês ");

        for (int i = 0; i < temperatura.length; i++) 
        {
            System.out.println("Média de temperatura do mês " + (meses[i]) + ": ");
            temperatura[i] = teclado.nextInt();
        }
    }

    private static void calcTemperatura() 
    {
        double maiorTemp = temperatura[0];
        double menorTemp = temperatura[0];

        soma = 0;

        for (int i = 0; i < 12; i++) 
        {
            soma = soma + temperatura[i];
        }

        media = (soma / 12);

        System.out.println("A média das temperaturas anuais é: " + media);

        for (int i = 0; i < temperatura.length; i++) 
        {
            if (temperatura[i] > maiorTemp) 
            {
                maiorTemp = temperatura[i];
                mesQuente = i;
            }

            if (temperatura[i] < menorTemp) 
            {
                menorTemp = temperatura[i];
                mesFrio = i;
            }

            if(temperatura[i] > media)
            {
                acimaMedia++;
            }
        }

        System.out.println("Mês mais quente: " + (meses[mesQuente]));
        System.out.println("Mês mais frio: " + (meses[mesFrio]));
        System.out.println("Meses acima da média: " + acimaMedia);
    }
}
