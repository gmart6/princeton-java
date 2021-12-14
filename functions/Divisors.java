public class Divisors {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int tempA = a;

            a = b;
            b = (tempA % b);
        }

        return a;
    }

    public static int lcm(int a, int b) {
        return (int) (((1.0 / gcd(a, b)) * Math.abs(a)) * Math.abs(b));
    }

    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static int totient(int n) {
        int coprimes = 0;

        for (int i = 1; i <= n; i++) {
            if (areRelativelyPrime(i, n)) coprimes++;
        }

        return coprimes;
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        StdOut.println("gcd(" + num1 + ", " + num2 + ") = " + gcd(num1, num2));
        StdOut.println("lcm(" + num1 + ", " + num2 + ") = " + lcm(num1, num2));
        StdOut.println("areRelativelyPrime(" + num1 + ", " + num2 + ") = " + areRelativelyPrime(num1, num2));
        StdOut.println("totient(" + num1 + ") = " + totient(num1));
        StdOut.println("totient(" + num2 + ") = " + totient(num2));
    }
}
