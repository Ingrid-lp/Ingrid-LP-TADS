import java.util.Scanner;

/*Faça um programa que receba o valor de um carro e mostre uma tabela
com os seguintes dados:
• - quantidade de parcelas
• - valor da parcela.
• - preço final com juros
• Considere o seguinte:
• -O preço final para compra à vista tem um desconto de 20%;
• -A quantidades de parcelas pode ser: 12, 24, 36, 48 e 60. */

public class Carro 
{
    public static Scanner teclado = new Scanner(System.in);
    public static double carro, acres, valorP, PF, PA;

    public static void main(String[] args) 
    {
        int parcelas[] = {12,24,36,48,60};
        double percentuais[] = {6,12,18,24,30};

        System.out.println("Qual o valor do carro? ");
        carro = teclado.nextDouble();

        System.out.println("Valor a vista: R$" + carro * 0.80);
        System.out.println("Valor financiado e parcelas: ");
        System.out.printf("%-15s %-15s %-30s%n", "Meses", "Valor da PA", "Valor Final com juros");

        for(int i = 0; i < parcelas.length; i++)
        {
            PF = carro * (1 + percentuais[i] / 100);
            valorP = PF / parcelas[i];

            System.out.printf("%-15d %-15.2f %-15.2f%n", parcelas[i], valorP, PF);
        }
    }    
}
