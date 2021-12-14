public class MatricesProduct {
    public static void main(String[] args) {
        double[][] a = new double[][];
        double[][] b = new double[][];

        int aRows = a.length;
        int aCols = a[0].length;
        int bRows = b.length;
        int bCols = b[0].length;

        if (aCols != bRows) System.out.println("Matrices cannot be multiplied");
        else {
            double[][] p = new double[aRows][bCols];

            for (int i = 0; i < aRows; i++) {
                for (int j = 0; j < bCols; j++) {
                    for (int k = 0; k < aCols; k++) {
                        p[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

        }
    }
}
