import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        double consumoK, valorK, valorB, acrescimo;

        System.out.println("Qual o valor de consumo em kWh? ");
        valorK = teclado.nextDouble();

        System.out.println("Qual o seu consumo de energia? ");
        consumoK = teclado.nextDouble();

        valorB = consumoK * valorK;

        if (valorB <= 100) {
            System.out.println("O resultado do valor base é de: " + valorB + " Você não possui acréscimos!");
        }

        else if (valorB >= 101 && valorB <= 200) {
            acrescimo = valorB + (valorB * 0.10);

            System.out.println("O resultado do valor base é de: " + valorB
                    + " Você tem 10% de acréscimo no valor final que é igual a: " + acrescimo);
        }

        else {
            acrescimo = valorB + (valorB * 0.20);

            System.out.println("O resultado do valor base é de: " + valorB
                    + " Você tem 20% de acréscimo no valor final que é igual a: " + acrescimo);
        }
    }
}
