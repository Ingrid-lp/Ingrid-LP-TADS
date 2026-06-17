import java.util.Scanner;

public class JogoDaForca 
{
    public static Scanner teclado = new Scanner(System.in);
    public static int vida = 5, opcao;
    public static String palavraForca;
    public static char tentativa;
    public static char[] letras;
    public static char[] exibicao;
    static String[] palavras = 
    {
    "banana", "escola", "janela", "camisa", "tigela",
    "tomate", "caneta", "parede", "futsal", "musica",
    "bolhas", "morada", "gatuno", "pipoca", "boneca"
    };

    public static void main(String[] args) 
    {
        System.out.println("O jogo da forca MUAHAHAH!");

        System.out.print("Digite um número de 0 a 14 para sortear a palavra: ");
        opcao = teclado.nextInt();

        palavraForca = palavras[opcao];
        letras = palavraForca.toCharArray();

        exibicao = new char[letras.length];

        for(int i = 0; i < exibicao.length; i++)
        {
            exibicao[i] = '_';
            System.out.print(exibicao[i] + " ");
        }

        System.out.println();

        desenhaForca();
    }

    public static void desenhaForca()
    {
        switch(vida)
        {
            case 5:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;

            case 4:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;
            
            case 3:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;
            
            case 2:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;

            case 1:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("=======");
                break;

            case 0:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("     |");
                System.out.println("=======");
                System.out.println("GAME OVER!");
                break;
        }
    }
}