import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int valor, tabu;

        System.out.println("Infome um valor para multiplicarmos: ");
        valor = teclado.nextInt();

        for (int div = 1; div <= 10; div++)
        {
            tabu = valor * div;
            System.out.println(tabu);
        }
    }
}