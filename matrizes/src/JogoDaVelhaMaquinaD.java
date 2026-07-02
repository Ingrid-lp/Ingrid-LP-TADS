import java.util.Scanner;
import java.util.Random;

public class JogoDaVelhaMaquinaD {
    public static char velha[][];
    public static Scanner teclado;
    public static int jogadas;
    public static Random aleatorio = new Random();

    public static void main(String[] args) 
    {
        velha = new char[3][3];
        teclado = new Scanner(System.in);
        char Player = 'X';

        zerarVelha();

        for(jogadas = 1; jogadas <= 5; jogadas++)
        {
            imprimeVelha();

            jogar('X');

            imprimeVelha();

            if(verificaVencedor('X'))
            {
                //imprimeVelha();
                System.out.println("\nVocê venceu!");
                return;
            }

            if(jogadas == 5)
                break;

            jogarMaquina();

            if(verificaVencedor('O'))
            {
                //imprimeVelha();
                System.out.println("\nA máquina venceu!");
                return;
            }
        }

        System.out.println("\nDeu velha! Empate!");
        System.out.println("Game over!!!");
        imprimeVelha();
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

    public static void jogarMaquina()
    {
        int L, C;
        boolean existeCasaLivre = false;

        // Verifica se ainda há casas livres
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(velha[i][j] == '.')
                {
                    existeCasaLivre = true;
                }
            }
        }

        if(!existeCasaLivre)
        {
            return;
        }

        do
        {
            L = aleatorio.nextInt(3);
            C = aleatorio.nextInt(3);

        } while(velha[L][C] != '.');

        velha[L][C] = 'O';

        System.out.println("\nMáquina jogou na posição: " + L + " " + C);
    }
}
