public class CountingPrimes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int counter = 0;

        for (int i = 1; i <= n; i += 2) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) counter++;
        }

        System.out.println(counter);
    }
}
