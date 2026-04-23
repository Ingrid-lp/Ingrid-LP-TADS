import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        int secreto, limite;
        int chute = 0;

        System.out.println("Qual será o limite para sorteio?");
        limite = teclado.nextInt();

        secreto = ale.nextInt(limite);

        System.out.println("Digite um número: ");
        chute = teclado.nextInt();

        while(chute != secreto)
        {
            if (chute < secreto) {
                System.out.println("Chute muito baixo!");
                System.out.println("Tente outro chute: ");
                chute = teclado.nextInt();

            }

            else if (chute > secreto) {
                System.out.println("Chute muito alto!");
                System.out.println("Tente outro chute: ");
                chute = teclado.nextInt();
            }
        }
        
        System.out.println("Acertou!!!");
    }

}
