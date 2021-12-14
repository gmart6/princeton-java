public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        // create array of args
        int[] freqs = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            freqs[i] = Integer.parseInt(args[i + 1]);
        }

        // sum up total frequencies
        int sum = 0;
        for (int i = 0; i < freqs.length; i++) {
            sum += freqs[i];
        }

        // generate random int proportional to its probability
        for (int i = 0; i < m; i++) {
            int r = (int) (sum * Math.random());
            int rollingSum = 0;
            int event = -1;
            for (int j = 0; j < freqs.length && rollingSum <= r; j++) {
                rollingSum += freqs[j];
                event = j;
            }
            System.out.print(event + 1 + " ");
        }
        System.out.println();
    }
}
