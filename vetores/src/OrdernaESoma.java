import java.util.Scanner;

/* Fazer um método para ordenar o vetor..Código Prévio:
Fazer um método para somar os valores do vetor*/

public class OrdernaESoma 
{
    public static Scanner teclado = new Scanner(System.in);
    public static int soma = 0, aux;
    static int[] vetorOriginal = {17, 36, 48, 12, 10, 38};
    static int [] vetorOrdenado = new int[6];

    public static void main(String[] args) 
    {
        System.out.println("\nVetor fora de ordem: ");
        imprimeVetor(vetorOriginal);

        vetorOrdenado = ordenarVetor(vetorOriginal);

        System.out.println("\nVetor ordenado: ");
        imprimeVetor(vetorOrdenado);

        calcVetor();
    }
    
    public static int[] ordenarVetor(int[] v)
    {
        for(int i = 0; i < v.length; i++)
        {
            for(int j = i + 1; j < v.length; j++)
            {
                if(v[i] > v[j])
                {
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }

                /*1. Escolhe uma posição.
                2. Compara com todas as posições seguintes.
                3. Se encontrar um número menor, troca.
                4. Repete até o fim. */
            }
        }

        return v;
    }

    public static void imprimeVetor(int[] vetor)
    {
        for(int i = 0; i < 6; i++)
        {
            System.out.printf("%d ", vetor[i]);
        }
    }

    public static void calcVetor()
    {
        for (int i = 0; i < 6; i++) 
        {
            soma = soma + vetorOriginal[i];
        }

        System.out.println("\nSoma dos números do vetor: " + soma);
    }
}
