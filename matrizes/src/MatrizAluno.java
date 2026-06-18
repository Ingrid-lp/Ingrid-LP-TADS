public class MatrizAluno {
    static int[][] notas;

    public static void main(String[] args) throws Exception {
        notas = new int[][] {
                { 2, 8, 9, 7 },
                { 9, 9, 6, 9 },
                { 8, 7, 8, 4 }
        };

        // System.out.println(notas[2][1]);

        imprimeNotas();
    }

    static void imprimeNotas() {
        int l, c;

        System.out.println("           Nota 1 Nota 2 Nota 3 Nota 4");

        /* OU!!
         * for (c = 0; c < 4; c++)
         * {
         * System.out.print("         Nota " + (c + 1));
         * }
         * System.out.println("\n");
         */

        for (l = 0; l < 3; l++) {

            System.out.print((l + 1) + " Aluno: ");

            for (c = 0; c < 4; c++) {

                System.out.print("     " + notas[l][c]);
            }

            System.out.println("\n");
        }
    }
}