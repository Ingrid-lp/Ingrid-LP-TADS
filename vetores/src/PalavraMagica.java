import java.util.Scanner;

/*Entrada: Leia uma palavra do usuário:
• Calcule e Imprima:
• Quantas letras essa palavra tem?
• Qual a primeira letra da palavra?
• Qual a ultima letra da palavra?
• Como é a palavra ao contrário?
• DESAFIO: Será que é um palíndromo?
• Exemplos: ARARA, MIRIM, reviver, OSSO, OMISSISSIMO, NATAN */

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
