/**
 * App class.
 */
public final class MainHelper {

    private MainHelper() {
    }

    /**
     * Retorna a quantidade de dígitos presente no inteiro.
     *
     * @param n o inteiro
     * @return a quantidade de dígitos
     */

    public static int contaDigitos(int n) {
        int count = 0;
        if (n == 0) {
            count++;
        }
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    /**
     * Retorna um array contendo os maximos das colunas da matriz.
     *
     * @param v a matriz
     * @return o array de maximos
     */
    public static int[] maximosColunas(int[][] v) {
        int[] result = new int[v[0].length];
        for (int column = 0; column < v[0].length; column++) {
            int max = v[0][column];
            // for (int element : v[column]) {
            //     if (element > max) {
            //         max = element;
            //     }
            // }
            for (int row = 0; row < v.length; row++) {
                if (v[row][column] > max) {
                    max = v[row][column];
                }
            }
            result[column] = max;
        }
        return result;
    }
}
