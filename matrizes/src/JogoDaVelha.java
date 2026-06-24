import java.util.Scanner;

public class JogoDaVelha 
{
    public static Scanner teclado = new Scanner(System.in);
    public static char velha[][];

    public static void main(String[] args) 
    {
        velha = new char[3][3];

        zerarVelha();
        imprimeVelha();
    }

    public static void zerarVelha()
    {
        int L, C;

        for (L = 0; L < 3; L++) {
            for (C = 0; C < 3; C++) {
                velha[L][C] = '.';
            }
        }
    }

    public static void imprimeVelha()
    {
        int L, C;

        for (L = 0; L < 3; L++)
        {
            for(C = 0; C < 3; C++)
            {

            }
        }
    }
}