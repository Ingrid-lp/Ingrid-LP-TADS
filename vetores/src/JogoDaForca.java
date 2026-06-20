import java.util.Scanner;

public class JogoDaForca 
{
    public static Scanner teclado = new Scanner(System.in);
    public static int vida = 5, opcao, encontrou = 0, faltam = 0, venceu = 0, jogarNovamente = 0;
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
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║            JOGO DA FORCA             ║");
        System.out.println("║              MUAHAHAHA!              ║");
        System.out.println("╚══════════════════════════════════════╝");

        do
        {
            vida = 5;
            venceu = 0;
            faltam = 0;
            encontrou = 0;

            System.out.print("Digite um número de 0 a 14 para sortear a palavra: ");
            opcao = teclado.nextInt();

            palavraForca = palavras[opcao];
            letras = palavraForca.toCharArray();

            exibicao = new char[letras.length];

            for(int i = 0; i < exibicao.length; i++)
            {
                exibicao[i] = '_';
            }

            do
            {
                desenhaForca();
                jogar();
            }
            while(vida > 0 && venceu == 0);

            if(venceu == 0)
            {
                desenhaForca();
            }

            jogarNovamente();

        }
        while(jogarNovamente != 2);
    }

    public static void jogar()
    {
        encontrou = 0;

        System.out.print("Digite uma letra: ");
        tentativa = teclado.next().charAt(0);

        for(int i = 0; i < letras.length; i++)
        {
            if(letras[i] == tentativa)
            {
                exibicao[i] = tentativa;
                encontrou = 1;
            }
        }

        System.out.println();

        if(encontrou == 0)
        {
            vida--;
            System.out.println("¡Ay caramba! Você perdeu uma vida!");
        }

        for(int i = 0; i < exibicao.length; i++)
        {
            System.out.print(exibicao[i] + " ");
        }
        System.out.println(); 

        faltam = 0;

        for(int i = 0; i < exibicao.length; i++)
        {
            if(exibicao[i] == '_')
            {
                faltam++;
            }
        }

        if(faltam == 0)
        {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║              PARABÉNS!               ║");
            System.out.println("║             VOCÊ VENCEU!             ║");
            System.out.println("║                                      ║");
            System.out.println("║                  \\o/                 ║");
            System.out.println("║                   |                  ║");
            System.out.println("║                  / \\                 ║");
            System.out.println("║                                      ║");
            System.out.println("║    Você escapou da forca!            ║");
            System.out.print("║     A parlavra é: "); System.out.println(palavraForca + "             ║");
            System.out.println("║                                      ║");
            System.out.println("║          CAMPEÃO !!!!                ║");
            System.out.println("╚══════════════════════════════════════╝");
            venceu = 1;
        }

    }

    public static void desenhaForca()
    {
        System.out.println("Vida atual: " + vida);

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
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║              GAME OVER               ║");
                System.out.println("║          VOCÊ FOI ENFORCADO!         ║");
                System.out.println("║                                      ║");
                System.out.println("║                  O                   ║");
                System.out.println("║                 /|\\                  ║");
                System.out.println("║                 / \\                  ║");
                System.out.println("║                                      ║");
                System.out.println("║      Suas vidas acabaram...          ║");
                System.out.print  ("║     A palavra era: ");
                System.out.println(palavraForca + "            ║");
                System.out.println("║                                      ║");
                System.out.println("║          TENTE NOVAMENTE!            ║");
                System.out.println("╚══════════════════════════════════════╝");
                break;
        }
    }

    public static void jogarNovamente() // não foi o melhor, fiz na pressa pra ir ver o jogo do Brasil ksksks
    {
        System.out.println("Quer jogar novamente? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        jogarNovamente = teclado.nextInt();

        switch (jogarNovamente) {
            case 1:
                System.out.println("Nova partida");
                break;
            
            case 2:
                System.out.println("Até a próxima");
                break;

            default:
                System.out.println("Opção inválida!!!"); // aqui o programa só vai para mesmo
                break;
        }
    }
}