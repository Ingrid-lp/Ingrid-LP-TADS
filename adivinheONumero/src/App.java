import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        int secreto = 10;
        int chute = 0;

        System.out.println("Será que você consegue adivinhar o número que pensei?");

        while(chute != secreto)
        {
            System.out.println("Digite um número: ");
            chute = teclado.nextInt();

            if (chute < secreto) {
                System.out.println("Chute muito baixo!");
            }

            else if (chute > secreto) {
                System.out.println("Chute muito alto!");
            }
        }
        
        System.out.println("Acertou!!!");
    }
}
