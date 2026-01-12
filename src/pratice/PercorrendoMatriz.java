package pratice;

public class PercorrendoMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < matriz.length; i++) { // linhas
            for (int j = 0; j < matriz[i].length; j++) { // colunas
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}
