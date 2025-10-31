/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class SMatriz2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  float [][] numeros12= {
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
        int Nlinhas = matriz1.length;
        int Ncolunas = matriz2[0].length;
        // matrizSoma é um objeto que foi inicializado com a palavra de tamanho Nlinas e Ncolunas
        int[][] matrizSoma = new int[Nlinhas][Ncolunas];

        for (int i = 0; i < Nlinhas; i++) {
            for (int j = 0; j < Ncolunas; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
                //10*(i+1);
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
