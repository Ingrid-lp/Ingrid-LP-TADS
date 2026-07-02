import java.util.Scanner;
import java.util.Random;

public class DummyVsExpert {

    static char[][] velha = new char[3][3];
    static Random aleatorio = new Random();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)
    {
        zerarVelha();

        System.out.println("===== DUMMY x EXPERT =====");

        for(int jogada = 1; jogada <= 9; jogada++)
        {
            imprimeVelha();

            System.out.println("\nPressione ENTER para a Dummy jogar...");
            teclado.nextLine();

            jogadaDummy();

            if(verificaVencedor('X'))
            {
                imprimeVelha();
                System.out.println("\nDummy venceu!");
                return;
            }

            if(tabuleiroCheio())
                break;

            imprimeVelha();

            System.out.println("\nPressione ENTER para a Expert jogar...");
            teclado.nextLine();

            jogadaExpert();

            if(verificaVencedor('O'))
            {
                imprimeVelha();
                System.out.println("\nExpert venceu!");
                return;
            }

            if(tabuleiroCheio())
                break;
        }

        imprimeVelha();
        System.out.println("\nEmpate!");
    }

    public static void zerarVelha()
    {
        for(int L=0;L<3;L++)
        {
            for(int C=0;C<3;C++)
            {
                velha[L][C]='.';
            }
        }
    }

    public static void imprimeVelha()
    {
        System.out.println();

        for(int L=0;L<3;L++)
        {
            for(int C=0;C<3;C++)
            {
                System.out.print(" "+velha[L][C]);
            }
            System.out.println();
        }
    }

        public static boolean verificaVencedor(char jogador)
    {
        // Linhas
        for(int L = 0; L < 3; L++)
        {
            if(velha[L][0] == jogador &&
               velha[L][1] == jogador &&
               velha[L][2] == jogador)
            {
                return true;
            }
        }

        // Colunas
        for(int C = 0; C < 3; C++)
        {
            if(velha[0][C] == jogador &&
               velha[1][C] == jogador &&
               velha[2][C] == jogador)
            {
                return true;
            }
        }

        // Diagonal principal
        if(velha[0][0] == jogador &&
           velha[1][1] == jogador &&
           velha[2][2] == jogador)
        {
            return true;
        }

        // Diagonal secundária
        if(velha[0][2] == jogador &&
           velha[1][1] == jogador &&
           velha[2][0] == jogador)
        {
            return true;
        }

        return false;
    }

    public static boolean tabuleiroCheio()
    {
        for(int L = 0; L < 3; L++)
        {
            for(int C = 0; C < 3; C++)
            {
                if(velha[L][C] == '.')
                {
                    return false;
                }
            }
        }

        return true;
    }

    // Máquina Dummy
    public static void jogadaDummy()
    {
        int L, C;

        do
        {
            L = aleatorio.nextInt(3);
            C = aleatorio.nextInt(3);

        }while(velha[L][C] != '.');

        velha[L][C] = 'X';

        System.out.println("Dummy jogou em (" + L + "," + C + ")");
    }

        // Máquina Expert
    public static void jogadaExpert()
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
                        System.out.println("Expert jogou em (" + L + "," + C + ")");
                        return;
                    }

                    velha[L][C] = '.';
                }
            }
        }

        // 2 - Tenta bloquear a Dummy
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
                        System.out.println("Expert jogou em (" + L + "," + C + ")");
                        return;
                    }

                    velha[L][C] = '.';
                }
            }
        }

        // 3 - Centro
        if(velha[1][1] == '.')
        {
            velha[1][1] = 'O';
            System.out.println("Expert jogou em (1,1)");
            return;
        }

        // 4 - Cantos
        int[][] cantos =
        {
            {0,0},
            {0,2},
            {2,0},
            {2,2}
        };

        for(int i = 0; i < cantos.length; i++)
        {
            L = cantos[i][0];
            C = cantos[i][1];

            if(velha[L][C] == '.')
            {
                velha[L][C] = 'O';
                System.out.println("Expert jogou em (" + L + "," + C + ")");
                return;
            }
        }

        // 5 - Qualquer posição livre
        do
        {
            L = aleatorio.nextInt(3);
            C = aleatorio.nextInt(3);

        } while(velha[L][C] != '.');

        velha[L][C] = 'O';

        System.out.println("Expert jogou em (" + L + "," + C + ")");
    }

}