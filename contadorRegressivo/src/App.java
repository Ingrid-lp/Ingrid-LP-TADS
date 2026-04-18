import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro: ");
        num = teclado.nextInt();

        while(num >= 0)
        {
            System.out.println(" " + num);
            num = num - 1;
        }

        System.out.println("Fim!");
    }
}
