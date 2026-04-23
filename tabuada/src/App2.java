import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor, tabu;

        System.out.println("Infome um valor para multiplicarmos: ");
        valor = teclado.nextInt();

        System.out.println("Tabuada do número " + valor);

        for (int div = 0; div <= 10; div++) {
            tabu = valor * div;
            System.out.println(valor + " X " + div + " = " + tabu);
        }
    }
}