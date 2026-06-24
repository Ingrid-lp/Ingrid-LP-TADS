import java.util.Scanner;
/*Crie uma matriz para armazenar as notas de 4 alunosem 6 matérias.
double notas[][] = new double[4][6];
Receba os valores pelo teclado.
Mostre:
- notas de cada aluno em cada matéria
- média de cada aluno
- Nota Média da escola (de todas as notas) */

public class ControleNotas
{
    public static Scanner teclado = new Scanner(System.in);
    public static int l = 0, c = 0;
    public static double somaA = 0, somaE = 0, mediaA = 0, mediaE = 0;
    static double notas[][] = new double[4][6];

    public static void main(String[] args)
    {
        setInformacoes();
        imprimeNotas();
        mediaAluno();
        mediaEscola();
    }

    public static void setInformacoes()
    {

        for(l = 0; l < 4; l++)
        {
            System.out.println("Informe as notas das 6 matérias do aluno " + (l + 1) + " : ");

            for (c = 0; c < 6; c++)
            {
                System.out.print("Matéria " + (c + 1) + ": ");
                notas[l][c] = teclado.nextDouble();
            }
        }
    }

    public static void imprimeNotas()
    {
        System.out.println("           Matéria 1  Matéria 2  Matéria 3  Matéria 4  Matéria 5  Matéria 6");

        /* OU!!
         * for (c = 0; c < 4; c++)
         * {
         * System.out.print("         Nota " + (c + 1));
         * }
         * System.out.println("\n");
         */

        for (l = 0; l < 4; l++) {

            System.out.print((l + 1) + " Aluno: ");

            for (c = 0; c < 6; c++) {

                System.out.print("        " + notas[l][c]);
            }

            System.out.println("\n");
        }
    }

    public static void mediaAluno()
    {
        for(l = 0; l < 4; l++)
        {
            somaA = 0;

            for(c = 0; c < 6; c++)
            {
                somaA += notas[l][c];
            }

            mediaA = somaA / 6;

            System.out.println("Aluno " + (l + 1) + " Média: " + mediaA);
        }
    }

    public static void mediaEscola()
    {
        somaE = 0;

        for(l = 0; l < 4; l++)
        {
            for(c = 0; c < 6; c++)
            {
                somaE += notas[l][c];
            }
        }

        mediaE = somaE / 24;

        System.out.println("Média da escola: " + mediaE);
    }
}
