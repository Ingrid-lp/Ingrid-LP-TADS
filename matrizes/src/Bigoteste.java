import java.util.Scanner;
import java.util.Random;

public class Bigoteste
{
    public static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();
    public static int l = 0, c = 0, num = 0, encontrou = 0, marcado = 0, verifical = 0, verificac = 0, premio1 = 0, premio2 = 0, premio3 = 0;
    static int bigo[][] = new int[4][4];

    public static void main(String[] args)
    {
        System.out.println("Bem vindo ao Bigo!!");

        imprimeBigo();
        mostraCartela();

        do
        {
            setInformacoes();
            verifica();
            mostraCartela();
            numerosMarcados();
            verificaLinha();
            verificaColuna();

        } while(premio1 == 0 || premio2 == 0 || premio3 == 0);

    }

    public static void imprimeBigo()
    {
        for(l = 0; l < 4; l++)
        {
            for(c = 0; c < 4; c++)
            {
                int numero;

                do
                {
                    numero = aleatorio.nextInt(99) + 1;
                }
                while(existeNumero(numero));

                bigo[l][c] = numero;
            }
        }
    }

    public static boolean existeNumero(int numero)
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(bigo[i][j] == numero)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static void mostraCartela()
    {
        for(l = 0; l < 4; l++)
        {
            for(c = 0; c < 4; c++)
            {
                if(bigo[l][c] == 0)
                {
                    System.out.print("X\t");
                }

                else
                {
                    System.out.print(bigo[l][c] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void setInformacoes()
    {
        System.out.println("Informe um número aleatório: ");
        num = teclado.nextInt();
    }

    public static void verifica()
    {
        encontrou = 0;

        for(l = 0; l < 4; l++)
        {
            for(c = 0; c < 4; c++)
            {
                if(bigo[l][c] == num)
                {
                    encontrou = 1;
                    bigo[l][c] = 0; // marca a posição

                    System.out.println("Número encontrado!");
                }
            }
        }

        if(encontrou == 0)
        {
            System.out.println("Número não encontrado!");
        }
    }

    public static void numerosMarcados()
    {
        marcado = 0;

        for(l = 0; l < 4; l++)
        {
            for(c = 0; c < 4; c++)
            {
                if(bigo[l][c] == 0)
                {
                    marcado++;
                }
            }
        }

        System.out.println("Quantidade de números marcados: " + marcado);

        if(marcado >= 5 && premio1 == 0)
        {
            System.out.println("PRIMEIRO PRÊMIO!");
            premio1 = 1;
        }
    }

    public static void verificaLinha()
    {

        for(l = 0; l < 4; l++)
        {
            verifical = 0;

            for(c = 0; c < 4; c++)
            {
                if(bigo[l][c] == 0)
                {
                    verifical ++;
                }
            }

            if(verifical == 4 && premio2 == 0)
            {
                System.out.println("SEGUNDO PRÊMIO!");
                System.out.println("Linha " + (l + 1) + " completa!");
                premio2 = 1;
            }
        }
    }

    public static void verificaColuna()
    {
        for(c = 0; c < 4; c++)
        {
            verificac = 0;

            for(l = 0; l < 4; l++)
            {
                if(bigo[l][c] == 0)
                {
                    verificac ++;
                }
            }

            if(verificac == 4 && premio3 == 0)
            {
                System.out.println("TERCEIRO PRÊMIO!");
                System.out.println("Coluna " + (c + 1) + " completa!");
                premio3 = 1;
            }


        }
    }
}
