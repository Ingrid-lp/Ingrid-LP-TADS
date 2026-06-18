public class App 
{
    static double [] nota;

    public static void main(String[] args) throws Exception 
    {
        nota = new double[100];

        nota[0] = 8.0;
        nota[1] = 7.5;
        nota[2] = 10.0;
        nota[3] = 6.0;
        nota[99] = (nota[0] + nota[1] + nota[2] + nota[3]);
        nota[98] = nota[99] / 4;

        System.out.println("A soma é: " + nota[99]);
        System.out.println("A média é: " + nota[98]);

        for(int i = 0; i < nota.length; i++)
        {
            System.out.println(nota[i]);
        }
    }
}
