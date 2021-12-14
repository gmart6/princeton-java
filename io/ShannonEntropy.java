public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int counter = 0;

        // populate array with frequencies of the integers
        int[] arr = new int[m + 1];
        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            arr[i]++;
            counter++;
        }

        double shanEnt = 0.0;

        for (int i = 1; i <= m; i++) {
            if (arr[i] == 0) continue;

            double p = 1.0 * arr[i] / counter;

            shanEnt += -p * Math.log(p) / Math.log(2);
        }

        StdOut.printf("%5.4f \n", shanEnt);

    }
}
