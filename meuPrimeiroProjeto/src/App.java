import java.util.Scanner; // dispositivo de entrada (teclado)
import java.io.PrintStream; // dispositivo de saida (video)

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in); // instalando o teclado
        PrintStream video = new PrintStream(System.out); // instalando o video
        String nome;

        video.println("Ola Dev! Vamos codar?");
        video.println("Qual o seu nome? ");
        nome = teclado.next(); // faz a leitura do valor informado pelo usuário

        video.println("Bem vinda, " + nome);
    }
}
