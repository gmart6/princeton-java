public class Ramanujan {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int max = (int) Math.round(Math.cbrt(n)) + 1;

        for (int a = 1; a <= max; a++) {
            for (int b = a; b <= max; b++) {
                if (b == a) continue;
                for (int c = a + 1; c <= max; c++) {
                    if (c == b || c == a) continue;
                    for (int d = c; d <= max; d++) {
                        if (d == c || d == b || d == a) continue;
                        if (Math.pow(d, 3) + Math.pow(c, 3) > n) break;

                        double sum = Math.pow(a, 3) + Math.pow(b, 3);

                        if (sum == Math.pow(c, 3) + Math.pow(d, 3)) {
                            System.out.println((int) sum);
                            System.out.println(a + " " + b + " " + c + " " + d + " ");
                        }
                    }
                }
            }
        }

    }
}
