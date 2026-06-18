import java.util.Scanner;

/*Enunciado
Crie um programa em Java que:
•declare um vetor para armazenar 5 idades inteiras;
•receba os valores pelo teclado usando Scanner;
•ao final, mostre todas as idades cadastradas.
Exemplo de entrada:
60
12
81
65
70
-Qual a idade do mais novo?
-Qual a idade do mais velho?
-Imprima todas idades na sequencia inversa. */

public class Idade 
{
    public static Scanner teclado = new Scanner(System.in);
    static int [] idade;

    public static void main(String[] args) 
    {
        idade = new int[5];

        getIdade();
        calcIdade();
        imprimeIdade();
    }

    public static void getIdade()
    {
        System.out.println("Digite 5 idades ");

        for (int i = 0; i < idade.length; i++) 
        {
            System.out.println("Idade " + (i + 1) + ": ");
            idade[i] = teclado.nextInt();
        }
    }

    public static void calcIdade()
    {
        int maiorIdade = idade[0];
        int menorIdade = idade[0];

        for (int i = 0; i < idade.length; i++) 
        {
            if (idade[i] > maiorIdade) 
            {
                maiorIdade = idade[i];
            }

            if (idade[i] < menorIdade) 
            {
                menorIdade = idade[i];
            }
        }

        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
    }

    private static void imprimeIdade() 
    {
        System.out.print("Inverso das idades: ");

        for (int i = idade.length - 1; i >= 0; i--) 
        {
            System.out.print(" " + idade[i]);
        }
    }
}
