import java.util.Scanner;

public class IdosoConsignado
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        imprimeBanner();

        System.out.println("Bora fazer um consignado no precinho!!");
        System.out.println("Informe o valor, juros e a quantidade de parcelas do consignado: ");
        calculaConsig(teclado.nextDouble(), teclado.nextDouble(),teclado.nextInt());

        imprimeConsig();
    }

    public static void calculaConsig(double valor, double  juros, int parcelas)
    {
        double prestacao;

        prestacao = (valor + (valor * juros / 100)) / parcelas;

        System.out.println("O valor de cada prestação será de: " + prestacao);
    }

    public static void imprimeBanner() 
    {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║ ██    ██ ███████ ██  ████  ║");
        System.out.println("║ ██    ██ ██      ██ ██  ██ ║");
        System.out.println("║ ██    ██ █████   ██ ██  ██ ║");
        System.out.println("║  ██  ██  ██      ██ ██  ██ ║");
        System.out.println("║   ████   ███████ ██  ████  ║");
        System.out.println("╚════════════════════════════╝");
    }

    public static void imprimeConsig()
    {
        System.out.println("════════════════════════════════════");
        System.out.println("║          CONSIGNADO              ║");
        System.out.println("════════════════════════════════════");
        System.out.println("║ CLIENTE : VEIO                   ║");
        System.out.println("║ STATUS  : APROVADO               ║");
        System.out.println("║ PARCELA : DESCONTO NA FOLHA      ║");
        System.out.println("║ LIMITE  : ESTOURADO              ║");
        System.out.println("════════════════════════════════════");
    }
}

