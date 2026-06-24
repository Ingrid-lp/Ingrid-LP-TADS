import java.util.Scanner;

/*Crie uma matriz para ler a idade e o salário de 3 funcionários da empresa:
• O usuário irá informar todos os dados pelo teclado.
• int funcionario[][] = new int[3][2];
• Imprima idade e salário de cada um .
Exemplo de saída:
• Funcionário 1: 28 anos recebe R$1500
• Funcionário 2: 35 anos recebe R$3200
• Funcionário 3: 30 anos recebe R$3333 */

public class MatrizFuncionario 
{
    public static Scanner teclado = new Scanner(System.in);
    static int funcionario[][] = new int[3][2];

    public static void main(String[] args) 
    {
        System.out.println("*** Programa Empresa IngridSoft! ***");

        setInformacoes();

        getInformacoes();
    }

    public static void setInformacoes()
    {
        System.out.println("Informe as 3 idades dos funcionários: ");
        for (int i = 0; i < 3; i++) 
        {
            funcionario[i][0] = teclado.nextInt();
        }

        System.out.println("Informe o salário dos 3 funcionários: ");
        for (int i = 0; i < 3; i++) 
        {
            funcionario[i][1] = teclado.nextInt();
        }
    }

    public static void getInformacoes()
    {
        for (int l = 0; l < 3; l++) 
        {
            System.out.print("Funcionário " + (l + 1) + ": ");
            System.out.print(funcionario[l][0] + " anos" + " ");
            System.out.print("recebe R$" + funcionario[l][1]);
            System.out.println();
        }
    }
}
