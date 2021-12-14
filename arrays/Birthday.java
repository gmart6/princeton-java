public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] freqs = new int[n + 1];

        for (int i = 0; i < trials; i++) {
            boolean[] hasBday = new boolean[n];
            int people = 0;

            outerloop:
            while (true) {
                people++;
                int bday = (int) (n * Math.random());
                if (hasBday[bday]) break;
                hasBday[bday] = true;
            }
            freqs[people]++;
        }

        // output table
        double fraction = 0.0;
        for (int i = 0; fraction < 0.5; i++) {
            fraction += (double) freqs[i] / trials;
            System.out.println((i + 1) + "     " + freqs[i] + "     " + fraction);
//            if (i == 0) System.out.println((i + 1) + "     " + freqs[i] + "       " + fraction);
//            else if (freqs[i] < 10_000) System.out.println((i + 1) + "     " + freqs[i] + "    " + fraction);
//            else if (i )
        }
    }
}
