import java.util.Scanner;

/*Crie um vetor com 6 temperaturas aferidas em um município (pode
escolher seu preferido) desde a última quinta-feira (histórico de
temperaturas)
• Entrada: nome da cidade e 6 temperaturas
• Ao final, Seu programa vai retornar:
• Nome da cidade
• Média de temperatura na semana;
• Todas temperaturas registradas;
• Maior temperatura registrada;
• Menor temperatura registrada; */

public class Temperatura 
{
    public static Scanner teclado = new Scanner(System.in);
    static double[] temperatura;
    public static String cidade;
    public static double media, soma;
    
    public static void main(String[] args) 
    {
        temperatura = new double[6];

        getTemperatura();
        
        setTemperatura();
        
        calcTemperatura();
    }
    
    public static void getTemperatura()
    {
        System.out.println("Digite o nome da cidade: ");
        cidade = teclado.nextLine();

        System.out.println("Digite as temperaturas dos últimos 6 dias: ");
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Temperatura dia " + (i + 1) + ": ");
            temperatura[i] = teclado.nextDouble();
        }
    }
    
    public static void setTemperatura()
    {
        System.out.println("O nome da cidade é: " + cidade);
        System.out.println("As temperaturas são: " + "\n Dia 1: " + temperatura[0] + "\n Dia 2: "+ temperatura[1] + "\n Dia 3: "+ temperatura[2]
                + "\n Dia 4: " + temperatura[3] + "\n Dia 5: "+ temperatura[4] + "\n Dia 6: " + temperatura[5]);
    }

    public static void calcTemperatura() 
    {
        double maiorTemp = temperatura[0];
        double menorTemp = temperatura[0];

        soma = 0;

        for (int i = 0; i < 6; i++) 
        {
            soma = soma + temperatura[i];
        }

        media = (soma / 6);

        //media = (temperatura[0] + temperatura[1] + temperatura[2] + temperatura[3] + temperatura[4] + temperatura[5]) / 6;

        System.out.println("A média das temperaturas é: " + media);

        for (int i = 0; i < temperatura.length; i++) 
        {
            if (temperatura[i] > maiorTemp) 
            {
                maiorTemp = temperatura[i];
            }

            if (temperatura[i] < menorTemp) 
            {
                menorTemp = temperatura[i];
            }
        }

        System.out.println("A maior temperatura é:" + maiorTemp);
        System.out.println("A menor temperatura é: " + menorTemp);
    }
}