public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);

        // set power to the largest power of k that is <= i
        int power = 1;
        while (power <= i / k) {
            power *= k;
        }

        // check for presence of powers of k in i, from largest to smallest
        while (power > 0) {

            // power is not present in n
            if (i < power) {
                System.out.print(0);
            }

            // power is present in n, so subtract power from n
            else {
                System.out.print(1);
                n -= power;
            }

            // next smallest power of 2
            power /= 2;
        }

        System.out.println();

    }


}

}
