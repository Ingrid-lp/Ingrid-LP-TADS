import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        String senha, login;
        String senha1, login1;

        System.out.println("Olá Dev! Bora criar um usuário?");
        System.out.println("Qual será o seu login?");
        login = teclado.nextLine();

        System.out.println("E a sua senha?");
        senha = teclado.nextLine();

        limparTela();

        do {

            System.out.println("Olá! Digite seu login para entrar no sistema: ");
            login1 = teclado.nextLine();

            System.out.println("Agora digite a sua senha: ");
            senha1 = teclado.nextLine();

           
            if(!login.equals(login1) || !senha.equals(senha1))
            {
                System.out.println("Você não conseguiu entrar no sistema!");      
            }
            

            else
            {
                System.out.println("Parabéns você entrou no sistema!");
            }

        } while (!login.equals(login1) || !senha.equals(senha1));

    }
    




    public static void limparTela() 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
