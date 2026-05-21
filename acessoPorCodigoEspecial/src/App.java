import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        int senha;

        System.out.println("Abertura de porta eletrônica!");

        do {

            System.out.println("Informe 4 digitos para abrir a porta: ");
            senha = teclado.nextInt();

            if(senha < 1000 || senha > 9999)
            {
                System.out.println("Não liberado! use 4 digitos: ");
            }
            
            else if(senha == 1001 || senha == 2000 || senha == 4321)
            {
                System.out.println("Senha correta! Porta aberta");
                break;
            }

            else
            {
                System.out.println("Código inválido");
            }

        } while (true);

         
    }
}
