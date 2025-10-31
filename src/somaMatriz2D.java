
public class somaMatriz2D {

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
        float [][] numeros12= {
            {4, 6, 8, 9},
            {1, 2, 3, 5}

        };
        // soma de duas matrizes
        int[][] matriz1 = {
            {1, 2, 3}, // Primeira linha
            {4, 5, 6}, // Segunda linha
            {7, 8, 9} // Terceira linha
        };
        int[][] matriz2 = {
            {1, 2, 3}, // Primeira linha
            {4, 5, 6}, // Segunda linha
            {7, 8, 9} // Terceira linha
        };
        int linhas = matriz1.length;
        int colunas = matriz2[0].length;
        int[][] matrizSoma = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];

                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static class Int {

        public Int() {
        }
    }

}
