import java.util.Scanner;
import java.util.Random;

public class Jokenpo_SwitchCase 
{
    public static void main(String[] args) 
    {
        /* Declaração de objetos e variáveis */
        Scanner teclado = new Scanner(System.in);
        Random gerar = new Random();
        int sorteio, pontoP1 = 0, pontoP2 = 0, empate = 0;
        char p1, p2; // player1 e player2
        String Player2 = "jkp";

        do 
        {
            /* Entradas */
            System.out.println("\n*Jo Ken Po*");
            System.out.println("Escolha:");
            System.out.println(" j-Pedra; \n k-Papel\n p-Tesoura \n Sair - Qualquer tecla \n Player1: ");
            p1 = teclado.next().charAt(0); // ler o primeiro caracter player1

            sorteio = gerar.nextInt(3); // sorteia entre 0, 1 ou 2
            p2 = Player2.charAt(sorteio); // ler o caracter sorteado para o player2
            System.out.println(" Gepeto jogou: " + p2);

        /* Lógica e-ou Aritmética */
        switch (p1) {

            case 'j':

                System.out.print("Vc escolheu pedra,");
                // utilizando if-else
                if (p2 == 'j') 
                {
                    System.out.print("Gepeto escolheu pedra, deu empate!");
                    empate = empate + 1;
                }
                
                else if (p2 == 'k') 
                {
                    System.out.print("Gepeto escolheu papel, IA venceu!");
                    pontoP2 = pontoP2 + 1;
                }
                
                else
                { // if( p2=='p')
                    System.out.print("Gepeto escolheu tesoura, vc venceu!");
                    pontoP1 = pontoP1 + 1;
                }
                break;

            case 'k':

                System.out.print("Vc escolheu papel");

                // utilizando switch-case
                switch (p2) {
                    case 'j':
                        System.out.print("Gepeto jogou pedra, vc venceu!");
                        pontoP1 = pontoP1 + 1;
                        break;
                    case 'k':
                        System.out.print("Gepeto jogou papel, deu empate!");
                        empate = empate + 1;
                        break;
                    default: // se IA jogou 'p'
                        System.out.print("Gepeto jogou tesoura, IA venceu!");
                        pontoP2 = pontoP2 + 1;
                }

                break;

            case 'p':

                System.out.print("Vc escolheu tesoura, ");

                if (p2 == 'j') {
                    System.out.println("Gepeto escolheu pedra, IA venceu!");
                    pontoP2 = pontoP2 + 1;
                }

                else if (p2 == 'k') {
                    System.out.println("Gepeto escolheu papel, vc venceu!");
                    pontoP1 = pontoP1 + 1;
                }

                else {
                    System.out.println("Gepeto escolheu tesoura, deu empate!");
                    empate = empate + 1;
                }

                break;
                
            default:
                System.out.println("Jogada indeterminada!");
        }
        

    } while (p1 == 'j' || p1 == 'k' || p1 == 'p');
        
        System.out.println("Jogo acabou!");

        System.out.println("Pontuação final:");
        System.out.println("P1 = " + pontoP1);
        System.out.println("P2 = " + pontoP2);
        System.out.println("Quantas vezes deram empate = " + empate);

        if(pontoP1 > pontoP2)
        {
            System.out.println("Parabéns, vc venceu a IA!!!!!!!");
            System.out.println("       ___________");
            System.out.println("      '._==_==_=_.'");
            System.out.println("      .-\\:      /-.");
            System.out.println("     | (|:.     |) |");
            System.out.println("      '-|:.     |-'");
            System.out.println("        \\::.    /");
            System.out.println("         '::. .'");
            System.out.println("           ) (");
            System.out.println("         _.' '._");
            System.out.println("        `\"\"\"\"\"\"\"`");
            System.out.println("        VOCÊ É O CAMPEÃO!");
        }

        else if(pontoP1 < pontoP2)
        {
            System.out.println("Não foi dessa vez, a IA venceu!!!!!");
            System.out.println("       ___________");
            System.out.println("      '._==_==_=_.'");
            System.out.println("      .-\\:      /-.");
            System.out.println("     | (|:.     |) |");
            System.out.println("      '-|:.     |-'");
            System.out.println("        \\::.    /");
            System.out.println("         '::. .'");
            System.out.println("           ) (");
            System.out.println("         _.' '._");
            System.out.println("        `\"\"\"\"\"\"\"`");
            System.out.println("        A IA É O CAMPEÃO!");
        }

        else
        {
            System.out.println("Niguém ganhou, deu empate!!!!");
            System.out.println("       ___________        ___________");
            System.out.println("      '._==_==_=_.'      '._==_==_=_.'");
            System.out.println("      .-\\\\:      /-.      .-\\\\:      /-.");
            System.out.println("     | (|:.     |) |    | (|:.     |) |");
            System.out.println("      '-|:.     |-'      '-|:.     |-'");
            System.out.println("        \\\\::.    /          \\\\::.    /");
            System.out.println("         '::. .'            '::. .'");
            System.out.println("           ) (                ) (");
            System.out.println("         _.' '._            _.' '._");
            System.out.println("        `\"\"\"\"\"\"\"`          `\"\"\"\"\"\"\"`");

            System.out.println("        DEU EMPATE!");
            System.out.println("      NINGUÉM FOI DERROTADO!");
        }
    }
}
