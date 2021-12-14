public class BinomialDistribution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double[][] a = new double[n + 1][];

        a[1] = new double[1 + 2];
        a[1][1] = 1.0;

        for (int i = 2; i <= n; i++) {
            a[i] = new double[i + 2];
            for (int k = 1; k < a[i].length - 1; k++) {
                a[i][k] = 0.5 * (a[i - 1][k - 1] + a[i - 1][k]);
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < a[i].length - 1; k++) {
                System.out.println(a[i][k] + " ");
            }
            System.out.println();
            
        }

    }
}
