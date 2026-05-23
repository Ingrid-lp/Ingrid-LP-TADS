import java.util.Scanner;

public class IdosoMenu 
{
    public static void main(String[] args) 
    {
        char op;

        imprimeBanner();

        do 
        {
            op = menuEscolha();

        }while(op!='g');
    }

    public static char menuEscolha() 
    {
        Scanner teclado = new Scanner(System.in);

        char opcao;

        System.out.println("a. verificar entrada em ônibus \n"+
                           "b. calcular meia entrada \n"+
                           "c. calcular prestação de consignado \n"+
                           "d. calcular sua renda anual \n"+
                           "e. desconto em farmácia \n"+
                           "f. posso emprestar dinheiro?\n"+
                           "g. encerrar programa");

        System.out.print("Digite sua opção:");

        opcao = teclado.next().charAt(0);

        switch (opcao) 
        {
            case 'a':

                System.out.println("Qual ano nasceu?");
                verificaOnibus(teclado.nextInt());
                imprimeOnibus();
                imprimeBanner();
                break;

            case 'b':

                System.out.println("Quantos anos você tem e qual o valor do ingresso? ");
                calculaEntrada(teclado.nextInt(), teclado.nextDouble());
                imprimeBanner();
                break;

            case 'c':
                
                System.out.println("Informe o valor, juros e a quantidade de parcelas do consignado: ");
                calculaConsig(teclado.nextDouble(), teclado.nextDouble(),teclado.nextInt());
                imprimeConsig();
                imprimeBanner();
                break;

            case 'd':
            
                System.out.println("Qual o valor do seu salário mensal?");
                calculaRenda(teclado.nextDouble());
                break;

            case 'e':
            
                System.out.println("Qual a sua idade, valor da compra e a porcentagem de desconto? ");
                calcFarmacia(teclado.nextInt(), teclado.nextDouble(), teclado.nextDouble());
                break;

            case 'f':
                
                System.out.println("Bora ver se você pode emprestar dinheiro!!");
                System.out.println("Informe o valor do seu salário mensal e o valor da parcela do consignado: ");
                verifica(teclado.nextDouble(), teclado.nextDouble());
                break;
            // faltam os outros cases
            default:

                System.out.println("* Obrigado e sigo à disposição! *");
                break;
        }
        return opcao;
    }

    public static void verificaOnibus(int AnoNasc)
    {
        int calc;

        calc = 2026 - AnoNasc;

        if (calc >= 65) {
            System.out.println("Você é idoso, pode entrar pela porta de trás do ônibus!");
        }

        else {
            System.out.println("Você não é idoso, entre pela porta da frente!");
        }
    }
    
    public static void calculaEntrada(int idade, double ingresso)
    {
        double calc;

        if (idade >= 65) {
            System.out.println("Você é idoso, você tem direito a meia entrada!");

            calc = ingresso / 2;

            System.out.println("O valor da sua meia entrada é: " + calc);

            System.out.println("====================================");
            System.out.println("||          INGRESSO              ||");
            System.out.println("====================================");
            System.out.println("|| EVENTO : BAILE DO VEIO         ||");
            System.out.println("|| ENTRADA: MEIA                  ||");
            System.out.println("|| STATUS : É VEIO                ||");
            System.out.println("====================================");
        }

        else {
            System.out.println("Você não é idoso, a sua entrada é inteira!");
            System.out.println("O valor da sua entrada é: " + ingresso);

            System.out.println("====================================");
            System.out.println("||          INGRESSO              ||");
            System.out.println("====================================");
            System.out.println("|| EVENTO : BAILE DO VEIO         ||");
            System.out.println("|| ENTRADA: INTEIRA               ||");
            System.out.println("|| STATUS : NÃO É VEIO            ||");
            System.out.println("====================================");
        }
    }
    
    public static void calculaConsig(double valor, double  juros, int parcelas)
    {
        double prestacao;

        prestacao = (valor + (valor * juros / 100)) / parcelas;

        System.out.println("O valor de cada prestação será de: " + prestacao);
    }

    public static double calculaRenda(double salario) 
    {
        double calc;

        calc = salario * 12 + salario;

        System.out.println("Sua renda anual contando com o 13º é de: " + calc);

        return calc;
    }

    public static double calcFarmacia(int idade, double valor, double desconto)
    {
        double calc;

        if (idade >= 65) {
            calc = valor - (valor * desconto / 100);

            System.out.println("Você é idoso! O valor final com o desconto final foi de: " + calc);
        }

        else {
            calc = valor;

            System.out.println("Você não é idoso! O valor final sem desconto é de: " + valor);
        }

        return calc;
    }

    public static boolean verifica(double salario, double  parcelas)
    {

        if (parcelas <= (salario * 35 / 100)) {
            System.out.println("Você pode emprestar!!");
            return true;
        }

        else {
            System.out.println("Você não pode emprestar!");
            return false;
        }

    }

    public static void imprimeBanner() 
    {
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         MENU DO VEIO         ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static void imprimeOnibus()
    {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      ________________________        ║");
        System.out.println("║  ___/|[][][][][][][][][][]|\\___      ║");
        System.out.println("║ | _   VEIO TRANSPORTES       _ |     ║");
        System.out.println("║ '=(_)----------------------(_)='     ║");
        System.out.println("╚══════════════════════════════════════╝");
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