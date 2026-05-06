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

            int tamanho = usuario.length();

            if (!usuario.equals(senha))
            {
                if(tamanho > 6)
                {
                    System.out.println("Usuário invalido! Sobraram letras, digite seu usuário de acesso de 6 letras: ");
                }
                
                else if(tamanho < 6)
                {
                    System.out.println("Usuário invalido! Faltaram letras, digite seu usuário de acesso de 6 letras: ");
                }    
            }

        } while (!usuario.equals(senha));
        
            System.out.println("bem vindo " + senha + "! Bora codar JAVA");
            
    }
}
