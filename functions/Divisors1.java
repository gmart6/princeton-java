public class Divisors1 {
    public static int gcd(int a, int b) {
        int gcd = 0;
        int min = a;
        if (a > b) min = b;

        for (int i = 1; i < (min + 1) / 2; i++) {
            if (a % i == 0 && b % i == 0) gcd = i;
        }

        return gcd;
    }

    public static int lcm(int a, int b) {
        int min = a;
        int max = b;
        if (a > b) {
            max = a;
            min = b;
        }

        for (int i = 1; i < a * b; i++) {
            if ((min * i) % max == 0) {
                return min * i;
            }
        }
        return 0;
    }

    public static boolean areRelativelyPrime(int a, int b) {
        int min = a;
        if (a > b) min = b;

        for (int i = 2; i < (min + 1) / 2; i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int totient(int n) {
        if (n == 0) return 0;

        int coprimes = n - 1;

        for (int i = 2; i < n; i++) {
            for (int j = 2; j < (n + 1) / 2; j++) {
                if (i % j == 0 && n % j == 0) {
                    coprimes--;
                    break;
                }
            }
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
