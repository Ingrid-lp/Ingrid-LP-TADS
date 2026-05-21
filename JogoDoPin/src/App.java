import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int num, mult, result;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual múltiplo você deseja?");
        mult = teclado.nextInt();

        for (num = 1; num <= 40; num++)
        {

            if (num % mult == 0)
            {
                System.out.print(" PIN, ");
            }

            else if(num % mult != 0)
            {
                System.out.print(" " + num + ", ");
            }

        }

    }
}