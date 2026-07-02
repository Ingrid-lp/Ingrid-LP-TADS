import java.util.Scanner;
import java.util.Random;

/*Implemente o jogo da velha utilizando matriz.
char jogo[][] = new char[3][3];
Permitir:
- Jogador X escolhe linha coluna
- Jogador O escolhe linha coluna
- Exibir tabuleiro
- Verificar vencedor
-Jogar contra máquina (dummy)
-Jogar contra máquina (xpert) */

public class JogoDaVelhaMaquinaMenu {
    public static char velha[][];
    public static Scanner teclado;
    public static int jogadas;
    public static Random aleatorio = new Random();

    public static void main(String[] args) 
    {
        velha = new char[3][3];
        teclado = new Scanner(System.in);
        int opcao;

        System.out.println("===== JOGO DA VELHA =====");
        System.out.println("1 - Jogador x Jogador");
        System.out.println("2 - Jogador x Máquina (Dummy)");
        System.out.println("3 - Jogador x Máquina (Expert)");
        System.out.print("Escolha uma opção: ");
        opcao = teclado.nextInt();

        switch(opcao)
        {
            case 1:
                jogarPvP();
                break;

            case 2:
                jogarDummy();
                break;

            case 3:
                jogarExpert();
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

    public static void jogar(char Player){
        int L,C;
        boolean repetir = true;
        do{
            System.out.printf("\n\n Jogador %c informe Linha e Coluna:",Player);
            L = teclado.nextInt();
            C = teclado.nextInt();
            if(L<3 && C<3){ // linha e coluna válida!
                if(velha[L][C]=='.'){
                    velha[L][C] = Player;
                    repetir = false;
                }
                else System.out.println("Jogada inválida, tente novamente...");
            }
            else System.out.println("Posição inválida (0 1 ou 2) tente novamente...");
        }while(repetir);
    }

    public static void zerarVelha(){
        int L,C;
        for(L=0; L<3; L++){
            for(C=0; C<3; C++){
                velha[L][C] ='.';
            }
        }
    }

    public static void imprimeVelha(){
        int L,C;
        for(L=0; L<3; L++){
            System.out.println(" ");
            for(C=0; C<3; C++){
                System.out.print(" "+velha[L][C]);
            }
        }
    }

    public static boolean verificaVencedor(char Player)
    {
        // Verifica as linhas
        for(int L = 0; L < 3; L++)
        {
            if(velha[L][0] == Player && velha[L][1] == Player && velha[L][2] == Player)
            {
                return true;
            }
        }

        for(int C = 0; C < 3; C++)
        {
            if(velha[0][C] == Player && velha[1][C] == Player && velha [2][C] == Player)
            {
                return true;
            }
        }

        // Diagonal principal
        if(velha[0][0] == Player &&
        velha[1][1] == Player &&
        velha[2][2] == Player)
        {
            return true;
        }

        // Diagonal secundária
        if(velha[0][2] == Player &&
        velha[1][1] == Player &&
        velha[2][0] == Player)
        {
            return true;
        }

        return false;
    }

    public static void jogarPvP()
    {
        char Player = 'X';

        zerarVelha();

        for(jogadas = 1; jogadas <= 9; jogadas++)
        {
            imprimeVelha();

            jogar(Player);

            if(verificaVencedor(Player))
            {
                imprimeVelha();
                System.out.println("\nJogador " + Player + " venceu!");
                return;
            }

            Player = (Player == 'X') ? 'O' : 'X';
        }

        imprimeVelha();
        System.out.println("\nDeu velha! Empate!");
    }

    public static void jogadaMaquinaDummy()
    {
        int L, C;

        do
        {
            L = aleatorio.nextInt(3);
            C = aleatorio.nextInt(3);

        } while(velha[L][C] != '.');

        velha[L][C] = 'O';

        System.out.println("\nMáquina jogou na posição: " + L + " " + C);
    }

    public static void jogadaMaquinaExpert()
    {
        int L, C;

        // 1 - Tenta vencer
        for(L = 0; L < 3; L++)
        {
            for(C = 0; C < 3; C++)
            {
                if(velha[L][C] == '.')
                {
                    velha[L][C] = 'O';

                    if(verificaVencedor('O'))
                    {
                        System.out.println("\nMáquina jogou na posição: " + L + " " + C);
                        return;
                    }

                    velha[L][C] = '.';
                }
            }
        }

        // 2 - Bloqueia o jogador
        for(L = 0; L < 3; L++)
        {
            for(C = 0; C < 3; C++)
            {
                if(velha[L][C] == '.')
                {
                    velha[L][C] = 'X';

                    if(verificaVencedor('X'))
                    {
                        velha[L][C] = 'O';
                        System.out.println("\nMáquina jogou na posição: " + L + " " + C);
                        return;
                    }

                    velha[L][C] = '.';
                }
            }
        }

        // 3 - Se não houver jogada estratégica, joga aleatoriamente
        jogadaMaquinaDummy();
    }

    public static void jogarDummy()
    {
        zerarVelha();

        for(jogadas = 1; jogadas <= 5; jogadas++)
        {
            imprimeVelha();

            jogar('X');

            if(verificaVencedor('X'))
            {
                imprimeVelha();
                System.out.println("\nVocê venceu!");
                return;
            }

            if(jogadas == 5)
                break;

            imprimeVelha();
            jogadaMaquinaDummy();

            if(verificaVencedor('O'))
            {
                imprimeVelha();
                System.out.println("\nA máquina venceu!");
                return;
            }
        }

        imprimeVelha();
        System.out.println("\nEmpate!");
    }

    public static void jogarExpert()
    {
        zerarVelha();

        for(jogadas = 1; jogadas <= 5; jogadas++)
        {
            imprimeVelha();

            jogar('X');

            if(verificaVencedor('X'))
            {
                imprimeVelha();
                System.out.println("\nVocê venceu!");
                return;
            }

            if(jogadas == 5)
                break;

            imprimeVelha();
            jogadaMaquinaExpert();

            if(verificaVencedor('O'))
            {
                imprimeVelha();
                System.out.println("\nA máquina venceu!");
                return;
            }
        }

        imprimeVelha();
        System.out.println("\nEmpate!");
    }
}
