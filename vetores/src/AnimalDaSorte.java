import java.util.Scanner;

/*Em JAVA, é possível criar um vetor (array) do tipo String (que é um vetor de
caracteres)! Exemplo: Um usuário deseja dica de animal da sorte do dia, ele
digita um número de 0 a 9 para saber qual o bicho da sorte: */

public class AnimalDaSorte 
{   
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) 
    {
        String[] animais = 
        {
            "cavalo", "macaco", "jacaré", "coelho", "gavião",
            "coruja", "pombo", "lagarto", "camelo", "falcão"
        };
        
        System.out.print("Digite um número de 0 a 9: ");
        int numero = teclado.nextInt();

        String animalSorte = animais[numero];

        System.out.println("O animal da sorte de hoje é: " + animalSorte);
        System.out.println("3 letra da palavra: " + animalSorte.charAt(2));
    }    
}
