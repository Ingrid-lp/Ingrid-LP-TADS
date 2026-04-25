import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);
        
        String senha = "devjava";
        String usuario;

        do {
            System.out.println("Digite seu usuário de acesso de 6 letras: ");
            usuario = teclado.nextLine();

            if (!usuario.equals(senha))
            {
                System.out.println("Usuário invalido! Digite seu usuário de acesso de 6 letras: ");
                usuario = teclado.nextLine();
            }

        } while (!usuario.equals(senha));
        
            System.out.println("bem vindo " + senha + "! Bora codar JAVA");
            
    }
}
