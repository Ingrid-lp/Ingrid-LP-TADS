import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);
        
        double n1, n2, n3, n4, media;

        System.out.println("Informe as suas 4 notas bimestrais: ");

        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        n4 = teclado.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média foi: " + media);

        if(media >= 6.0)
        {
            System.out.println("Você está aprovado!");
        }

        else if(media >= 4.0 && media <= 5.9)
        {
            System.out.println("Você está em recuperação!");
        }

        else
        {
            System.out.println("Você está reprovado!");
        }
    }
}
