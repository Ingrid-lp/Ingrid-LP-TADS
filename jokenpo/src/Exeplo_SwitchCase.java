import java.util.Random;
import java.util.Scanner;

public class Exeplo_SwitchCase 
{
    public static void main(String[] args) 
    {
        /* Declaração de objetos e variáveis */
        Scanner teclado = new Scanner(System.in);
        Random gerar = new Random();
        int sorteio;
        char p1, p2; // player1 e player2
        String Player2 = "jkp";

        /* Entradas */
        System.out.println("*Jo Ken Po*");
        System.out.println("Escolha:");
        System.out.println(" j-Pedra; \n k-Papel\n p-Tesoura \n Player1: ");
        p1 = teclado.next().charAt(0); // ler o primeiro caracter player1

        sorteio = gerar.nextInt(3); // sorteia entre 0, 1 ou 2
        p2 = Player2.charAt(sorteio); // ler o caracter sorteado para o player2
        System.out.println(" Gepeto jogou " + p2);

        /* Lógica e-ou Aritmética */
        switch (p1) {

            case 'j':

                System.out.print("Vc escolheu pedra,");
                // utilizando if-else
                if (p2 == 'j') {
                    System.out.print("Gepeto escolheu pedra, deu empate!");
                } else if (p2 == 'k') {
                    System.out.print("Gepeto escolheu papel, IA venceu!");
                } else // if( p2=='p')
                    System.out.print("Gepeto escolheu tesoura, vc venceu!");
                break;

            case 'k':

                System.out.print("Vc escolheu papel");
                
                // utilizando switch-case
                switch (p2) {
                    case 'j':
                        System.out.print(" Gepeto jogou pedra, vc venceu!");
                        break;
                    case 'k':
                        System.out.print(" Gepeto jogou papel, deu empate!");
                        break;
                    default: // se IA jogou 'p'
                        System.out.println(" Gepeto jogou tesoura, IA venceu!");
                }

                break;
            default:
                System.out.println("Jogada indeterminada!");
        }
    }
}