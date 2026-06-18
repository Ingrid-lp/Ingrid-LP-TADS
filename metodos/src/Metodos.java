import java.util.Scanner;
public class Metodos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double minhaMedia;
        System.out.println("Vejam meu banner");
        imprimeIFPR();
        /*
        verificaNumero(10); //chamada do procedimento com parâmetro
        verificaNumero(7);  //chamada do mesmo procedimento com parâmetro
        System.out.println("Diz um numero aí:");
        verificaNumero(teclado.nextInt()); //aqui o usuário informa um número
        divide(29, 3);
        System.out.println("Digite valor a dividir e divisor:");
        divide(teclado.nextInt(), teclado.nextInt()); 
        */
        System.out.println("Informe 3 notas para calcular media:");
        minhaMedia = media(teclado.nextDouble(), teclado.nextDouble(), teclado.nextDouble());
        System.out.println("Sua media:"+minhaMedia);
        System.out.println("Vejam de novo...");
        imprimeIFPR();
    }
    
    public static double media(double valor1, double valor2, double valor3){ //função que retorna valor com 3 parametros
        double m; // é o valor que eu vou retornar para a função principal
        m = (valor1+valor2+valor3)/3;
        return m; // só posso retornar 1 valor do mesmo tipo da função
    }
    public static void imprimeIFPR() { //procedimento sem parâmetro:
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░ ███  █████  ██████  ██████   ░");
        System.out.println("░  █   █      █    █  █    █   ░");
        System.out.println("░  █   ████   ██████  █████    ░");
        System.out.println("░  █   █      █       █   ██   ░");
        System.out.println("░ ███  █      █       █    █   ░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    }
        
    public static void verificaNumero(int numero) {// procedimento void com parâmetro
        if(numero % 2 == 0) { //numero é uma variavel interna recebida como parâmetro
            System.out.println(numero + " é PAR");
        } else {
            System.out.println(numero + " é ÍMPAR");
        }
    }

    public static void divide(int dividendo, int divisor) { // procedimento void com 2 parâmetros
        int quociente, resto;
        quociente = dividendo / divisor;
        resto = dividendo % divisor;
        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
        // aqui não tem return pq é só PROCEDIMENTO void
    }


}