import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);
        Random gerar = new Random();

        char p1, p2; //player 1 e player 2
        String player2 = "jkp";
        int sorteio; 

        do {

            System.out.println("* Jo Ken PO *");
            System.out.println("Escolha: ");
            System.out.println("j - Pedra;\nk - Papel\np - Tesoura\nPlayer 1:");
            p1 = teclado.next().charAt(0); // pega o primeiro caracter da string digitada

            sorteio = gerar.nextInt(3);//gera um numero aleatorio entre 0, 1 ou 2

            p2 = player2.charAt(sorteio); // ler o caracter sorteado pelo Player 2
            System.out.println("Player 2 jogou:");
            System.out.println(p2);
            
            if(p1 == p2)
            {
                System.out.println("Deu empate!");
            } 

            else if(p1 == 'j' && p2 == 'k')
            {
                System.out.println("Player 2 ganhou! Papel embrulha pedra");
            }

            else if(p1 == 'k' && p2 == 'j')
            {
                System.out.println("Player 1 ganhou! Papel embrulha pedra");
            }

            else if(p1 == 'j' && p2 == 'p')
            {
                System.out.println("Player 1 ganhou! Pedra quebra tesoura");
            }

            else if(p1 == 'p' && p2 == 'j')
            {
                System.out.println("Player 2 ganhou! Pedra quebra tesoura");
            }

            else if(p1 == 'p' && p2 == 'k')
            {
                System.out.println("Player 1 ganhou! Tesoura corta papel");
            }

            else if(p1 == 'k' && p2 == 'p')
            {
                System.out.println("Player 2 ganhou! Tesoura corta papel");
            }
            
        } while (p1 == 'j' || p1 == 'k' || p1 == 'p'); // enquanto o player 1 digitar uma jogada válida, o jogo continua

        
        System.out.println("Jogada indeterminada!");
        
    }
}
