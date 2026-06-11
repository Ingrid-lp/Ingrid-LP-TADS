import java.util.Scanner;

public class PalavraMagica 
{
    public static Scanner teclado = new Scanner(System.in);
    public static String palavraS;
    public static char[] palavraV;

    public static void main(String[] args) 
    {
        System.out.println("Informe sua palavra mágica: ");
        palavraS = teclado.next();

        // converter de string para vetor de char
        palavraV = palavraS.toCharArray();

        System.out.print("A palavra mágica é: ");
        System.out.println(palavraV);

        System.out.println("Tamanho da palavra: " + palavraV.length); // mostra o tamanho da palavra (vetor) em int

        System.out.println("Primeira letra da palavra: " + palavraV[0]); // mostra a primeira letra da palavra (vetor) em char

        char u = palavraV[palavraV.length - 1]; // guarda a última letra da palavra (vetor) em char

        System.out.println("Última letra da palavra: " + palavraV[u]); // mostra a última letra da palavra (vetor) em char

        for(int i = u; i >= 0; i--)
        {
            System.out.println(palavraV[i]);
        }

    }    
}
