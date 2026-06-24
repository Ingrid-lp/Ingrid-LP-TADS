import java.util.Scanner;
/*Crie uma matriz para armazenar a
quantidade de peças produzidas por 2
máquinas durante os 5 dias úteis da
semana:
(seg, ter, qua, qui e sex).
Utilize a estrutura:
int producao[][] = new int[2][5];
O usuário deverá informar todas as
quantidades produzidas pelo teclado.
Ao final, o programa deverá mostrar:
•Quantidade produzida por dia de cada
máquina;
•Quantidade total produzida por dia na
fábrica (somando as duas máquinas);
•Média de produção semanal de cada
máquina;
•Maior produção registrada e em qual
máquina e dia da semana ocorreu.
Exemplo de entrada Saída
Máquina 1:
100
120
90
110
130
Máquina 2:
80
95
100
120
105
Produção Máquina 1:
Seg: 100
Ter: 120
Qua: 90
Qui: 110
Sex: 130
Produção Máquina 2:
Seg: 80
Ter: 95
Qua: 100
Qui: 120
Sex: 105
Produção total da fábrica por dia:
Seg: 180 peças
Ter: 215 peças
Qua: 190 peças
Qui: 230 peças
Sex: 235 peças
Média semanal:
Máquina 1: 110 peças/diaMáquina 2: 100 peças/dia
Maior produção registrada:
130 peças
Máquina: 1
Dia: Sex */

public class ControleProducao
{
    public static Scanner teclado = new Scanner(System.in);
    public static int l = 0, c = 0, somaD = 0, media = 0, maior = 0, maquina = 0, dia = 0;
    static int producao[][] = new int[2][5];
    static String dias[] = {"Seg", "Ter", "Qua", "Qui", "Sex"};

    public static void main(String[] args)
    {
        setInforcacoes();
        imprimeProducao();
        somaDia();
        mediaSemanal();
        maiorProducao();
    }

    public static void setInforcacoes()
    {
        for(l = 0; l < 2; l++)
        {
            System.out.println("Máquina " + (l + 1) + " : ");

            for (c = 0; c < 5; c++)
            {
                producao[l][c] = teclado.nextInt();
            }
        }
    }

    public static void imprimeProducao()
    {
        for (l = 0; l < 2; l++)
        {

            System.out.print("Produção Máquina " + (l + 1) + ": ");

            for (c = 0; c < 5; c++)
            {

                System.out.print("\n" + dias[c] + ": " + producao[l][c] + " peças");
            }

            System.out.println("\n");
        }
    }

    public static void somaDia()
    {
        System.out.println("Produção total da fábrica por dia");

        for(c = 0; c < 5; c++)
        {
            somaD = 0;

            for(l = 0; l < 2; l++)
            {
                somaD += producao[l][c];
            }

            System.out.println(dias[c] + ": " + somaD + " peças");
        }
    }

    public static void mediaSemanal()
    {
        System.out.println("\nMédia semanal");

        for(l = 0; l < 2; l++)
        {
            somaD = 0;

            for(c = 0; c < 5; c++)
            {
                somaD += producao[l][c];
            }
            media = somaD / 5;
            System.out.print("Máquina " + (l + 1) + ": " + media + " peças " +" \n");
        }

    }

    public static void maiorProducao()
    {
        maior = producao[0][0];

        for(l = 0; l < 2; l++)
        {
            for(c = 0; c < 5; c++)
            {
                if(producao[l][c] > maior)
                {
                    maior = producao[l][c];
                    maquina = l;
                    dia = c;
                }
            }
        }

        System.out.println("\nMaior produção registrada:");
        System.out.println(maior + " peças");
        System.out.println("Máquina: " + (maquina + 1));
        System.out.println("Dia: " + dias[dia]);
    }
}
