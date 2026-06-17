import java.util.Scanner;

public class PalavraMagica {
    public static Scanner teclado = new Scanner(System.in);
    public static String palavraS;
    public static char[] palavraV;

    public static void main(String[] args) {
        String invertida = "";

        System.out.println("Informe sua palavra mágica: ");
        palavraS = teclado.next();

        // converter de string para vetor de char
        palavraV = palavraS.toCharArray();

        System.out.print("A palavra mágica é: ");
        System.out.println(palavraV);

        System.out.println("Tamanho da palavra: " + palavraV.length); // mostra o tamanho da palavra (vetor) em int

        System.out.println("Primeira letra da palavra: " + palavraV[0]); // mostra a primeira letra da palavra (vetor)
                                                                         // em char

        // Última letra
        System.out.println("Última letra da palavra: " + palavraV[palavraV.length - 1]);

        // Palavra ao contrário
        System.out.print("Palavra ao contrário: ");

        for (int i = palavraV.length - 1; i >= 0; i--) {
            System.out.print(palavraV[i]);
            invertida += palavraV[i];
        }

        System.out.println("\nSerá que é um palíndromo? ");

        if (palavraS.equals(invertida)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }

    }
}
