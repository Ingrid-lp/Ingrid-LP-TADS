import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        String usuario;
        int valor, troco, pago;
        int total = 0;

        System.out.println("Olá bem vindo a Bodega!");

        System.out.println("Qual o seu nome? ");
        usuario = teclado.nextLine();

        limparTela();

        System.out.println("Cliente " + usuario);
        System.out.println("Digite os valores gastos na bodega: ");

        do {

            valor = teclado.nextInt();

            if (valor != 0) {
                total = total + valor;
            }

        } while (valor != 0);


        System.out.println("Valor gasto: " + total + " reais");
        System.out.println("Valor pago: ");
        pago = teclado.nextInt();

        if (pago < total) 
        {
            System.out.println("Valor insuficiente! Faltam " + (total - pago) + " reais");
        }

        else 
        {
            troco = pago - total;
            System.out.println("Troco: " + troco + " reais");
        }

    }
    
    //peguei essa ideia na internet
    public static void limparTela() 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
